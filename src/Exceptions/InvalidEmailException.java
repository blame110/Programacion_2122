package Exceptions;

/**
 * Excepción de formato de email invalido
 * @author pablo
 *
 */
public class InvalidEmailException extends Exception {

	//Cuando se genera esta excepcion, creamos una excepcion generica
	//Con el mensaje
	public InvalidEmailException(String mensaje)
	{
		super(mensaje);
	}
	
}
