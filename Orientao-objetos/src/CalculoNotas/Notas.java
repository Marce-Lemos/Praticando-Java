package CalculoNotas;

public class Notas {
    String nome;
    double nota1;
    double nota2;

    public Notas (String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void calculoMedia() {
        double media = (nota1 + nota2) / 2;

        System.out.printf("Aluno: %s\nNota1: %.1f\nNota2: %.1f\nMedia: %.1f\n", nome, nota1, nota2, media);
        if (media >= 7){

            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

}
