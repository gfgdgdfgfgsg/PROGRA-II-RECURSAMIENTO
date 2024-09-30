import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        // Crear una lista para almacenar triángulos
        List<TrianguloIsosceles> triangulos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            // Solicitar al usuario las dimensiones del triángulo
            System.out.print("Ingrese la longitud de los lados iguales: ");
            double lado = scanner.nextDouble();
            System.out.print("Ingrese la longitud de la base: ");
            double base = scanner.nextDouble();

            // Crear un nuevo triángulo y añadirlo a la lista
            TrianguloIsosceles triangulo = new TrianguloIsosceles(lado, base);
            triangulos.add(triangulo);

            // Mostrar el perímetro y el área del triángulo
            System.out.println("Triángulo creado: " + triangulo);
            System.out.println("Perímetro: " + triangulo.calcularPerimetro());
            System.out.println("Área: " + triangulo.calcularArea());

            // Preguntar si desea continuar
            System.out.print("¿Desea agregar otro triángulo? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar todos los triángulos creados
        System.out.println("\nTriángulos creados:");
        for (TrianguloIsosceles t : triangulos) {
            System.out.println(t);
        }

        // Calcular y mostrar el triángulo con mayor área
        TrianguloIsosceles mayorTriangulo = mayorArea(triangulos.toArray(new TrianguloIsosceles[0]));
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
