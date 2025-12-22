package ControleEstoque;

public class ControleEstoque {
    public static void main(String[] args) {
        Item camiseta = new Item("Camiseta", 10);
        camiseta.venderItem(2);
        camiseta.venderItem(9);
    }
}
