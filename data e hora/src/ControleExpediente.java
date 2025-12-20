import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControleExpediente {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horário de entrada: ");
        LocalTime horaEntrada = LocalTime.parse(scan.next(), form);

        System.out.print("Digite a carga horária: ");
        int cargaHoraria = scan.nextInt();

        System.out.print("Digite o horario de saida: ");
        LocalTime horaSaida= LocalTime.parse(scan.next(), form);

        LocalTime saidaPrevista = horaEntrada.plusHours(cargaHoraria);

        Duration saldo = Duration.between(saidaPrevista, horaSaida);
        long horasExtras = saldo.toHours();
        long minutosExtras = saldo.toMinutesPart();

        System.out.println("-----------------------------------------------");
        System.out.println("Horario de entrada: " + form.format(horaEntrada));
        System.out.println("Horario de saida: " + form.format(horaSaida));
        System.out.println("Horario real de saída: " + form.format(saidaPrevista));

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }
    }
}