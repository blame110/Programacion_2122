package Tema1;


public class sumaDosNumerosAleatorios {

	public static void main(String[] args) {
	
		//Definicion de variables
		//Creamos 3 numeros enteros para las operaciones
		int numero1;
		int numero2;
		int resultado;
		
		/*
		 * Generamos un número aleatorio utilizando la función random de la libreria MAth
		 * random genera un numero entre 0 y 1 en formato double, hay que convertirlo
		 * a int utilizando (int). Lo multimplicamos x100 para que el número sea entre 1 y 100
		 * Se mete entre parentesis la multiplicación x100 para que la haga primero
		 */
		numero1=(int) (Math.random()*100);
		
		//Mostramos el número1 generado
		System.out.println("El numero 1 es: " + numero1 + ", Ahora generaremos el siguiente");
		
		numero2=(int) (Math.random()*100);
		
		//Mostramos el número2 generado
		System.out.println("El numero 2 es: " + numero2);

		resultado=numero1+numero2;
		
		System.out.println("La suma de los dos número es:" +  resultado);
		
	}

}
