package ZerandoSaldo;

public class ZerandoSaldo {
    public static void main(String[] args) {

        Conta c = new Conta();
        c.depositar(1579.42);
        c.exibirSaldo();
        c.zeraSaldo();
        c.exibirSaldo();

    }
}
