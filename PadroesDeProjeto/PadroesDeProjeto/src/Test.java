

import facede.Facade;
import strategy.Comportamento;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Test {
    public static void main(String[] args) {
        
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento normal = new ComportamentoNormal();

    Robo robo = new Robo();
    robo.setcomportamento(normal);
    robo.mover();
    robo.setcomportamento(defensivo);
    robo.mover();

    Facade facede = new Facade();
    facede.migrarCliente("Lucas", "12345678");

}


    

}
