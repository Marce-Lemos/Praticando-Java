import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculaEntrega {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2025, 03, 15);
        int prazoDias = 15;

        LocalDate diferenca = data.plusDays(prazoDias);

        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd-MM-YYYY");

        System.out.println("Data da entrega: " + diferenca.format(formatado));


    }
}
