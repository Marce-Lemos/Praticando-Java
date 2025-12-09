import java.util.Scanner;

public class ContagemDegraus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de degrais: ");
        int degraus = scan.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo degrau " + (i));
        }
        System.out.println("Você terminou de subir todos os " + degraus + "degraus");
        scan.close();

    }
}
