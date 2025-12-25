package AgendaContatos;

public class Clientes {
    private final String nome;
    private final String telefone;

    public Clientes(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

}
