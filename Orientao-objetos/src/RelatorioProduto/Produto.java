package RelatorioProduto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mostrarDados() {
        System.out.printf("Nome: %s \nPreço: R$ %.2f \nQuantidade: %d Un", nome, preco, quantidade);
    }
}
