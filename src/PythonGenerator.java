import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
import java.util.Map;

public class PythonGenerator {

    private final List<String> lines = new ArrayList<>();
    private final Map<String, String> variableTypes = new HashMap<>();

    public String generate(SafeLangParser.ProgramContext program) {
        lines.clear();

        lines.add("# Generated Python code from SafeLang");
        lines.add("");

        for (SafeLangParser.StatementContext stmt : program.statement()) {
            generateStatement(stmt);
        }

        return String.join("\n", lines) + "\n";
    }

    private void generateStatement(SafeLangParser.StatementContext stmt) {
        if (stmt.useStmt() != null) {
            lines.add("# use " + stmt.useStmt().STRING_LITERAL().getText());
        }
        else if (stmt.typeDef() != null) {
            generateTypeDef(stmt.typeDef());
        }
        else if (stmt.unitDef() != null) {
            generateUnitDef(stmt.unitDef());
        }
        else if (stmt.prefixDef() != null) {
            generatePrefixDef(stmt.prefixDef());
        }
        else if (stmt.varDecl() != null) {
            generateVarDecl(stmt.varDecl());
        }
        else if (stmt.varDeclAssign() != null) {
            generateVarDeclAssign(stmt.varDeclAssign());
        }
        else if (stmt.assignment() != null) {
            generateAssignment(stmt.assignment());
        }
        else if (stmt.writeStmt() != null) {
            generateWrite(stmt.writeStmt());
        }
        else if (stmt.writelnStmt() != null) {
            generateWriteln(stmt.writelnStmt());
        }
        else if (stmt.tryStmt() != null) {
            generateTry(stmt.tryStmt());
        }
        else if (stmt.retryStmt() != null) {
            generateRetry(stmt.retryStmt());
        }
    }

    private void generateTypeDef(SafeLangParser.TypeDefContext ctx) {
        // Exemplo SafeLang:
        // type Length [meter,m]: real;
        //
        // Em Python, para permitir usar "meter" em expressões,
        // criamos meter = 1.0 e m = meter.
        if (ctx.unitSpec() != null) {
            List<TerminalNode> ids = ctx.unitSpec().ID();

            String mainUnit = pyName(ids.get(0).getText());
            lines.add(mainUnit + " = 1.0");

            if (ids.size() > 1) {
                String alias = pyName(ids.get(1).getText());
                lines.add(alias + " = " + mainUnit);
            }
        }
        else {
            String typeName = ctx.ID().getText();
            String numeric = ctx.numericType().getText();

            if (numeric.equals("integer[8]")) {
                lines.add("def " + pyName(typeName) + "(value):");
                lines.add("    value = int(value)");
                lines.add("    if value < -128 or value > 127:");
                lines.add("        raise OverflowError(\"" + pyName(typeName) + " overflow\")");
                lines.add("    return value");
            }
            else if (numeric.equals("integer[32]")) {
                lines.add("def " + pyName(typeName) + "(value):");
                lines.add("    value = int(value)");
                lines.add("    if value < -2147483648 or value > 2147483647:");
                lines.add("        raise OverflowError(\"" + pyName(typeName) + " overflow\")");
                lines.add("    return value");
            }
            else if (numeric.equals("real[64]")) {
                lines.add("def " + pyName(typeName) + "(value):");
                lines.add("    return float(value)");
            }
            else {
                lines.add("# type " + pyName(typeName));
            }
        }
    }

    private void generateUnitDef(SafeLangParser.UnitDefContext ctx) {
        // Exemplo SafeLang:
        // unit Length [inch,in] := 0.0254 * meter;
        //
        // Em Python:
        // inch = 0.0254 * meter
        // in = inch

        List<TerminalNode> ids = ctx.unitSpec().ID();
        String mainUnit = pyName(ids.get(0).getText());
        String expr = generateExpr(ctx.expr());

        lines.add(mainUnit + " = " + expr);

        if (ids.size() > 1) {
            String alias = pyName(ids.get(1).getText());
            lines.add(alias + " = " + mainUnit);
        }
    }

    private void generatePrefixDef(SafeLangParser.PrefixDefContext ctx) {
        // Exemplo:
        // prefix k := 1e3: real;
        String name = pyName(ctx.ID().getText());
        String value = generateExpr(ctx.expr());
        lines.add(name + " = " + value);
    }

    private void generateVarDecl(SafeLangParser.VarDeclContext ctx) {
        String name = pyName(ctx.ID().getText());
        String type = ctx.typeRef().getText();

        variableTypes.put(name, type);

        lines.add(name + " = None");
    }

    private void generateVarDeclAssign(SafeLangParser.VarDeclAssignContext ctx) {
        String name = pyName(ctx.ID().getText());
        String type = ctx.typeRef().getText();

        variableTypes.put(name, type);

        String value = generateExpr(ctx.expr());
        value = wrapWithType(value, type);

        lines.add(name + " = " + value);
    }

    private void generateAssignment(SafeLangParser.AssignmentContext ctx) {
        String name = pyName(ctx.ID().getText());
        String value = generateExpr(ctx.expr());

        String type = variableTypes.get(name);
        value = wrapWithType(value, type);

        lines.add(name + " = " + value);
    }

    private void generateWrite(SafeLangParser.WriteStmtContext ctx) {
        String args = generateExprList(ctx.exprList());

        if (args.isEmpty()) {
            lines.add("print(end=\"\")");
        } else {
            lines.add("print(" + args + ", sep=\"\", end=\"\")");
        }
    }

    private void generateWriteln(SafeLangParser.WritelnStmtContext ctx) {
        if (ctx.exprList() == null) {
            lines.add("print()");
        } else {
            String args = generateExprList(ctx.exprList());
            lines.add("print(" + args + ", sep=\"\")");
        }
    }

