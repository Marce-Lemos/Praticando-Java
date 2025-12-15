import java.util.Scanner;

public class ExtraindoString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String arquivo = scan.nextLine();

        int posicao = arquivo.lastIndexOf(".");
        if (posicao != -1) {
            String nomeSemExtensao = arquivo.substring(0, posicao);
            System.out.println("Arquivo sem extensão: " + nomeSemExtensao);
        } else {
            System.out.println("Arquivo não possui extensão!");
        }
        scan.close();
    }
}
