import javax.swing.JOptionPane;

public class Computadora {
    int discoDuro;
    float velocidadProcesador;
    Computadora peer;
    String sistemaOperativo;
    String nombre;
    String[] memoria;

    public Computadora(String nombreEquipo) {
        discoDuro = 640;
        velocidadProcesador = 3;
        sistemaOperativo = "Microsoft Windows 7";
        nombre = nombreEquipo;
        memoria = new String[10];
    }

    public void encender() {
        JOptionPane.showMessageDialog(null, nombre + ": Iniciando Windows...");
        memoria[0] = sistemaOperativo;
        JOptionPane.showMessageDialog(null, nombre + ": Bienvenido");
    }

    public boolean ejecutar(String programa, int posicion) {
        if (posicion != 0) {
            memoria[posicion] = programa;
            JOptionPane.showMessageDialog(null, nombre + ": Ejecutando el programa " + programa);
            return true;
        }
        return false; 
    }

    public void recibirDatos(String mensaje) {
        JOptionPane.showMessageDialog(null, peer.nombre + " dice: " + mensaje);
    }

    public void enviarDatos(String mensaje) { 
        peer.recibirDatos(mensaje);
    }

    public void conectar(Computadora c) {
        this.peer = c;
        c.peer = this;
        JOptionPane.showMessageDialog(null, nombre + ": Conectado a " + peer.nombre);
    }

    public void desconectar(String otroNombre) { 
        JOptionPane.showMessageDialog(null, nombre + ": Desconectado de " + peer.nombre);
        peer.peer = null;
        this.peer = null;
    }

    public void apagar() { 
        JOptionPane.showMessageDialog(null, "Cerrando sesión...");
        for (int i = 1; i < memoria.length; i++) { 
            memoria[i] = null;
        }
        JOptionPane.showMessageDialog(null, nombre + ": Windows se está cerrando");
        memoria[0] = null;
    }

    public void aumentarDiscoDuro() { 
        this.discoDuro = 1000;
    }

    public static void main(String[] args) {
        Computadora laptop = new Computadora("Laptop");
        laptop.encender();
        laptop.ejecutar("Windows Live Messenger", 1);

        Computadora tablet = new Computadora("Tablet");
        tablet.encender();
        tablet.ejecutar("Windows Live Messenger", 2);

        laptop.conectar(tablet);
        laptop.enviarDatos("Mensaje desde la laptop a la tablet");
        laptop.desconectar("Tablet");

        tablet.apagar();
        laptop.apagar();
    }
}
