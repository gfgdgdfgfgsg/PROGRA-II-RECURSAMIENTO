package clases;

public class PruebaVehiculo {
public static void probarVehiculos(Vehiculo vehiculo, double distancia){
    System.out.println("\nprobando Vehiculo de tipo " +
    vehiculo.getClass().getSimpleName() + ":");
    vehiculo.mover(distancia);
    System.out.println("Autonomia Restante: " + vehiculo.calcularAutonomia() + "km");
    System.out.println("Kilometros recorridos " + vehiculo.KilometrosRecorridos + "km");
    System.out.println("----------------------------------");
}
    
    public static void main(String[] args) {
        //Crear diferentes tipos de vehiculos
        Coche coche = new Coche(50, 500);
        Camion camion = new Camion(100, 800);
        Bicicleta bicicleta = new Bicicleta();
        
        //probar vehiculos
        probarVehiculos(coche, 100);
        probarVehiculos(camion, 100);
        probarVehiculos(bicicleta, 50);
    }
}
