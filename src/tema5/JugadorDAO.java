package tema5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JugadorDAO {


	
	
	public static int actualizarJugador2(JugadorVO jugador)
	{
		int resultado=0;
		
		String query = "UPDATE jugador SET nombre=?,edad=?,altura=?,sexo=? WHERE idjugador=?";
		
		//Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();	
		
		try {
			//Creamos el preparedstaement
			PreparedStatement pStmt = con.prepareStatement(query);
			
			//Ponemos los parametros en las ?
			pStmt.setString(1, jugador.getNombre());
			pStmt.setInt(2,jugador.getEdad());
			pStmt.setInt(3, jugador.getAltura());
			pStmt.setString(4, jugador.getSexo());
			pStmt.setInt(5, jugador.getId());
			
			//Ejecutamos la instruccion
			resultado = pStmt.executeUpdate();
			
			pStmt.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
		return resultado;
		
	}

	/**
	 * Nos introduce en la BD los datos del jugador
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param altura
	 * @param sexo
	 * @return 1 si se insert� el registro en BD, 0 si no se pudo
	 */
	public static int insertarJugador(int id, String nombre, int edad, int altura, String sexo) {
		// Variable para retornar si se pudo insertar
		int resultado = 0;

		// Conexion para acceder a BD
		Connection con = null;
		
		try {

	
			// Nos conectamos a la BD
			con = ConexionBD.conectarBD();

			// Consulta a ejecutar
			String query = "insert into jugador values (?,?,?,?,?)";

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setInt(1, id);
			pStmt.setString(2, nombre);
			pStmt.setInt(3, edad);
			pStmt.setInt(4, altura);
			pStmt.setString(5, sexo);

			// Ejecutamos la query
			resultado = pStmt.executeUpdate();

			// Cerramos el statement
			pStmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// devolvemos el resultado
		return resultado;

	}
	
	/**
	 * Nos introduce en la BD los datos del jugador
	 * 
	 * @param jugador 
	 * @return 1 si se insert� el registro en BD, 0 si no se pudo
	 */
	public static int insertarJugador(JugadorVO jugador) {
		// Variable para retornar si se pudo insertar
		int resultado = 0;

		// Conexion para acceder a BD
		Connection con = null;
		
		try {

	
			// Nos conectamos a la BD
			con = ConexionBD.conectarBD();

			// Consulta a ejecutar
			String query = "insert into jugador values (?,?,?,?,?)";

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setInt(1, jugador.getId());
			pStmt.setString(2, jugador.getNombre());
			pStmt.setInt(3, jugador.getEdad());
			pStmt.setInt(4, jugador.getAltura());
			pStmt.setString(5, jugador.getSexo());

			// Ejecutamos la query
			resultado = pStmt.executeUpdate();

			// Cerramos el statement
			pStmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// devolvemos el resultado
		return resultado;

	}
	
	
	
	/**
	 * Por hacer
	 * Recibe el id del jugador y lo elimina de BD
	 * @param idJugador identificador del jugador a borrar
	 * @return 1 si se pudo eliminar y 0 en caso contrario
	 */
	public static int eliminarJugador(int idJugador)
	{
		return 0;
	}

	public static void mostrarJugadores()
	{
		
		//Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();
		
		String query = "SELECT * FROM jugador";
		
		try {
			//Generamos el preparedStatement a partir de la query sql
			PreparedStatement pStmt = con.prepareStatement(query);
			
			//Ejecutamos la query y nos devuelve los datos 
			//En una estructura resultset
			ResultSet res = pStmt.executeQuery();
			
			//Boolean que nos comprueba si es el ultimo elemento
			boolean ultimo = true;
			int id=0,altura=0,edad=0;
			String sexo="",nombre="";
			
			System.out.println("********************************");
			System.out.println("**********JUGADORES*************");
			
			System.out.println("********************************");
			
			
			//Mientras haya un siguiente elemento seguimos leyendo 
			//Registros, next nos pasa al siguiente registro y nos devuelve
			//true si hay mas registros por leer
			while (res.next())
			{
			//Pasamos al siguiente elemento
			
				id = res.getInt("idjugador");
				nombre = res.getString("nombre");
				edad = res.getInt("edad");
				altura = res.getInt("altura");
				sexo = res.getString("sexo");
				
				System.out.println("Id: " + id);
				System.out.println("nombre: " + nombre);
				System.out.println("edad: " + edad);
				System.out.println("altura: " + altura);
				System.out.println("sexo: " + sexo);
				
			}
			
			System.out.println("********************************");


			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
