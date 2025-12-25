package CadastrandoVeiculo;

public class Carro {
    String modelo;
    String placa;
    int ano;

    public Carro(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

   public String getModelo(){
        return this.modelo;
   }

   public String getPlaca(){
        return this.placa;
   }

   public int getAno(){
        return this.ano;
   }
}
