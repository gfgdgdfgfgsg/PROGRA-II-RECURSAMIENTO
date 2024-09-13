public class AutomovilFord {
	
	int velocidad;						// La velocidad a la que se desplaza el auto
	String color;						// El color del auto
	public String modelo;					// El modelo del auto
	Motor motor;						// El motor del auto
	public static final String marca = "Ford";	// La marca del auto
		
	/**
	* Inicializa un nuevo objeto Automovil.
	* 
	* @param modelo: El modelo del auto.
	* @param color: El color del auto
	*/
	public AutomovilFord(String modelo, String color){
		this.modelo = modelo;
		this.color = color;
		velocidad = 0;
		motor = new Motor();
	}
	
	/**
	* Inicializa un nuevo objeto Automovil.
	*/
	public AutomovilFord(){
		this("EcoSport", "Azul");
	}
	
	/**
	* Enciende el motor del automovil.
	*/
	public void encenderMotor() {
		/*motor.*/ boolean encendido = true;
		motor.setEncendido(encendido);
		System.out.println("Motor encendido");
	}
	
	/**
	* Apaga el motor del automovil.
	*/
	public void apagarMotor() {
		boolean encendido = false;
		motor.setEncendido(encendido);
		System.out.println("Motor apagado");
	}
	
	
	
	
	public void acelerar() {
		if (motor.getEncendido()) {
			/* motor.comprimirMezcla();
			motor.encenderMezcla();
			motor.prepararMezcla();	*/	
			motor.revolucionar();	
			velocidad = (motor.getRevoluciones() / 100);
			System.out.println("Vamos a " + velocidad + " kph");			
		} else {
			System.out.println("El motor esta apagado!");
		}
	}
	

	public void frenar(int cantidad) {
		cantidad = motor.getRevoluciones();
		if(velocidad < 0) velocidad = 0;
		System.out.println("Vamos a " + velocidad + " kph");	
	}
	

	* @return la velocidad del auto.
	*/
	public int getVelocidad() {
		return velocidad;
	}
}
