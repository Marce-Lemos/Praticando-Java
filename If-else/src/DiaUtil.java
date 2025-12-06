import java.util.Scanner;

public class DiaUtil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um dia da semana: ");
        String dia = scan.nextLine();
        scan.close();

        switch (dia) {
            case "segunda":
                System.out.println("Esse é um dia da semana");
                break;
            case "terça":
                System.out.println("Esse é um dia da semana");
                break;
            case "quarta":
                System.out.println("Esse é um dia da semana");
                break;
            case "quinta":
                System.out.println("Esse é um dia da semana");
                break;
            case "sexta":
                System.out.println("Esse é um dia da semana");
                break;
            case "sabado":
                System.out.println("Esse é um dia do final semana");
                break;
            case "domingo":
                System.out.println("Esse é um dia do final de semana");
                break;
        }
    }
}
