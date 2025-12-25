package AgendaContatos;

import java.util.ArrayList;

public class AgendaContatos {
    public static void main(String[] args) {

        Clientes c1 = new Clientes("Caio", "(22) 9999-0897");
        Clientes c2 = new Clientes("Marcelo", "(22) 93303-0235");

        ArrayList<Clientes> lista = new ArrayList<Clientes>();
        lista.add(c1);
        lista.add(c2);

        int indice = 1;
        for(Clientes c : lista) {
            System.out.printf("%d. %s - %s\n", indice, c.getNome(), c.getTelefone());
            indice++;
        }

    }
}
