package Tronan;

public class MundoPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos un objeto denominado joaquin de la clase Personaje
		// Para poder utilizar el objeto primero hay que crearlo
		// Utilizando new
		Personaje joaquin = new Personaje();
		Personaje manuel = new Personaje(30, 2, 15, 18, 4, "Manuel", 18,0, Personaje.HOMBRE);

		//Como la region es estatica se puede acceder a ella  
		//sin crear un objeto
		Personaje.region = "Pantano Oscuro";
		
		joaquin.nombre = "Joaquin";
		joaquin.edad = 18;
		joaquin.nivel = 1;
		joaquin.sexo = Personaje.HOMBRE;
		joaquin.setDestreza(18);
	

		System.out.println("El nivel del jugador es: " + joaquin.nivel);
		System.out.println("La edad del jugador es: " + joaquin.edad);
		System.out.println("Joaquin esta en la Region de: " + joaquin.region);
		System.out.println("Manuel esta en la Region de: " + manuel.region);
		
		//Al ser el atributo region static, el valor se comparte para todos los objetos
		//Aunque lo cambie en el objeto joaquin se cambia para todos los objetos
		//de la clase Personaje
		joaquin.region = "Fosa del Terror";
		
		System.out.println("Manuel esta en la Region de: " + manuel.region);

		
		
		if (joaquin.sexo == Personaje.HOMBRE)
			System.out.println("Bienvenido: " + joaquin.nombre);
		else
			System.out.println("Bienvenida: " + joaquin.nombre);
		
		assert joaquin != null;

		
		System.out.println("antes de subir nivel:" + joaquin.toString());
		joaquin.subirNivel();
		System.out.println("despues de subir nivel:" + joaquin.toString());


	}

}
