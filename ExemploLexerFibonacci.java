import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class ExemploLexerFibonacci {
    public static void main(String[] args){
        String filename = "arquivo_entrada/teste.txt";

        try{
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName(filename);
            PitonLexer lexer = new PitonLexer(input);
            Token token;
            while(!lexer._hitEOF){
                token = lexer.nextToken();
                if(token.getType() == 26) {
                    
                    System.out.println("Erro encontrado em: " + token.getLine()+ ":" + token.getCharPositionInLine() + ", lexema " + token.getText() + " não encontrado.");
                    break;
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}