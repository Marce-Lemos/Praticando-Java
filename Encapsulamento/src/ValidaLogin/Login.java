package ValidaLogin;

public class Login {
    private final String login;
    private final String senha;

    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getlogin() {
        return this.login;
    }

    public boolean validaSenha(String login,String senha) {
        return login.equals(this.login) && senha.equals(this.senha);
    }



}
