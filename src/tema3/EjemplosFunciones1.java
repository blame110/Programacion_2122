package tema3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class EjemplosFunciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = { 3, 23, 8, 2, 3 };
		int num1 = 7, num2 = 8;
		Date fecha = new Date();

		System.out.println("La suma de 4 y 5 es:" + suma(23, 5));

		System.out.println("La suma de los numeros es:" + suma(num1, num2));

		System.out.println("El máximo del array es " + max(numeros));

		System.out.println(fecha.getDate());
		
		//Genero dos listas de numeros
		int lista1[] = genListaNumeros(50);
		int lista2[] = genListaNumeros(150);
		int lista3[] = concatenarListasNumeros(lista1, lista2);
		
		mostrarContenido(lista1);
		mostrarContenido(lista2);
		mostrarContenido(lista3);
		
	}

	/**
	 * La funcion suma dos numeros
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la suma
	 */
	public static int suma(int num1, int num2) {
		int resultado = 0;
		resultado = num1 + num2;

		return resultado;
	}

	public static int longitudCad(String cadena) {
		return cadena.length();
	}

	/**
	 * Devuelve el valor maximo de un array de numeros
	 * 
	 * @param listaNumeros array de numeros
	 * @return
	 */
	public static int max(int listaNumeros[]) {
		int max = Integer.MIN_VALUE;
		// Recorremos el array buscando el máximo
		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] > max)
				max = listaNumeros[i];
		}

		// Devolvemos el máximo
		return max;
	}

	/**
	 * Nos comprueba si la letra que recibe es una vocal
	 * 
	 * @param letra
	 * @return
	 */
	static boolean esVocal(char letra) {
		if (Character.toLowerCase(letra) == 'a' || Character.toLowerCase(letra) == 'e'
				|| Character.toLowerCase(letra) == 'i' || Character.toLowerCase(letra) == 'o'
				|| Character.toLowerCase(letra) == 'u') {
//Si lo cumple devolvemos ciert
			return true;
		} else
			return false;

	}

	/**
	 * Recibe dos parametros
	 * @param listaNum1
	 * @param listaNum2
	 * @return
	 */
	static int[] concatenarListasNumeros(int listaNum1[], int listaNum2[]) {
		
		// El tamaño del array final sera la suma de los tamaños de los dos arrays
		// Que recibimos como parametros en la funcion
		int tamTotal = listaNum1.length + listaNum2.length;
		int arrayResultado[] = new int[tamTotal];
		
		// Copiamos el primer array
		for (int i = 0; i < listaNum1.length; i++) {
			arrayResultado[i] = listaNum1[i];
		}

		// Copiamos el segundo array a partir de la primera posición vacia
		//En el arrayResultado, que es la longitud del primer array
		for (int i = 0; i < listaNum2.length; i++) {
			arrayResultado[i+listaNum1.length] = listaNum2[i];
		}
		
		//Devolvemos el array
		return arrayResultado;

	}
	
	/**
	 * Muestra por pantalla los numeros de un array
	 * @param listaNum
	 */
	static void mostrarContenido(int listaNum[])
	{
		//Mostramos todos los elementos
		int i=0;
		while (i<listaNum.length)
		{
			System.out.println("Posición "+ (i+1) + ": " +listaNum[i]);
			i++;
		}

		
	}
	
	/**
	 * Nos genera un array de numeros aleatorios
	 * @param longitud
	 * @return
	 */
	static int[] genListaNumeros(int longitud)
	{
		//Creamos un array de numeros con la longitud que nos
		//Pasan como parametro
		int listaGenerada[] = new int[longitud];
		
		for (int i=0;i<listaGenerada.length;i++)
		{
			listaGenerada[i]=(int)(Math.random()*100+1);
		}
		
		//Devolvemos la lista
		return listaGenerada;
	}

}
