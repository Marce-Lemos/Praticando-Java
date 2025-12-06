public class Livro {
    public static void main(String[] args) {
        String titulo = "O iluminado";
        String autor = "Stephen King ";
        int paginas = 464;
        double preco = 76.38;
        char categoria = 'F';

        String categoriaDescrita;

        switch (categoria) {
            case 'F' : categoriaDescrita = "Livro de Ficção";
                break;
            case 'N' : categoriaDescrita = "Livro de Não-Ficção";
                break;
            case 'T' : categoriaDescrita = "Livro de Tecnologia";
                break;
            case 'H' : categoriaDescrita = "Livro de História";
                break;
            default:  categoriaDescrita = "Categoria não listada!" ;

        }
        System.out.println("Livro cadastrado: " + titulo + " (" + autor + ")" + ", " +
                            "páginas: " + paginas + ", " + "preço: R$ " + preco + ", " + "categoria: " + categoriaDescrita );
    }
}
