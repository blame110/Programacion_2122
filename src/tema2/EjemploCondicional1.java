package tema2;

import java.util.Scanner;

public class EjemploCondicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = 0;
		float sueldo = 0.0F;
		String nombre = "", password = "", estadoCivil = "";

		Scanner teclado = new Scanner(System.in);

		// Leemos los datos de teclado
		System.out.println("introduce tu nombre:");
		// Nextline recibe tambien los espacios en blanco
		nombre = teclado.nextLine();

		System.out.println("introduce tu contraseña:");
		// Nextline recibe tambien los espacios en blanco
		password = teclado.nextLine();

		System.out.println("introduce tu estado civil(Soltero, Casado, Divorciado, Zombie):");
		// Nextline recibe tambien los espacios en blanco
		estadoCivil = teclado.nextLine();

		System.out.println("introduce tu edad:");
		edad = teclado.nextInt();

		System.out.println("introduce tu sueldo:");
		sueldo = teclado.nextFloat();

		// Si la edad es mayor o igual de 70 pasa por la puerta C
		if (edad >= 70) {
			// Entra en este código si la condición es cierta
			System.out.println("Pase por la puerta C, por favor.");
		}

		// Si la edad es par lo mandamos por la puerta roja
		// La comparacion son dos ==, la asignacion de valores solo 1 =
		// Para saber si es par obtenemos el resto % de la divison entre 2,
		// Si es 0 es que es par

		if (edad % 2 == 0) {
			System.out.println("Pase por la puerta roja, muahahahaha");
		}

		// El nombre no puede tener más de 8 caracteres
		if (nombre.length() > 8) {
			System.out.println("El nombre no puede tener más de 8 carácteres");
		} else
		// Este código se ejecuta cuando la condicion del if es falsa
		{
			// Guardamos la primera letra del nombre en una variable de tipo char
			char cInicial = nombre.charAt(0);

			// Comprobamos que ese caracter no es un numero
			if (cInicial == '0' || cInicial == '1' || cInicial == '2' || cInicial == '3' || cInicial == '4'
					|| cInicial == '5' || cInicial == '6' || cInicial == '7' || cInicial == '8' || cInicial == '9') {
				System.out.println("El primer carácter del nombre no puede ser un número");
			}
		}

	}// Cerramos el main
}
