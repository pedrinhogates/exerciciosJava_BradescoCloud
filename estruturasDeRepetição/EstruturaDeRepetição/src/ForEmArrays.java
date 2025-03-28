public class ForEmArrays {
    public static void main(String[] args) {
        //em arrays o indice sempre inicia em 0
        String alunos[] = { "Ana", "Beto", "Carlos", "Diana", "Eduardo" };	

        for (int x = 0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x =" + x + " é " + alunos[x]);
        }
    }
}
