import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEvento {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.of(2025, 03, 15);
        LocalDate dataEvento = LocalDate.of(2025, 03, 10);

        boolean ocorreuData = dataEvento.isBefore(dataHoje);

        DateTimeFormatter form =  DateTimeFormatter.ofPattern("dd-MM-YY");

        System.out.println("Data do evento: " + form.format(dataEvento));
        System.out.println("Data atual: " + form.format(dataHoje));

        if (ocorreuData) {
            System.out.println("Esse evento já ocorreu!");

        } else {
            System.out.println("Esse evento ainda não ocorreu!");
        }



    }
}
