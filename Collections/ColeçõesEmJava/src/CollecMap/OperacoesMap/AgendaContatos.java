package CollecMap.OperacoesMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    } 

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
            agendaContatoMap.remove(nome);
       
       }
    public void exibirContatos () {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarContato(String nome) {
        return agendaContatoMap.get(nome);
    }
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("Pedro", 555555555);
        
        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();
        
        System.out.println("\nPesquisando contato 'Maria': " + agenda.pesquisarContato("Maria"));
        
        System.out.println("\nRemovendo contato 'João'.");
        agenda.removerContato("João");
        
        System.out.println("\nContatos na agenda após remoção:");
        agenda.exibirContatos();
    }
}    
