import java.util.Scanner;

public class Substring {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = scan.nextLine();

        System.out.println("Digite a palavra: ");
        String palavra = scan.nextLine();

        if(texto.contains(palavra)) {
            System.out.printf("A palavra \"" + palavra +"\" está presente no texto! ");
        } else {
            System.out.println("A palavra \"" + palavra +"\"  não está presente no texto!");
        }

    }

}
