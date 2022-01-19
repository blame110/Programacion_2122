package Tronan;

/**
 * Clase Personaje
 * 
 * @author pablo personaje del juego tronan
 */
public class Personaje {

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	// Constantes Globales de la clase
	public static final int HOMBRE = 1;
	public static final int MUJER = 2;

	// Variables Miembro
	//Si la definimos publica es visible desde cualquier lugar
	public int vida;
	public int nivel;
	public int fuerza;
	//Si la definimos privada es sólo visible desde el código de nuestra clase
	private int destreza;
	public int resistencia;
	public String nombre;
	//Si la definimos protected es visible desde el paquete donde este la clase
	//Y las clases que hereden
	protected int edad;
	public static String region;
	// Pongo la variable miembro estado privada
	// solo es accesible desde dentro de su misma clase
	private int estado;
	public int sexo;
	
	private armadura armaduras[];
	
	public armadura[] getArmaduras() {
		return armaduras;
	}

	public void setArmaduras(armadura[] armaduraCargar)
	{
		this.armaduras = armaduraCargar;
	}
	
	
	public Personaje(int vida, int nivel, int fuerza, int destreza, int resistencia, String nombre, int edad,
			int estado, int sexo) {
		super();
		this.vida = vida;
		this.nivel = nivel;
		this.fuerza = fuerza;
		this.destreza = destreza;
		this.resistencia = resistencia;
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.sexo = sexo;
	}

	/**
	 * Constructor de la clase Personaje
	 * Se ejecuta cuando creamos el objeto con new
	 */
	public Personaje ()
	{
		//Inicializamos las variables
		vida=0;
		nivel=0;
		fuerza=0;
		destreza=0;
		resistencia=0;
		nombre="";
		edad=0;
		estado=0;
		sexo=0;
	}
	
	/**
	 * Metodo que sube de nivel al personaje
	 */
	public void subirNivel() {
		// Subimos el nivel
		nivel++;

		fuerza =fuerza + RPGUtils.tirarDados() / 8 + 1;
		destreza =destreza + RPGUtils.tirarDados() / 8 + 1;
		resistencia =resistencia + RPGUtils.tirarDados() / 8 + 1;

	}
	
	public String toString()
	{
		String texto = "Nombre: "+ nombre + " Vida: " +  vida + " Nivel : " +  nivel + " Fuerza: " + fuerza;
		
		return texto;
	}
	
	
}
