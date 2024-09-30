public class TrianguloIsosceles {
    private double lado;  // Longitud de los lados iguales
    private double base;  // Longitud de la base

    /**
     * Constructor para crear un triángulo isósceles.
     * 
     * @param lado: longitud de los lados iguales
     * @param base: longitud de la base
     */
    public TrianguloIsosceles(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }

    /**
     * Calcula el perímetro del triángulo isósceles.
     * 
     * @return el perímetro
     */
    public double calcularPerimetro() {
        return 2 * lado + base; // Perímetro = 2 * lado + base
    }

    /**
     * Calcula el área del triángulo isósceles.
     * 
     * @return el área
     */
    public double calcularArea() {
        double altura = Math.sqrt(Math.pow(lado, 2) - Math.pow(base / 2, 2)); // Altura = sqrt(lado^2 - (base/2)^2)
        return (base * altura) / 2; // Área = (base * altura) / 2
    }

    // Métodos getters
    public double getLado() {
        return lado;
    }

    public double getBase() {
        return base;
    }

    // Método toString para representar el triángulo
    @Override
    public String toString() {
        return "Triángulo Isósceles [Lado: " + lado + ", Base: " + base + "]";
    }
}
