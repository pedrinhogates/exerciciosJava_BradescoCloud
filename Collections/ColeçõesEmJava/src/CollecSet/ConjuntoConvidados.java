package CollecSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>() ;
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add( new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoARemover = null;
        for (Convidado c :  convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoARemover = c;
                break; // Encerra o loop após encontrar o convidado
            }
        } 
        convidadosSet.remove(convidadoARemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void listarConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados lista = new ConjuntoConvidados();
        lista.adicionarConvidado("João", 1);
        lista.adicionarConvidado("Maria", 1);
        lista.adicionarConvidado("Pedro", 3);
        lista.listarConvidados();
        System.out.println("Quantidade de convidados: " + lista.contarConvidados());
        lista.removerConvidado(2);
        lista.listarConvidados();
        System.out.println("Quantidade de convidados atualizada : " + lista.contarConvidados());
    }
}