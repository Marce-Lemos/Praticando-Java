package CadastroProdutos;

public class CadastroProdutos {
    public static void main(String[] args){
        Produtos p = new Produtos();
        p.setNome("Cadeira" );
        p.setPreco(-150.0);
        p.exibirDados();

        //p.atualizaValor(-150);

    }
}
