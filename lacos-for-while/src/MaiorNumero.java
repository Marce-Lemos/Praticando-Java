import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os numeros da lista: ");
        String[] numeros = scan.nextLine().split(" ");
        int maior= Integer.MIN_VALUE;

        for (String numero: numeros) {
            int num2 = Integer.parseInt(numero);
            if (num2 > maior){
                maior = num2;
            }
        }
        System.out.println("o maior número é: " + maior);

    }
}
