import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Uso: java Main <input.sl> <output.py>");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args[1];

        CharStream input = CharStreams.fromFileName(inputFile);

        SafeLangLexer lexer = new SafeLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SafeLangParser parser = new SafeLangParser(tokens);

        SafeLangParser.ProgramContext tree = parser.program();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Erro: o ficheiro SafeLang tem erros sintáticos.");
            System.exit(1);
        }

        PythonGenerator generator = new PythonGenerator();
        String pythonCode = generator.generate(tree);

        Files.writeString(Path.of(outputFile), pythonCode);

        System.out.println("Código Python gerado em: " + outputFile);
    }
}