package Tronan;

public class MundoPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos un objeto denominado joaquin de la clase Personaje
		// Para poder utilizar el objeto primero hay que crearlo
		// Utilizando new
		Personaje joaquin = new Personaje();
		Personaje manuel = new Personaje(30, 2, 15, 18, 4, "Manuel", 18,0, Personaje.HOMBRE);

		joaquin.nombre = "Joaquin";
		joaquin.edad = 18;
		joaquin.nivel = 1;
		joaquin.sexo = Personaje.HOMBRE;

		System.out.println("El nivel del jugador es: " + joaquin.nivel);
		
		if (joaquin.sexo == Personaje.HOMBRE)
			System.out.println("Bienvenido: " + joaquin.nombre);
		else
			System.out.println("Bienvenida: " + joaquin.nombre);

	}

}
