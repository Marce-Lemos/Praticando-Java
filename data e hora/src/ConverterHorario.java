import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ConverterHorario {
    public static void main(String[] args){
        ZonedDateTime horarioSistema = ZonedDateTime.now();
        ZonedDateTime horarioSidney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Horario do sistema: " + form.format(horarioSistema));
        System.out.println("Horario em Sydney: " + form.format(horarioSidney));



    }
}
