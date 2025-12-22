package ControleTarefas;

import java.util.ArrayList;

public class ControleTarefas {
    public static void main(String[] args) {

        Tarefas t1 = new Tarefas("escrever texto", true);
        Tarefas t2 = new Tarefas("desenhar mapa", false);

        ArrayList<Tarefas> tarefas = new ArrayList<Tarefas>();
        tarefas.add(t1);
        tarefas.add(t2);

        for(Tarefas t : tarefas) {
            t.mostraTarefa();
        }

    }
}
