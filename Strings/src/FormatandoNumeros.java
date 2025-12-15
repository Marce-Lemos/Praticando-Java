import java.util.Scanner;

public class FormatandoNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o valor: ");
        double valor = scan.nextDouble();

        String conversor = String.format("R$ %.2f", valor);
        System.out.println("Valor formatado: " + conversor);
    }
}
