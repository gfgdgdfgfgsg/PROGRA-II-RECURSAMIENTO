package clases;

public class Camion extends Coche{
    
    public Camion(double combustible, double AutonomiaMaxima) {
        super(combustible, AutonomiaMaxima);
    }
    
        @Override
    public void mover(double distancia) {
        if(combustible > 0){
            if(distancia <= calcularAutonomia()){
                KilometrosRecorridos += distancia;
                combustible -= distancia/5;
                System.out.println("El camion ha recorrido " + distancia + "km");
            } else{
                System.out.println("No hay suficiente combustible para recorrer esa distancia");
            }
        } else{
            System.out.println("El camion no tiene combustible");
        }
    }

    @Override
    public double calcularAutonomia() {
        return combustible * 5;
    }
    
