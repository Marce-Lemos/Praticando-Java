public class Consumo {
    public static void main(String[] args) {
        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autonomiaMaX = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("Autonomia Máxima : " + autonomiaMaX + "Km");
        System.out.println("Autonomia Atual : " + autonomiaAtual + "Km");

        if (autonomiaAtual >= 200) {
            System.out.println("Você conseguirá terminar a viagem");
        } else {
            System.out.println("Você não conseguirá terminar a viagem");
        }
    }
}
