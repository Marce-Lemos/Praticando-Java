package SaldoBancario;

public class Conta {
    private final String titular;
    private double saldo;

    public Conta(String titular){
        this.titular = titular;
        this.saldo = 0;
    }

    public void exibirSaldo() {
        System.out.printf("Saldo Atual de %s: R$ %.2f\n",titular, saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Deposite valores positivos!");
        }
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente para operação!");
        }
    }


}
