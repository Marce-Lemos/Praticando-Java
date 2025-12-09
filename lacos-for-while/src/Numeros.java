import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        while (true) {
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            String entrada = scan.nextLine();

            if (entrada.equals("fim")) {
                break;
            }

            int numero = Integer.parseInt(entrada);

            if (numero > 0){
                positivos++;
            } else if (numero < 0){
                negativos++;
            }

        }
        System.out.println("Positivos: " + positivos + "\n" + "Negativos: " + negativos);
    }
}
