import java.util.Scanner;

public class ControladorReloj {
    public static void main(String[] args) {
        // Crear un objeto Reloj
        Reloj reloj = new Reloj();
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un comando para ejecutar
        System.out.println("Escribe un comando para ejecutar (presiona Enter para ver la hora):");
        leer.nextLine(); // Esperar a que el usuario presione Enter
        
        // Verificar si necesita ejecución y ejecutar la tarea
        if (reloj.necesitaEjecucion()) {
            reloj.ejecutarTarea();
        } else {
            System.out.println("No es necesario ejecutar la tarea en este momento.");
        }
        
        // Mostrar la hora actual
        System.out.println("Hora actual: " + reloj.leerHora());
        
        // Cerrar el scanner
        leer.close();
    }
}
