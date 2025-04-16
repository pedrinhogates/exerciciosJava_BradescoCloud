package CollecSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set <Contato> contatosSet;
    

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatosSet.add(new Contato(nome, telefone));
    }

    public void listarContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();

            for (Contato contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosEncontrados.add(contato);
                
                }
         }
        return contatosEncontrados;

    }

    public Contato atualizarContato (String nome, int telefone) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setTelefone(telefone);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;

    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Ana", 456789123);
        agendaContatos.adicionarContato("Pedro", 321654987);
        agendaContatos.listarContatos();

        System.out.println(agendaContatos.pesquisaPorNome("Pedro"));
        agendaContatos.atualizarContato("Ana", 111111111);
        System.out.println("novo contato: " + agendaContatos.pesquisaPorNome("Ana"));
    }
}



