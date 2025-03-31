import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        ArrayList<String> aprovados = selecaoCanditados();
        
        imprimirCandidatosSelecionados(aprovados);

    }

    static void imprimirCandidatosSelecionados(ArrayList<String> aprovados) {
        System.out.println("\nCandidatos aprovados:");
        for (String aprovado : aprovados) {
            System.out.println("- " + aprovado);
        }
        System.out.println("Número total de candidatos selecionados: " + aprovados.size());
    }

    static ArrayList<String> selecaoCanditados() {
        String[] candidatos = { "PEDRO", "JOÃO", "MARIA", "JOSÉ", "ANA", "PAULO", "LUCAS", "MARCOS", "FELIPE", "CARLA",
                "JULIA" };
        ArrayList<String> aprovados = new ArrayList<>(); // Lista para armazenar os aprovados

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                aprovados.add(candidato); // Adiciona o candidato à lista de aprovados
                candidatosSelecionados++;

            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
            }
            candidatoAtual++;
        }
        return aprovados;

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500.0, 2200.0);
    }

    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        } else
            System.out.println("AGUARDAR RETORNO DOS DEMAIS CANDIDATOS");

    }

}