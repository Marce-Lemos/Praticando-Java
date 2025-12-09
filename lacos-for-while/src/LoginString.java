import java.util.Scanner;

public class LoginString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";

        for (int tent = 3; tent > 0 ; tent--) {
            System.out.println("Digite sua senha: ");
            String senha = scan.nextLine();

            if (senha.equals(SENHA_CORRETA)){
                System.out.println("Acesso Permitido!");
                break;
            } else if (tent >= 1) {
                System.out.println("Acesso negado, você tem " + tent +" tentativas");
            } else {
                System.out.println("Acesso bloqueado!");
            }

        }
    }
}
