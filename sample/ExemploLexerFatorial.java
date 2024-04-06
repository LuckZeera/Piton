import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class ExemploLexerFatorial {
    public static void main(String[] args){
        String filename = "C:\\Users\\luizv\\Downloads\\antlr4\\Piton(Fatorial).txt";

        try{
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName(filename);
            PitonLexer lexer = new PitonLexer(input);
            Token token;
            while(!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: " + token.toString());
                System.out.println("    Lexema: " + token.getText());
                System.out.println("    Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
