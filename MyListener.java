import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.ArrayList;

public class MyListener extends PitonBaseListener {

    private Stack<Map<String, String>> escopoPilha = new Stack<>();


    @Override
    public void exitNDeclaracao1(PitonParser.NDeclaracao1Context ctx) {
        String tipo = ctx.tipo().getText();
        String id = ctx.ID().getText();

        Map<String, String> escopoAtual = escopoPilha.peek();

        if (escopoAtual.containsKey(id)) {
            System.out.println("Declaração duplicada! Variável " + id + " já declarada no escopo atual");
        } else {
            escopoAtual.put(id, tipo);
        }
    }

    @Override
    public void exitNDeclaracao2(PitonParser.NDeclaracao2Context ctx) {
        String tipo = ctx.tipo().getText();
        String id = ctx.ID(0).getText();
        int idx = 0;
        for(int i = 0; i < ctx.getText().length(); i++) {
            if(ctx.getText().charAt(i) == ':'){
                idx = i+1;
                break;
            }
        }
        String stringAnalisada = "";
        for(int i = idx; i < ctx.getText().length(); i++) {
            stringAnalisada += ctx.getText().charAt(i);
        }if(Character.isDigit(stringAnalisada.charAt(0)) && !tipo.equals("I")) {
            System.out.println("Erro, tipo incompatível!");
        }else{
            String tipoVar = procurarVariavel(stringAnalisada);
            if(tipoVar != null && !tipo.equals(tipoVar)) {
                System.out.println("Erro, tipo incompatível!");
            }
        }

        Map<String, String> escopoAtual = escopoPilha.peek();

        if (escopoAtual.containsKey(id)) {
            System.out.println("Declaração duplicada! Variável " + id + " já declarada no escopo atual");
        } else {
            escopoAtual.put(id, tipo);
        }
    }

    @Override
    public void exitNAtribuicao(PitonParser.NAtribuicaoContext ctx) {
        String id = ctx.ID().getText();
        String tipoVar = procurarVariavel(id);
    
        if (tipoVar == null) {
            System.out.println("Erro: Variável " + id + " não declarada!");
        } else {
            ArrayList<String> vetor_tipos = new ArrayList<>();
            for (int i = 0; i < ctx.operacao().getChildCount(); i++) {
                inferirTipoOperacao(ctx.operacao().getChild(i).getText(),vetor_tipos);
            }

            for(int i = 0; i < vetor_tipos.size(); i++) {
                if(!tipoVar.equals(vetor_tipos.get(i))) {
                    System.out.println("Erro de tipo: Não é possível atribuir " + vetor_tipos.get(i) + " à variável " + id + " do tipo " + tipoVar);
                    break;
                }
            }
            
        }
    }
    
    private void inferirTipoOperacao(String operando, ArrayList<String> vetor_tipos) {
        char charAnalisado = operando.charAt(0);
        if (operando.length() > 1) {
            int idx = 0;
            if(operando.charAt(0) == '+' || operando.charAt(0) == '-' || operando.charAt(0) == '/' || operando.charAt(0) == '*') {
                idx = 1;
            }
            for(int i = idx; i < operando.length(); i++) {
                String stringAnalisada = "";

                while(i < operando.length() && operando.charAt(i) != '+' && operando.charAt(i) != '-' && operando.charAt(i) != '/' && operando.charAt(i) != '*') {
                    stringAnalisada += operando.charAt(i);
                    i++;
                }
                i--;
                if (Character.isDigit(operando.charAt(i))) {
                    vetor_tipos.add("I"); // Considerando que números são inteiros
                } else {
                    String tipo = procurarVariavel(stringAnalisada);
                    if (tipo == null) {
                        System.out.println("Erro: Variável " + stringAnalisada + " não encontrada.");
                    }
                    vetor_tipos.add(tipo);
                }
            }
        }else{
            String stringAnalisada = "";
            int i = 0;
            while(i < operando.length() && operando.charAt(i) != '+' && operando.charAt(i) != '-' && operando.charAt(i) != '/' && operando.charAt(i) != '*') {
                stringAnalisada += operando.charAt(i);
                i++;
            }
            i--;
            if (Character.isDigit(operando.charAt(i))) {
                vetor_tipos.add("I"); // Considerando que números são inteiros
            } else {
                String tipo = procurarVariavel(stringAnalisada);
                if (tipo == null) {
                    System.out.println("Erro: Variável " + stringAnalisada + " não encontrada.");
                }// fat
                vetor_tipos.add(tipo);
            }
        }
    }
    
    private String procurarVariavel(String id) {
        // Percorre a pilha de escopos de cima para baixo para encontrar a variável
        for (int i = escopoPilha.size() - 1; i >= 0; i--) {
            Map<String, String> escopo = escopoPilha.get(i);
            if (escopo.containsKey(id)) {
                return escopo.get(id);
            }
        }
        return null; // Variável não encontrada
    }

    @Override
    public void enterBlocoAlgoritmo(PitonParser.BlocoAlgoritmoContext ctx) {
        // Entra em um novo escopo ao entrar em um bloco de algoritmo
        escopoPilha.push(new HashMap<>());
    }

    @Override
    public void exitBlocoAlgoritmo(PitonParser.BlocoAlgoritmoContext ctx) {
        // Sai do escopo ao sair de um bloco de algoritmo
        escopoPilha.pop();
    }

    @Override
    public void enterNFuncao_nao_vazio(PitonParser.NFuncao_nao_vazioContext ctx) {
        // Entra em um novo escopo ao entrar em uma função
        escopoPilha.push(new HashMap<>());
    }

    @Override
    public void exitNFuncao_nao_vazio(PitonParser.NFuncao_nao_vazioContext ctx) {
        // Sai do escopo ao sair de uma função
        escopoPilha.pop();
    }
    
    @Override
    public void enterNFuncao_vazio(PitonParser.NFuncao_vazioContext ctx) {
        // Entra em um novo escopo ao entrar em uma função
        escopoPilha.push(new HashMap<>());
    }

    @Override
    public void exitNFuncao_vazio(PitonParser.NFuncao_vazioContext ctx) {
        // Sai do escopo ao sair de uma função
        escopoPilha.pop();
    }

    public Map<String, String> getTabelaSimbolos() {
        return escopoPilha.isEmpty() ? null : escopoPilha.peek();
    }
}
