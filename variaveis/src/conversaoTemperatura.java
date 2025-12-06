import java.util.Scanner;

public class conversaoTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int celsius;

        System.out.println("Digite a temperatura em celsius para conversao: ");
        celsius = scan.nextInt();

        double fahrenheint = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura equivale a: " + fahrenheint + "°F");

    }
}
