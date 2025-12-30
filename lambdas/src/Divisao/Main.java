package Divisao;

public class Main {
    public static void main(String[] args) {
//        Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo.
//        A função deve lançar uma exceção de tipo ArithmeticException se o divisor for zero.

        Divisao n = (a, b) -> {
            if (b == 0 ) {
                throw new ArithmeticException("ERRO: Divisão por zero");
            }
            return a / b;
        };

        try {
            System.out.println(n.dividir(10,2));
            System.out.println(n.dividir(10,0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }



    }
}
