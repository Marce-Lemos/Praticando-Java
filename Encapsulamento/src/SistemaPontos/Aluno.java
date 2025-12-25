package SistemaPontos;

public class Aluno {
    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
        this.pontos= 0;
        this.nivel = 1;
    }

    public void ganharPontos(int pontos) {
        this.pontos += pontos;
        atualizarNivel();
    }

    private void atualizarNivel() {
        this.nivel = (pontos / 100) + 1;
    }

    public void exibirDados(){
        System.out.printf("Nome: %s\nPontos: %d\nNivel: %d\n", nome, pontos, nivel);
    }

}
