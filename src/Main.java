import org.antlr.v4.runtime.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final Set<String> includedFiles = new HashSet<>();

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Uso: java Main <input.sl> <output.py>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args[1];

        String pythonCode = generateFile(Path.of(inputFile));

        Files.writeString(Path.of(outputFile), pythonCode);

        System.out.println("Código Python gerado em: " + outputFile);
    }

    private static String generateFile(Path filePath) throws Exception {
        SafeLangParser.ProgramContext tree = parseFile(filePath);

        StringBuilder code = new StringBuilder();

        // Primeiro gera os ficheiros usados com use "..."
        for (SafeLangParser.StatementContext stmt : tree.statement()) {
            if (stmt.useStmt() != null) {
                String rawName = stmt.useStmt().STRING_LITERAL().getText();
                String fileName = rawName.substring(1, rawName.length() - 1);

                Path includePath = resolveInclude(filePath, fileName);

                String normalized = includePath.toAbsolutePath().normalize().toString();

                if (!includedFiles.contains(normalized)) {
                    includedFiles.add(normalized);
                    code.append(generateFile(includePath));
                    code.append("\n");
                }
            }
        }

        // Depois gera o ficheiro principal
        PythonGenerator generator = new PythonGenerator();
        code.append(generator.generate(tree));

        return code.toString();
    }

    private static SafeLangParser.ProgramContext parseFile(Path filePath) throws Exception {
        CharStream input = CharStreams.fromPath(filePath);

        SafeLangLexer lexer = new SafeLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SafeLangParser parser = new SafeLangParser(tokens);

        SafeLangParser.ProgramContext tree = parser.program();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            throw new RuntimeException("Erros sintáticos em: " + filePath);
        }

        return tree;
    }

    private static Path resolveInclude(Path currentFile, String fileName) {
        // 1. Procura na mesma pasta do ficheiro atual
        Path sameFolder = currentFile.getParent().resolve(fileName);
        if (Files.exists(sameFolder)) {
            return sameFolder;
        }

        // 2. Procura na pasta lib/
        Path libFolder = Path.of("lib").resolve(fileName);
        if (Files.exists(libFolder)) {
            return libFolder;
        }

        // 3. Procura diretamente pelo caminho dado
        Path direct = Path.of(fileName);
        if (Files.exists(direct)) {
            return direct;
        }

        throw new RuntimeException("Ficheiro usado não encontrado: " + fileName);
    }
}