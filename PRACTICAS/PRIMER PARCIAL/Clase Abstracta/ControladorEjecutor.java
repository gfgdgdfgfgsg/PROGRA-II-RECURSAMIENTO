import java.util.Scanner;

public class ControladorEjecutor {
    public static void main(String[] args) {
        // Crear un objeto Ejecutor con un comando inicial y periodo
        Ejecutor e = new Ejecutor("calc", 1);
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un comando
        System.out.println("Escribe un comando para ejecutar:");
        String comandoUsuario = leer.nextLine();
        
        // Establecer el comando ingresado por el usuario
        e.comando = comandoUsuario;
        
        // Verificar si necesita ejecución y ejecutar la tarea
        if (e.necesitaEjecucion()) {
            e.ejecutarTarea();
        } else {
            System.out.println("No es necesario ejecutar la tarea en este momento.");
        }
        
        // Cerrar el scanner
        leer.close();
    }
}
