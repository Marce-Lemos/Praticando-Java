package ControleBateria;

public class Bateria {
    int nivelBateria;


    public void setNivel(int nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <= 100){
            this.nivelBateria = nivelBateria;
        }
    }

    public int getNivel() {
        return this.nivelBateria;
    }

    public void mostrarDados() {
        if(nivelBateria <= 20) {
            System.out.println("Bateria fraca");
        } else if (nivelBateria <= 79 ) {
            System.out.println("Bateria OK");
        } else {
            System.out.println("Bateria cheia");
        }
    }

}
