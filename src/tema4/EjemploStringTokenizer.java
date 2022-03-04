package tema4;

import java.util.StringTokenizer;

import tema3.Libro;

public class EjemploStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Linea con los campos separados por ,
		String linea = "El nombre del viento,Patrick Rothfuss,2,2000,700,true,23,2004,asdf-ereww-ew3";
		
		Libro listaLibros[] = new Libro[10];
		//Creo un libro que es donde voy a guardar los datos
	    Libro libroLeido = new Libro();
		
		StringTokenizer st = new StringTokenizer(linea,",");
		
		libroLeido.setNombre(st.nextToken());
		libroLeido.setAutor(st.nextToken());
		libroLeido.setCategoria(Integer.valueOf(st.nextToken()));
		libroLeido.setAnioPub(Integer.valueOf(st.nextToken()));
		libroLeido.setNumPaginas(Integer.valueOf(st.nextToken()));
		libroLeido.setPrestado(Boolean.valueOf(st.nextToken()));
		libroLeido.setDiaPrestado(Integer.valueOf(st.nextToken()));
		libroLeido.setEjemplaresVendidos(Integer.valueOf(st.nextToken()));
		libroLeido.setIsbn(st.nextToken());
		
		//En el caso del ejercicio de coches habria que leer todas las lineas
		//Previamente tendriamos que llamar a contarLineas para saber cuantas lineas
		//Tiene el fichero, hacemos un bucle y para cada linea utilizamos
		//El stringtokenizer para sacar un objeto y meterlo en el array de Coches
		listaLibros[0] = libroLeido;
		
		System.out.println(libroLeido.toString());



		
		/*
		//Mientras haya mas elementos separados por , en el string los sacamos
		//Por pantalla
		int i=1;
		while (st.hasMoreElements())
		{
			System.out.println("Elemento numero" + i + ":" +st.nextToken());
			i++;
		}
		*/

	}

}
