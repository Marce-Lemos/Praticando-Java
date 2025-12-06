import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor em reais que deseja converter: ");
        double valorReais = scan.nextDouble();

        System.out.println("Digite o valor da taxa: ");
        double valorDolar = scan.nextDouble();

        double conversao = (double) valorReais / valorDolar;

        System.out.println("Seu valor equivale a " + "US$ " + conversao );
    }
}
