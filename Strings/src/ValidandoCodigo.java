import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoCodigo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o código: ");
        String codigo = scan.nextLine();

        Pattern padrao = Pattern.compile("^[A-Z]{3}-[0-9]{4}$");
        Matcher match = padrao.matcher(codigo);

        if(match.matches()){
            System.out.println("Esse código é válido!");
        } else {
            System.out.println("Esse código não é válido!");
        }
        scan.close();
    }
}
