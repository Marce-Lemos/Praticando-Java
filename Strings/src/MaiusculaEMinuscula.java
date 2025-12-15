import java.util.Scanner;

public class MaiusculaEMinuscula {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scan.nextLine();

        String formMinuscula = texto.toLowerCase();
        String formMaiuscula = texto.toUpperCase();

        System.out.println("Texto em minúsculo: " + formMinuscula);
        System.out.println("Texto em maiúsculo: " + formMaiuscula);
        scan.close();


    }
}
