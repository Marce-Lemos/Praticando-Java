package RegistroNotas;

import java.util.ArrayList;

public class Disciplina {
    private String disciplina;
    private ArrayList<Double> notas;

    public Disciplina(String disciplina) {
        this.disciplina = disciplina;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        } else {
            System.out.println("Nota ignorada: " + nota);
        }
    }

    public void calculaMedia() {
        double soma = 0;
        for (Double n: notas) {
            soma += n;
        }
        double media = soma / notas.size();
        System.out.println("Total de notas válidas: " + notas.size());
        System.out.println("Médias de notas: " + media);
    }
}
