import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    public static void main(String[] args) {
        ZonedDateTime horaTokio = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = form.format(horaTokio);

        System.out.println("Hora em Tokio: " + horaFormatada);


    }
}