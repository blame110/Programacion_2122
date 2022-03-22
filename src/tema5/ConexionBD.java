package tema5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConexionBD {

	/*
	 * Siempre que utilizamos un servicio necesitamos
	 * Conectarnos al servicio, para eso es esta clase
	 * 
	 * Se necesitan siempre 4 parametros para conectarnos a un servicio
	 * ip o nombre de dominio: localhost en nuestro caso que es nuestra maquina
	 * usuario:root
	 * password:toor (en vuestro caso "");
	 * puerto de comunicaciones del servicio:3306 para mysql
	 * Base de datos o esquema a utilizar
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Parametros para la conexion a BD
		String user= "root";
		String password = "toor";
		String url = "jdbc:mysql://localhost:3306/grandslam";
		//Conexion para acceder a BD
		Connection con = null;
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			
			//Nos conectamos a la Base de Datos
			con = DriverManager.getConnection(url, user, password);
			
			//Pedimos los datos del jugador
			System.out.println("Introduce el id:");
			int id = teclado.nextInt();
			
			System.out.println("Nombre:");
			String nombre = teclado.next();
	
			System.out.println("Introduce la edad:");
			int edad = teclado.nextInt();

			System.out.println("Introduce la altura:");
			int altura = teclado.nextInt();

			System.out.println("Sexo:");
			String sexo = teclado.next();
			
			//Consulta a ejecutar
			String query = "insert into jugador values (?,?,?,?,?)";
			
			//El preparedStatement lo genera la conexion utilizando
			//la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);
			
			pStmt.setInt(1,id);
			pStmt.setString(2, nombre);
			pStmt.setInt(3, edad);
			pStmt.setInt(4, altura);
			pStmt.setString(5,sexo);
			
			//Ejecutamos la query
			pStmt.execute();
			
			//Cerramos el statement
			pStmt.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		//Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		teclado.close();
	}

}
