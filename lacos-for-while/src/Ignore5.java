import java.util.Scanner;

public class Ignore5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite até quanto deseja contar: ");
        int entrada = scan.nextInt();

        for (int i = 1; i <= entrada; i++) {

            if (i % 10 == 5) {
               continue;
            } else {
                System.out.print(i + " ");
            }


        }
    }
}
