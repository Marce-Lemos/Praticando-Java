import java.util.Scanner;

public class Aprovado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;
        System.out.println("Digite a nota do aluno: ");
        nota = scan.nextDouble();
        scan.close();

        if (nota >= 7){
            System.out.println("Aluno aprovado!");
        } else if (nota >= 5 && nota <=6.9) {
            System.out.println("Aluno na média!");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
