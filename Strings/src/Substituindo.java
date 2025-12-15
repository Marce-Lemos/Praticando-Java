import java.util.Scanner;

public class Substituindo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scan.nextLine();

        System.out.print("\nDigite a palavra a ser substituída: ");
        String palavra = scan.nextLine();

        if(!texto.contains(palavra)){
            System.out.println("Palavra não encontrada!");
            scan.close();
            return;
        }

        System.out.print("\nDigite a substituição: ");
        String substituicao = scan.nextLine();



        String formatado = texto.replace(palavra, substituicao);
        System.out.println("Texto modificado: " + formatado);

    }
}
