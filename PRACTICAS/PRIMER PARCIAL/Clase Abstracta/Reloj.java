import java.util.*;

public class Reloj extends TareaPeriodica {
    public Reloj() {
        super(60);
    }

    public boolean necesitaEjecucion() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(ultimaEjecucion);
        cal.add(Calendar.SECOND, periodo);
        Calendar ahora = new GregorianCalendar();
        return ahora.before(cal);
    }

    public int ejecutarTarea() {
        Calendar c = new GregorianCalendar();
        System.out.println(String.format("%d:%d:%d", 
            c.get(Calendar.HOUR_OF_DAY), 
            c.get(Calendar.MINUTE), 
            c.get(Calendar.SECOND)));
        return 0; // Retorna 0 para indicar éxito
    }

    public void run() {
        if (this.necesitaEjecucion()) {
            this.ejecutarTarea();
        }
    }

    public String leerHora() {
        Calendar cal = new GregorianCalendar();
        return cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);
    }
}
