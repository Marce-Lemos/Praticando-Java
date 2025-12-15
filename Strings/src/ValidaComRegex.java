import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidaComRegex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digita um senha para validar: ");
        String senha = scan.nextLine();

        Pattern padrao = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Matcher m = padrao.matcher(senha);

        if (m.matches()){
            System.out.println("Essa senha é válida!");
        } else {
            System.out.println("Essa senha não é válida!");
        }




    }
}