    private String generateExprList(SafeLangParser.ExprListContext ctx) {
        List<String> parts = new ArrayList<>();

        for (SafeLangParser.ExprContext expr : ctx.expr()) {
            parts.add(generateExpr(expr));
        }

        return String.join(", ", parts);
    }

    private String generateExpr(SafeLangParser.ExprContext ctx) {
        return generateAdditive(ctx.additive());
    }

    private String generateAdditive(SafeLangParser.AdditiveContext ctx) {
        String result = generateMultiplicative(ctx.multiplicative(0));

        for (int i = 1; i < ctx.multiplicative().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            String right = generateMultiplicative(ctx.multiplicative(i));
            result = "(" + result + " " + op + " " + right + ")";
        }

        return result;
    }

    private String generateMultiplicative(SafeLangParser.MultiplicativeContext ctx) {
        String result = generatePower(ctx.power(0));

        for (int i = 1; i < ctx.power().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            String pyOp = translateMultiplicativeOperator(op);
            String right = generatePower(ctx.power(i));
            result = "(" + result + " " + pyOp + " " + right + ")";
        }

        return result;
    }

    private String translateMultiplicativeOperator(String op) {
        if (op.equals("*")) {
            return "*";
        }

        if (op.equals("/")) {
            return "/";
        }

        if (op.equals("//")) {
            return "//";
        }

        if (op.equals("\\") || op.equals("\\\\")) {
            return "%";
        }

        throw new RuntimeException("Operador multiplicativo desconhecido: [" + op + "]");
    }

    private String generatePower(SafeLangParser.PowerContext ctx) {
        String left = generateUnary(ctx.unary());

        if (ctx.power() != null) {
            String right = generatePower(ctx.power());
            return "(" + left + " ** " + right + ")";
        }

        return left;
    }

    private String generateUnary(SafeLangParser.UnaryContext ctx) {
        if (ctx.primary() != null) {
            return generatePrimary(ctx.primary());
        }

        String op = ctx.getChild(0).getText();
        String value = generateUnary(ctx.unary());

        return "(" + op + value + ")";
    }

    private String generatePrimary(SafeLangParser.PrimaryContext ctx) {
        if (ctx.literal() != null) {
            return generateLiteral(ctx.literal());
        }

        if (ctx.ID() != null) {
            return pyName(ctx.ID().getText());
        }

        if (ctx.conversion() != null) {
            return generateConversion(ctx.conversion());
        }

        if (ctx.formatExpr() != null) {
            return generateFormat(ctx.formatExpr());
        }

        if (ctx.readExpr() != null) {
            return generateRead(ctx.readExpr());
        }

        if (ctx.expr() != null) {
            return "(" + generateExpr(ctx.expr()) + ")";
        }

        throw new RuntimeException("Expressão primária não suportada: " + ctx.getText());
    }

    private String generateConversion(SafeLangParser.ConversionContext ctx) {
        String type = ctx.conversionType().getText();
        String value = generateExpr(ctx.expr());

        return switch (type) {
            case "integer" -> "int(" + value + ")";
            case "real" -> "float(" + value + ")";
            case "string" -> "str(" + value + ")";
            default -> pyName(type) + "(" + value + ")";
        };
    }

    private String generateFormat(SafeLangParser.FormatExprContext ctx) {
        // SafeLang:
        // format(valor, largura)
        //
        // Python simples:
        // str(valor).ljust(int(largura))

        String value = generateExpr(ctx.expr(0));
        String width = generateExpr(ctx.expr(1));

        return "str(" + value + ").ljust(int(" + width + "))";
    }

    private String generateRead(SafeLangParser.ReadExprContext ctx) {
        String prompt = ctx.STRING_LITERAL().getText();
        return "input(" + prompt + ")";
    }

    private String generateLiteral(SafeLangParser.LiteralContext ctx) {
        return ctx.getText();
    }

    private void generateTry(SafeLangParser.TryStmtContext ctx) {
        lines.add("while True:");
        lines.add("    try:");

        for (SafeLangParser.StatementContext stmt : ctx.statementList(0).statement()) {
            generateIndentedStatement(stmt, 2);
        }

        lines.add("        break");

        if (ctx.statementList().size() > 1) {
            lines.add("    except Exception:");
            for (SafeLangParser.StatementContext stmt : ctx.statementList(1).statement()) {
                generateIndentedStatement(stmt, 2);
            }
            lines.add("        break");
        } else {
            lines.add("    except Exception:");
            lines.add("        break");
        }
    }

    private void generateRetry(SafeLangParser.RetryStmtContext ctx) {
        lines.add("continue");
    }

    private void generateIndentedStatement(SafeLangParser.StatementContext stmt, int indentLevel) {
        int oldSize = lines.size();

        generateStatement(stmt);

        String indent = "    ".repeat(indentLevel);

        for (int i = oldSize; i < lines.size(); i++) {
            lines.set(i, indent + lines.get(i));
        }
    }

    private String pyName(String name) {
        return switch (name) {
            case "False", "None", "True", "and", "as", "assert", "async", "await",
                "break", "class", "continue", "def", "del", "elif", "else",
                "except", "finally", "for", "from", "global", "if", "import",
                "in", "is", "lambda", "nonlocal", "not", "or", "pass", "raise",
                "return", "try", "while", "with", "yield" -> name + "_";
            default -> name;
        };
    }
    private String wrapWithType(String value, String type) {
        if (type == null) {
            return value;
        }

        return switch (type) {
            case "integer" -> "int(" + value + ")";
            case "real" -> "float(" + value + ")";
            case "string" -> "str(" + value + ")";
            default -> pyName(type) + "(" + value + ")";
        };
    }
}