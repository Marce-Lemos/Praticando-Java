package MultaAtraso;

public class MultaAtraso {
    public static void main(String[] args) {
        Pedido p = new Pedido();
        p.titulo = "Dom Casmurro";
        p.diasDeAtraso = 15;
        p.cobraMulta(15);
        p.exibirDetalhes();
    }
}
