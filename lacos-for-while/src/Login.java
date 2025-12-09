import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senhaCorreta = 1234;


        for (int tent = 3; tent >= 0; tent--) {
            System.out.println("Digite sua senha: ");
            int senha = scan.nextInt();

            if (senha == senhaCorreta){
                System.out.println("Acesso concedido!");
                break;
            } else if (tent > 0){
                System.out.println("Senha errada, você tem " + tent + " tentativas");
            } else {
                System.out.println("Conta bloqueada!");
            }

        }

    }
}
