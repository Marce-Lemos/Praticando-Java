import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaCPF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero do CPF: ");
        String cpf = scan.nextLine();

        Pattern padrao = Pattern.compile("^\\d{3}.\\d{3}.\\d{3}-\\d{2}$");
        Matcher m = padrao.matcher(cpf);

        if(m.matches()) {
            System.out.println("O CPF " + cpf + " está no formato válido!");
        } else {
            System.out.println("O CPF " + cpf + " não está no formato correto!");
        }
        scan.close();
    }
}
