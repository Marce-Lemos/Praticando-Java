package ControleTemperatura;

public class Sensor {
    String local;
    double temperatura;

    public Sensor (String local, double temperatura){
        this.local = local;
        this.temperatura = temperatura;
    }

    public void info(){
        System.out.printf("Sensor no local: %s\nTemperatura: %.1f°C\n", local, temperatura);

        if(temperatura > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}