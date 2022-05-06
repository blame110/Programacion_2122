package tema5Entornos;

public class Repartidor extends Persona{

	private String motoAsignada="";
	private String turno ="";
	boolean extraVelocidad=false;
	double sueldo=0;
	
	
	public Repartidor(String nombre, char genero, String direccion, int edad,String motoAsignada, String turno, boolean extraVelocidad, double sueldo) {
		
		//Llamamos al constructor de la clase padre, que es persona
		//Con los datos propios suyos
			super(nombre,genero,direccion,edad);
			
			this.motoAsignada = motoAsignada;
			this.turno = turno;
			this.extraVelocidad = extraVelocidad;
			this.sueldo = sueldo;
			
		}
	
	public Repartidor(String motoAsignada, String turno, boolean extraVelocidad, double sueldo) {
		super();
		this.motoAsignada = motoAsignada;
		this.turno = turno;
		this.extraVelocidad = extraVelocidad;
		this.sueldo = sueldo;
	}
	public String getMotoAsignada() {
		return motoAsignada;
	}
	public void setMotoAsignada(String motoAsignada) {
		this.motoAsignada = motoAsignada;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public boolean isExtraVelocidad() {
		return extraVelocidad;
	}
	public void setExtraVelocidad(boolean extraVelocidad) {
		this.extraVelocidad = extraVelocidad;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public double calculoSueldo()
	{
		return this.sueldo - this.sueldo*this.calculoRenteciones()/100;
	}
	
	@Override
	public int calculoRenteciones() {
		//A los repartidores se les retiene solo un 10%
		return 10;
	}
	
	
	
}
