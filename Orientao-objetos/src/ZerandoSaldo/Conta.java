package ZerandoSaldo;

public class Conta {
    double saldo=0;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void zeraSaldo(){
        this.saldo= 0;
    }

    public void exibirSaldo(){
        System.out.printf("Saldo atual: %.2f %n", saldo);

    }
}
