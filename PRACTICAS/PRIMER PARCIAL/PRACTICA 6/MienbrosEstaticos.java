

// Paso 2: Crear la clase Estático
public class Estático {

    // Paso 3: Atributo privado tipo String llamado frase
    private static String frase = "Primera frase";

    // Método para imprimir la frase
    public void imprimirFrase() {
        System.out.println(frase);
    }

    // Paso 6: Método estático para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Paso 4: Crear un objeto 1 e imprimirlo
        Estático objeto1 = new Estático();
        objeto1.imprimirFrase(); // Imprime "Primera frase"

        // Paso 5: Crear un objeto 2 y modificar la frase
        Estático objeto2 = new Estático();
        objeto2.frase = "Segunda frase"; // Cambia la frase

        // Imprime la frase del objeto 2
        objeto2.imprimirFrase(); // Imprime "Segunda frase"

        // Hacer el atributo estático
        Estático.frase = "Frase modificada"; // Cambia la frase estática

        // Imprimir la frase desde el objeto 1 después del cambio
        objeto1.imprimirFrase(); // Imprime "Frase modificada"
        
        // Paso 7: Imprimir el resultado del método estático
        int resultado = Estático.sumar(5, 10);
        System.out.println("La suma es: " + resultado); // Imprime "La suma es: 15"
    }
}
