package tema2;

import javax.swing.JOptionPane;

public class EjemploCondicional2 {

	public static final int PORCENTAJE_BECA6000 = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El programa leera por teclado la nota de un alumno que sera un float, su
		// nombre, edad y curso
		// Mostrara SUSPENSO, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE dependiendo de la
		// nota

		// Si es de tercero y tiene sobresaliente o es mayor de edad se mostrará el
		// mensaje
		// "APROBADO CON EXCELENCIA"

		// A todos los que tengan sobresaliente mayores de 14 años tendrán beca

		// se pide que el código este bien comentado y las variables con los nombres
		// adecuados
		// en el formato adecuado, por ejemplo notaAlumno

		JOptionPane.showMessageDialog(null, "Ventana de Mensajes", "Este es el Mensaje",
				JOptionPane.INFORMATION_MESSAGE);

		String nombre = JOptionPane.showInputDialog(null, "Nombre", "Introduce tu nombre",
				JOptionPane.QUESTION_MESSAGE);

		System.out.println("Tu nombre es: " + nombre);

	}

}
