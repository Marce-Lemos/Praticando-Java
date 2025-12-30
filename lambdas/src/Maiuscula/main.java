package Maiuscula;

public class main {
    public static void main(String[] arg) {
        Maiuscula m = String::toUpperCase;
//      Maiuscula m = s -> s.toUpperCase();

        System.out.println(m.transformMaiuscula("marcelo"));
    }
}
