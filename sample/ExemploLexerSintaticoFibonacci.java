import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ExemploLexerSintaticoFibonacci {
    public static void main(String[] args) {
        String filename = "C:\\Users\\luizv\\Downloads\\antlr4\\Piton(Fibonacci).txt";

        try {
            CharStream input = CharStreams.fromFileName(filename);
            PitonLexer lexer = new PitonLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PitonParser parser = new PitonParser(tokens);

            ParseTree ast = parser.inicio(); // Vai rodar o parser e criar uma ast (árvore sintática abstrata),
            // a partir de um nó inicial que foi definido

            System.out.println(ast.toStringTree());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
