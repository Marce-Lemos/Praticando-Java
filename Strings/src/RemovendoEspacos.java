import java.util.Scanner;

public class RemovendoEspacos {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        String formatado = nome.trim();
        System.out.println(formatado);
    }
}
