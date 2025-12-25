package ControleSenha;

public class Usuario {
    private String senha;

    public Usuario (String senha) {
        this.senha = senha;
    }

    public void setSenha(String senhaAntiga, String senhaNova) {
        if (senhaAntiga.equals(this.senha)) {
            this.senha = senhaNova;
            System.out.println("Senha atualizada com sucesso!");
        } else {
            System.out.println("Senha atual icorreta. A senha não foi alterada!");
        }


    }
}
