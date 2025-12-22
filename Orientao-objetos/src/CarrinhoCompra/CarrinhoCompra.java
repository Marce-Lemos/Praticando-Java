package CarrinhoCompra;

import java.util.ArrayList;

public class CarrinhoCompra {
    public static void main(String[] args){
        Produto p1 = new Produto("caderno", 2, 15);
        Produto p2 = new Produto("cadeira", 5, 100);

        p1.valorTotal();
        p2.valorTotal();

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(p1);
        produtos.add(p2);

        double totalCompra =0;
        for(Produto p : produtos) {
            totalCompra += p.valorTotal();
        }

        System.out.printf("Total de compras: R$ %.2f", totalCompra);

    }
}
