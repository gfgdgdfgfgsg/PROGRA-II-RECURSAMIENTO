public final class PatronDeDiseñoSingleton {
    private static PatronDeDiseñoSingleton instancia;

 
    private PatronDeDiseñoSingleton() {
       
    }


    public static PatronDeDiseñoSingleton getInstance() {
        if (instancia == null) {
            instancia = new PatronDeDiseñoSingleton();
        }
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("¡Soy la única instancia de PatronDeDiseñoSingleton!");
    }
}
