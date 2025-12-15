import java.util.Scanner;

public class Categoria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor a ser verificado: ");
        double valor = scan.nextDouble();

        if (valor <= 50) {
            System.out.println("Produto de categoria Econônica");
         } else if (valor > 50 && valor <= 200) {
            System.out.println("Produto de categoria Intermediária");
        } else {
            System.out.println("Produto de categoria Premium");
        }

    }
}
