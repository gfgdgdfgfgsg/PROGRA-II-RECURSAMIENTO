package clases;

class Coche extends Vehiculo{
    protected double combustible;
    protected double AutonomiaMaxima;
    
    public Coche(double combustible,double AutonomiaMaxima){
        this.combustible = combustible;
        this.AutonomiaMaxima = AutonomiaMaxima;
        this.KilometrosRecorridos = 0;
    }

    @Override
    public void mover(double distancia) {
        if(combustible > 0){
            if(distancia <= calcularAutonomia()){
                KilometrosRecorridos += distancia;
                combustible -= distancia/10;
                System.out.println("El coche ha recorrido " + distancia + "km");
            } else{
                System.out.println("No hay suficiente combustible para recorrer esa distancia");
            }
        } else{
            System.out.println("El coche no tiene combustible");
        }
    }

    @Override
    public double calcularAutonomia() {
        return combustible * 10;
    }
    
}
