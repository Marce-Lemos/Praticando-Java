import java.time.Duration;
import java.time.LocalTime;

public class DiferencaHoras {
    public static void main(String[] args) {
        LocalTime horaComeco = LocalTime.of(15,30, 0);
        LocalTime horaFinal = LocalTime.of(19, 17,52);

        Duration duracao = Duration.between(horaComeco, horaFinal);

        System.out.println("Diferença: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");
    }
}
