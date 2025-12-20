import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatandoDataHora {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        DateTimeFormatter horaformatada = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data Formatada: " + data.format(dataformatada));
        System.out.println("Hora Formatada: " + hora.format(horaformatada));



    }
}
