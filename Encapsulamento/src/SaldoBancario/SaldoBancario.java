package SaldoBancario;

public class SaldoBancario {
    public static void main(String[] args){
        Conta c = new Conta("marcelo");
        c.depositar(500.0);
        c.exibirSaldo();

        c.sacar(500.0);
        c.exibirSaldo();

        c.sacar(100.0);
    }
}
