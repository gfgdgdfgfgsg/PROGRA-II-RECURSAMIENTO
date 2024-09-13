import java.util.Random;

public class Motor {
	
	private int revoluciones;		// La cantidad de ciclos por segundo que el motor esta realizando.
	private int aire;				// Volumen en mm3 del aire que entra a un cilindro del motor.
	private int combustible;		// Volumen en mm3 de gasolina que entra a un cilindro del motor
	private boolean piston;		// Indica si el piston del cilindro esta arriba (on) o abajo (on)
	private boolean bujia;			// Indica si la bujia del cilindro esta encendida o apagada
	private boolean encendido;		// Indica si el motor se encuentra funcionando
	private Random r;			// Utilizado para motivos de simulacion del entorno del motor.
	
	/**
	* Inicializa un nuevo objeto Motor.
	*/
	public Motor() {
		aire = 0;
		combustible = 0;
		revoluciones = 0;
		encendido = false;
		r = new Random();
	}
	
	/**
	* Llena el cilindro con la cantidad y proporcion necesarias de aire y combustible para que se realize la combustion.
	*/
	private void prepararMezcla() {
		while(!(Math.abs(aire - combustible) < 5 && (aire > 50 && combustible > 50))){
			aire += r.nextInt(10);
			combustible += r.nextInt(10);
		}
		piston = false;
	}
	
	/**
	* Sube el cilindro para comprimir la mezcla de aire y combustible. Ademas se asegura que la bujia esta apagada.
	*/
	private void comprimirMezcla(){
		piston = true;
		bujia = false;
	}
	
	
	private void encenderMezcla(){
		bujia = true;
		bujia = false;
		double energia = (aire + combustible) * 34.78 / 2;
		revoluciones += (int)(energia / 100);
		piston = false;
		eliminarDesechos(energia);
	}
	
	/**
	* Elimina los desechos producidos tras realizar la combustion en el cilindro.
	*/
	private void eliminarDesechos(double residuos){
		while(residuos > 0){
			residuos -= r.nextDouble();
		}
	}

	public int getRevoluciones() {
		return revoluciones;
	}

	public boolean getEncendido() {
		return encendido;
	}

	public void setRevoluciones(int revoluciones) {
		this.revoluciones = revoluciones; 
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido; 
	}
	
	public void revolucionar() {
		if(encendido) {
			prepararMezcla();
			comprimirMezcla();
			encenderMezcla();
		}
	}
}
