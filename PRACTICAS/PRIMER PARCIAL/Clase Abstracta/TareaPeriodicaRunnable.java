import java.util.*;

public abstract class TareaPeriodica implements Runnable {
    protected int periodo; // Periodo en segundos
    protected Date ultimaEjecucion; // Última vez que se ejecutó

    public TareaPeriodica(int periodo) {
        this.periodo = periodo;
        this.ultimaEjecucion = new Date(); // Inicializa con la fecha actual
    }

    public abstract void necesitaEjecucion(); // Método abstracto sin cuerpo
    public abstract void ejecutarTarea();      // Método abstracto sin cuerpo

    @Override
    public void run() {
        // Implementación del método run, que podría ejecutar tareas periódicamente
        while (true) {
            if (necesitaEjecucion()) {
                ejecutarTarea();
                ultimaEjecucion = new Date(); // Actualiza la última ejecución
            }
            try {
                Thread.sleep(periodo * 1000); // Espera el periodo definido
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Manejo de interrupciones
            }
        }
    }
}
