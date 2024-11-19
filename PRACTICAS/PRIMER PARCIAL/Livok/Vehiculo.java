package clases;

abstract class Vehiculo {
    protected double KilometrosRecorridos;
    
    public abstract void mover(double distancia);
    
    public abstract double calcularAutonomia();
}
