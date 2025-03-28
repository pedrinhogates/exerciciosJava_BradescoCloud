public class MetodoWhile {
    public static void main(String[] args) {
        int joao = 50;
        int doces = 0;

        while (joao > 0 ) {
            joao = joao - 2;
            doces = doces ++;
            System.out.println("João comprou um doce e agora tem " +doces + " doces e " + joao + " reais.");
            
        }
    }
}
