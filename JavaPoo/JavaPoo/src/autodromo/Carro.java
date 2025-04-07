package autodromo;

public class Carro  extends Veiculo {
    
    public void ligar() {
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligado.");
    }
    private void confereCombustivel() {
        System.out.println("conferindo combustivel.");
    }
    private void confereCambio() {
        System.out.println("conferindo posição do cambio.");
    }    
}    