import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.Token;

public class ExemploLexerSintaticoSemantico {
    public static void main(String[] args) {
        String filename = "arquivo_entrada/erro_tipo_incompativel.txt";
        VerificaErros error = new VerificaErros();
        error.valor = false;
        PitonLexer lexer = getLexer(filename, error);  
        
        if(!error.valor) {
            error.valor = false;

            PitonParser parser = getParser(filename);

            //obter arvore
            ParseTree ast = parser.inicio();
            
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("Erros de sintaxe encontrados.");
            } else {
                System.out.println("Parsing concluído sem erros.");
                System.out.println(ast.toStringTree());

                //Inicia o MyListener, nossa implementação do baseListener
                MyListener listener = new MyListener();

                ParseTreeWalker walker = new ParseTreeWalker();

                //percorre a ast com a nossa implementação do listener
                walker.walk(listener,ast);
            }

        }


    }


    private static PitonLexer getLexer(String filename, VerificaErros erroLexico) {
        PitonLexer lexer = null;
            try {
                org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName(filename);
                lexer = new PitonLexer(input);
                Token token;
                while(!lexer._hitEOF){
                    token = lexer.nextToken();
                    if(token.getType() == 26) {
                        
                        System.out.println("Erro encontrado em: " + token.getLine()+ ":" + token.getCharPositionInLine() + ", lexema " + token.getText() + " não encontrado.");
                        erroLexico.valor = true;
                        break;
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            return lexer;
    }

    //método para executar o lexer e o parser sobre o arquivo de entrada
    private static PitonParser getParser(String fileName){
        PitonParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(fileName);
            PitonLexer lexer = new PitonLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new PitonParser(tokens);
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return parser;
    }
    
}

class VerificaErros {
    public boolean valor;
}