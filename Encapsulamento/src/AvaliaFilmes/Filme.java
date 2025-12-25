package AvaliaFilmes;

import java.util.ArrayList;

public class Filme {
    private final String titulo;
    private final ArrayList<Integer> avaliacao;

    public Filme (String titulo) {
        this.titulo = titulo;
        this.avaliacao = new ArrayList<>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public double calculaMedia() {
        int soma = 0;
        for (int nota : avaliacao) {
            soma += nota;
        }
        return (double) soma / avaliacao.size();
    }

    public void avaliaFilme(int nota) {
        if (nota >= 1 && nota <=5){
            avaliacao.add(nota);
        } else {
            System.out.println("Digite uma nota válida!");
        }
    }
}
