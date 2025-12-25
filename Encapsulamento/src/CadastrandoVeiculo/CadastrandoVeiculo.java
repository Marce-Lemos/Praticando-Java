package CadastrandoVeiculo;

public class CadastrandoVeiculo {
    public static void main(String[] args) {
        Carro gol = new Carro("Gol", "KXE-2020", 1998);

        System.out.println("Modelo: " + gol.getModelo());
        System.out.println("Ano: " + gol.getAno());
        System.out.println("Placa: " + gol.getPlaca());


    }
}
