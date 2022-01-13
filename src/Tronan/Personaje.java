package Tronan;

/**
 * Clase Personaje
 * 
 * @author pablo personaje del juego tronan
 */
public class Personaje {

	// Constantes Globales de la clase
	public static final int HOMBRE = 1;
	public static final int MUJER = 2;

	// Variables Miembro
	public int vida;
	public int nivel;
	public int fuerza;
	public int destreza;
	public int resistencia;
	public String nombre;
	public int edad;
	// Pongo la variable miembro estado privada
	// solo es accesible desde dentro de su misma clase
	private int estado;
	public int sexo;

	
	
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
	Personaje ()
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

		fuerza = RPGUtils.tirarDados() / 8 + 1;
		destreza = RPGUtils.tirarDados() / 8 + 1;
		resistencia = RPGUtils.tirarDados() / 8 + 1;

	}
}
