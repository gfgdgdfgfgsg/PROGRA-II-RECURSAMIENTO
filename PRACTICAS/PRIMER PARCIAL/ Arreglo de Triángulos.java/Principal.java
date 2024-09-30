import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de triángulos
        System.out.print("Ingrese la cantidad de triángulos que desea ingresar: ");
        int cantidad = scanner.nextInt();

        // Crear un arreglo para almacenar triángulos
        TrianguloIsosceles[] triangulos = new TrianguloIsosceles[cantidad];

        // Obtener los valores de base y lado para cada triángulo
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nTriángulo " + (i + 1) + ":");
            System.out.print("Ingrese la longitud de los lados iguales: ");
            double lado = scanner.nextDouble();
            System.out.print("Ingrese la longitud de la base: ");
            double base = scanner.nextDouble();

            // Crear un nuevo triángulo y añadirlo al arreglo
            triangulos[i] = new TrianguloIsosceles(lado, base);
        }

        // Mostrar el área y el perímetro de cada triángulo
        for (int i = 0; i < triangulos.length; i++) {
            TrianguloIsosceles t = triangulos[i];
            System.out.println("\nTriángulo " + (i + 1) + ": " + t);
            System.out.println("Perímetro: " + t.calcularPerimetro());
            System.out.println("Área: " + t.calcularArea());
        }

        // Llamar al método mayorArea para determinar el triángulo con mayor área
        TrianguloIsosceles mayorTriangulo = mayorArea(triangulos);
        if (mayorTriangulo != null) {
            System.out.println("\nTriángulo con mayor área: " + mayorTriangulo);
            System.out.println("Área mayor: " + mayorTriangulo.calcularArea());
        }

        scanner.close();
    }

    /**
     * Método para encontrar el triángulo con el área mayor.
     * 
     * @param triangulos: arreglo de triángulos
     * @return el triángulo con el área mayor
     */
    public static TrianguloIsosceles mayorArea(TrianguloIsosceles[] triangulos) {
        if (triangulos == null || triangulos.length == 0) {
            return null; // Devuelve null si el arreglo está vacío
        }

        TrianguloIsosceles mayor = triangulos[0];

        for (TrianguloIsosceles t : triangulos) {
            if (t.calcularArea() > mayor.calcularArea()) {
                mayor = t; // Actualiza el triángulo mayor si se encuentra uno con área mayor
            }
        }

        return mayor; // Devuelve el triángulo con el área mayor
    }
}
