import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataVencimento {
    public static void main(String[] args) {
        LocalDate vencimentoOriginal = LocalDate.of(2025,03,20);
        LocalDate adiamento = vencimentoOriginal.plusMonths(1);

        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-YYYY");

        System.out.println("Nova Data: " + form.format(adiamento));

    }
}
