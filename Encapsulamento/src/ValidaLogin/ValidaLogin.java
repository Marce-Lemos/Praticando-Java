package ValidaLogin;

import java.util.Scanner;

public class ValidaLogin {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Login log = new Login("marcelo1", "123456");

        int tentativas = 3;
        do {
            System.out.println("Login: ");
            String login = scan.nextLine();

            System.out.println("Senha: ");
            String senha = scan.nextLine();

            if (log.validaSenha(login, senha)){
                System.out.println("Login bem sucedido!");
                break;
            } else {
                tentativas--;
                if(tentativas == 0){
                    System.out.println("Conta bloqueada!");
                } else {
                    System.out.println("Senha incorreta, tentativas restantes " + tentativas);

                }

            }
        }while(tentativas > 0);

    }
}
