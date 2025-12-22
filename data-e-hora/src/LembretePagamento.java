import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembretePagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o periodo de antecedência: ");
        int periodo = scan.nextInt();

        LocalDate dataVencimento = LocalDate.now();
        LocalDate lembrete = dataVencimento.minusDays(periodo);

        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String dataLembrete = form.format(lembrete);

        System.out.println("Data do lembrete: " + dataLembrete);


    }
}
