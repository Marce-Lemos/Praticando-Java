package CorrigindoCadastros;

public class CorrigindoCadastros {
    public static void main(String[] args) {
        Cadastro c = new Cadastro("Marcelo","Programador", 1);
        c.mostrarCadastro();
        c.alterarCadastro("Desenvolvedor", 2);
        c.mostrarDadosAtualizados();
    }
}
