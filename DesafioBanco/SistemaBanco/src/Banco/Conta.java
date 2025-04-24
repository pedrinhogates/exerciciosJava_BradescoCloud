package Banco;

import java.util.Scanner;

public class Conta {
    private static int Sequencial = 0001;

    protected String numeroConta = String.valueOf(++Sequencial);
    protected double saldo;
    protected String tipoConta; // "Corrente" ou "Poupança"
    protected int agencia = 1;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    Scanner sc = new Scanner(System.in);

    public void saque(double valor) {
        System.out.print("Digite o valor do saque: ");
        try {
                valor = sc.nextDouble(); // Lê um número do tipo double
            if (valor > 0 && valor <= saldo) {
                saldo -= valor; // Subtrai o valor do saldo
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
            } else {
                System.out.println("Valor inválido ou saldo insuficiente.");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
            sc.nextLine(); // limpa o buffer do scanner
        }
    }

    public void deposito(double valor) {
        System.out.print("Digite o valor do depósito: ");
        try {
            valor = sc.nextDouble(); // Lê um número do tipo double
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
            } else {
                System.out.println("Valor inválido.");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
            sc.nextLine(); // limpa o buffer do scanner
        }
    }

    public void transferencia(double valor, Conta contaOrigem, Conta contaDestino) {
        System.out.print("Digite o valor da transferência: ");
        try {
            double valorTransferencia = sc.nextDouble(); // Lê um número do tipo double
            if (valorTransferencia > 0 && valorTransferencia <= saldo) {
                saldo -= valorTransferencia; // Subtrai o valor do saldo da conta de origem
                contaDestino.setSaldo(contaDestino.getSaldo() + valorTransferencia); // Adiciona o valor ao saldo da
                                                                                     // conta de destino
                System.out.println("Transferência realizada com sucesso. Novo saldo: " + saldo);
            } else {
                System.out.println("Valor inválido ou saldo insuficiente.");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
            sc.nextLine(); // limpa o buffer do scanner
        }
    }
}
