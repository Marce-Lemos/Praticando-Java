import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> convidados = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do convidado, ver ou sair: ");
            String nome = scan.nextLine();

            if (nome.equals("sair")){
                System.out.println("Programa finalizado!");
                break;
            }

            if (convidados.contains(nome)) {
                System.out.println("Convidado já cadastrado!");

            } else if (nome.equals("ver")){
                  System.out.println("Lista de convidados: " + convidados);

            } else {
                convidados.add(nome);

            }
        }
    }
}
