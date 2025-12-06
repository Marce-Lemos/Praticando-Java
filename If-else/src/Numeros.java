import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();
        scan.close();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " e " + num2 + " são iguais");
        } else {
            System.out.println(num2+ " é maior que " + num1);
        }

    }
}
