import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = scan.nextDouble();
        scan.close();

        if (valor >= 100) {
            double deconto = valor - (0.1*valor);

            System.out.println("Desconto de 10% aplicado!");
            System.out.println("Novo valor: R$" + deconto);
        } else {
            System.out.println("Nenhuma desconto aplicado!");
            System.out.println("Valor da compra: R$ " + valor);
        }
    }
}
