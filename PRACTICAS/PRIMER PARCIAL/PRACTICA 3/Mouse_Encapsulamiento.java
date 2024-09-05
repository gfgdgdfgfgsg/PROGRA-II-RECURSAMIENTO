package Actividad4;

import java.util.Scanner;

public class Mouse_Encapsulamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computadora_Encapsulamiento computadora = new Computadora_Encapsulamiento();

        System.out.println("Ingrese 0 para Apagar o 1 para Encender:");
        int opcion = scanner.nextInt();

        if (opcion == 0) {
            computadora.setApagar(true);
            System.out.println("Método Apagar(): " + computadora.getApagar());
        } else if (opcion == 1) {
            computadora.setEncender(true);
            System.out.println("Método Encender(): " + computadora.getEncender());
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
