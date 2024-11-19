package clases;

public class Bicicleta extends Vehiculo{
    
    public Bicicleta(){
        this.KilometrosRecorridos = 0;
    }

    @Override
    public void mover(double distancia) {
        KilometrosRecorridos += distancia;
        System.out.println("La bicicleta ha recorrido " + distancia + "km");
    }

    @Override
    public double calcularAutonomia() {
        return -1;
    }
    
}
