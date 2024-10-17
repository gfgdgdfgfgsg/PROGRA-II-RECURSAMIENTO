import java.util.*;

public class Reloj extends TareaPeriodica {

    public Reloj() {
        super(60);
    }

    public boolean necesitaEjecucion() {
        // Implementación simple que siempre retorna true
        return true; // O lógica específica para el reloj
    }

    public int ejecutarTarea() {
        // Aquí podrías implementar alguna lógica relacionada con el reloj
        System.out.println("Ejecutando tarea del reloj.");
        return 0; // Retorna 0 para indicar éxito
    }

    public String leerHora() {
        Calendar cal = new GregorianCalendar();
        return cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);
    }
}
