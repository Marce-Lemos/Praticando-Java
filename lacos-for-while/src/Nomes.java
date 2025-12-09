import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;

      do {
            System.out.println("Digite um nome: ");
            nome = scan.nextLine();

            if (nome.length() < 3 ){
                System.out.println("Nome inválido, tente novamente");
            }

        } while (nome.length() < 3);
        System.out.println("Nome cadastrado com sucesso!");
    }
}
