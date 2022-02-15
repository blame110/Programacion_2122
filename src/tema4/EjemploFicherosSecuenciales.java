package tema4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import tema3.Libro;

public class EjemploFicherosSecuenciales {
	
	
	public static void lecturaSecuencial(String rutaFichero)
	{
		//Definimos los objetos para la lectura
		try {
			FileInputStream fin = new FileInputStream(rutaFichero);
			DataInputStream din = new DataInputStream(fin);
			
			//Creo un objeto de tipo libro para almacenar cada registro
			//del fichero
			Libro libroLectura = new Libro();
			
			
			//Leemos los datos del fichero en el mismo orden
			//En el que se escribieron
			libroLectura.setNombre(din.readUTF());
			libroLectura.setAutor(din.readUTF());
			libroLectura.setCategoria(din.readInt());
			libroLectura.setEjemplaresVendidos(din.readInt());
			libroLectura.setNumPaginas(din.readInt());
			libroLectura.setPrestado(din.readBoolean());
			libroLectura.setDiaPrestado(din.readInt());
			libroLectura.setAnioPub(din.readInt());
			libroLectura.setIsbn(din.readUTF());
			
			System.out.println("Libro leido: " + libroLectura.toString());

			
			
			//Cerramos los stream de los ficheros
			din.close();
			fin.close();
			
		//Controlamos las excepciones con los posibles fallos
		//Que podemos al leer ficheros
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro arrayLibros[] = new Libro[100];
		//Creamos un array de 100 libros aleatorios
		for (int i=0;i<100;i++)
		{
			int categoria = (int)(Math.random()*4);
			int anio = 1900 + (int)(Math.random()*120);
			arrayLibros[i] = new Libro("Libro"+(i+1),"Margarett",categoria, 120000, 367, true,
					23, anio, "asdfasf-234");
		}
		
		try {
			//Abro el fichero
			FileOutputStream fos = new FileOutputStream("c:\\logs\\ficheroSecuencial.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			
			//Recorremos el array de libros
			for(int i=0;i<arrayLibros.length;i++)
			{
				//Para cad libro escribimos los datos en el fichero
				//Dependiendo del tipo de dato lo escribimos de un tipo u otro
				dos.writeUTF(arrayLibros[i].getNombre());
				dos.writeUTF(arrayLibros[i].getAutor());
				dos.writeInt(arrayLibros[i].getCategoria());
				dos.writeInt(arrayLibros[i].getEjemplaresVendidos());
				dos.writeInt(arrayLibros[i].getNumPaginas());
				dos.writeBoolean(arrayLibros[i].isPrestado());
				dos.writeInt(arrayLibros[i].getDiaPrestado());
				dos.writeInt(arrayLibros[i].getAnioPub());
				dos.writeUTF(arrayLibros[i].getIsbn());


			}
			
		
		
			//Cerramos el controlador del fichero
			dos.close();
			fos.close();
			
			lecturaSecuencial("c:\\logs\\ficheroSecuencial.dat");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
