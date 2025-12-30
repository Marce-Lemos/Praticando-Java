package Palindromo;

public class Main {
    public static void main(String[] args){
        Palidromo p = str -> str.contentEquals(new StringBuilder(str).reverse());
//      Palidromo p = str -> str.equals(new StringBuilder(str).reverse().toString()); *padrão*

        System.out.println(p.verificarPalindromo("arara"));
        System.out.println(p.verificarPalindromo("radar"));
        System.out.println(p.verificarPalindromo("java"));
    }
}
