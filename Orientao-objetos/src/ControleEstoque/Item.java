package ControleEstoque;

public class Item {
    String nome;
    int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void venderItem(int quantidade){
        if (this.quantidade > quantidade) {
            this.quantidade -= quantidade;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, this.quantidade);
        } else {
            System.out.println("Item sem estoque para atender pedido\n");
        }
    }
}
