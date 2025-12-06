import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número par verificar se é par ou ímpar: ");
        int numero = scan.nextInt();
        scan.close();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + "é ímpar");
        }
    }
}
