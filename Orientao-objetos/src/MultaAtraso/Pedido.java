package MultaAtraso;

public class Pedido {
    String titulo;
    int diasDeAtraso;
    double valorMulta;

    public void cobraMulta(int atraso) {
        valorMulta = atraso * 2.5;
    }

    public void exibirDetalhes(){
        System.out.printf("Livro: %s | Dias de atraso: %d | valor da multa: R$ %.2f", titulo, diasDeAtraso, valorMulta);
    }


}
