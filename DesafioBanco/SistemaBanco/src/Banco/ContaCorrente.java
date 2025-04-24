package Banco;

public class ContaCorrente extends Conta{

    public ContaCorrente(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = "Corrente";
    }
   
    @Override
    public void saque(double saldo) {
        super.saque(saldo);
    }

    @Override
    public void deposito(double saldo) {
        super.deposito(saldo);
        
    }

    @Override
    public void transferencia(double valor, Conta contaOrigem, Conta contaDestino) {
        super.transferencia(saldo,contaOrigem, contaDestino);
    }
}    
