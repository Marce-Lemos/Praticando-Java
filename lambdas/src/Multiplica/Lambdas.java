package Multiplica;

public class Lambdas {
    public static void main(String[] args) {
        IMultiplicacao m = (a, b) -> a *b;

        System.out.println(m.multipica(3,5));
    }
}
