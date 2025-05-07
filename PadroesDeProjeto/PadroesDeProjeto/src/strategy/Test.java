package strategy;

public class Test {
    public static void main(String[] args) {
        
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento normal = new ComportamentoNormal();

    Robo robo = new Robo();
    robo.setcomportamento(normal);
    robo.mover();
    robo.setcomportamento(defensivo);
    robo.mover();
    }

}
