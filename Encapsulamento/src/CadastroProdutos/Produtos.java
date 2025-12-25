package CadastroProdutos;

public class Produtos {
    private String nome;
    private double preco;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco){
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void exibirDados() {
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: " + getPreco());

    }

    public void atualizaValor(double novoValor) {
        if (novoValor < 0){
            System.out.println("Preço inválido!");
        } else {
            this.preco = novoValor;
            System.out.println("Novo valor atualizado!");
            exibirDados();
        }


    }
}
