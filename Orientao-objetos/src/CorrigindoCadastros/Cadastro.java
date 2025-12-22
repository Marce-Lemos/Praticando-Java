package CorrigindoCadastros;

public class Cadastro {
    String nome;
    String cargo;
    int nivelAcesso;

    public Cadastro(String nome, String cargo, int nivelAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    public void mostrarCadastro(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo:" + cargo);
        System.out.println("Nivel de Acesso:" + nivelAcesso);
        System.out.println(" ");
    }

    public void mostrarDadosAtualizados(){
        System.out.println("--- Antes da atualização ---");
        mostrarCadastro();

        System.out.println("--- Após atualização ---");
        mostrarCadastro();
    }

    public void alterarCadastro(String cargo, int nivelAcesso){
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }


}
