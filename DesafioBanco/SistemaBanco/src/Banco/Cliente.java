package Banco;

public class Cliente {
    private String nome;
    public Cliente(String nome, String cpf, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }
    private String cpf;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    } 
    Conta conta = new ContaCorrente("0001", 1000.00);
    Conta conta2 = new ContaPoupanca("0002", 500.00);

}
