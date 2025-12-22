package ControleTarefas;

public class Tarefas {
    String descricao;
    boolean concluida;

    public Tarefas(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public void mostraTarefa() {
        if(concluida) {
            System.out.printf("Tarefa: %s - Concluida: Concluida\n", descricao );
        } else {
            System.out.printf("Tarefa: %s - Concluida: Pendente\n", descricao );
        }
    }
}
