package Banco;

public class Banco {

    public static void main(String[] args) {
        Conta cc =  new ContaCorrente("0001", 1000.00);
    
        Conta cp = new ContaPoupanca("0002", 500.00);

        Cliente cliente = new Cliente();
        cliente.setNome("João da Silva"); 
        cliente.setCpf("123.456.789-00");

        cc.transferencia( 200.00, cc, cp);
        cp.saque(100.00);
        System.out.println("Saldo conta corrente: " + cc.getSaldo());
        System.out.println("Saldo conta poupança: " + cp.getSaldo());
    }
}    