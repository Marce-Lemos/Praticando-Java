package AvaliaFilmes;

public class AvaliaFilmes {
    public static void main(String[] args){
        Filme f = new Filme("filme");
        f.avaliaFilme(5);
        f.avaliaFilme(4);
        f.avaliaFilme(5);
        f.avaliaFilme(3);
        f.avaliaFilme(4);

        System.out.printf("Média de avaliações de %s: %.2f\n", f.getTitulo(), f.calculaMedia());
    }
}
