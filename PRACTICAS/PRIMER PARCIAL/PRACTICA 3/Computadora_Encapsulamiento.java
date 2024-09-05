package Actividad4;

public class Computadora_Encapsulamiento {
    // Atributos privados
    private Boolean Encender;
    private Boolean Apagar;

    // Constructor por defecto
    public Computadora_Encapsulamiento() {
        this.Encender = false; // Inicializa el estado de Encender
        this.Apagar = false;   // Inicializa el estado de Apagar
    }

    
    public Boolean getEncender() {
        return Encender;
    }

    public void setEncender(Boolean encender) {
        this.Encender = encender;
    }

    public Boolean getApagar() {
        return Apagar;
    }

    public void setApagar(Boolean apagar) {
        this.Apagar = apagar;
    }
}
