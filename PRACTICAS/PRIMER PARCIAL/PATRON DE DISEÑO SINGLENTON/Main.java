public class Main {
    public static void main(String[] args) {
    
        PatronDeDiseñoSingleton singleton = PatronDeDiseñoSingleton.getInstance();
        
        singleton.mostrarMensaje();
        
        PatronDeDiseñoSingleton otroSingleton = PatronDeDiseñoSingleton.getInstance();
        
        System.out.println(singleton == otroSingleton); // Esto imprimirá 'true'
    }
}
