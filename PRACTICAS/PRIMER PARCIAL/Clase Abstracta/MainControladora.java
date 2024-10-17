public class Controlador {
    public static void main(String[] args) {
        // Iniciar un nuevo hilo para la clase Reloj
        new Thread(new Reloj()).start();
        
        // Iniciar un nuevo hilo para la clase Ejecutor con el comando "calc" y periodo 0
        new Thread(new Ejecutor("calc", 0)).start();
    }
}
