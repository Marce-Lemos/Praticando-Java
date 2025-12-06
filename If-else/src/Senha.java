import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senhacorreta = "123456";

        System.out.println("Digite uma senha: ");
        String senha = scan.nextLine();
        scan.close();

        if (senha.equals(senhacorreta)
        ) {
            System.out.println("Acesso permitido");
        } else{
            System.out.println("Acesso negado, tente novamente");
        }
    }
}
