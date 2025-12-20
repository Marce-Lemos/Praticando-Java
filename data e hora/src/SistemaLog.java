import java.time.LocalDate;
import java.time.LocalTime;

public class SistemaLog {
	public static void main(String[] arg){
		String tarefa = "Enviar relatorio semanal";

		LocalDate dataCriacao = LocalDate.now();
		LocalTime horaCriacao = LocalTime.now();

		System.out.println("Tarefa: \"" + tarefa + "\"");
		System.out.println("Data de criação: " + dataCriacao);
		System.out.println("Hora de criação: " + horaCriacao);
		
	}
}