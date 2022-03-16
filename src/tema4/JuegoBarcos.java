package tema4;

public class JuegoBarcos {
	
	//Tablero de juego
	public char tableroJuego[][];
	
	public static final char AGUA = 'A';
	public static final char DISPARO = 'D';
	public static final char TOCADO = 'T';
	public static final char BARCO = 'B';
	
	public static final int ARRIBA=0;
	public static final int ABAJO=1;
	public static final int DERECHA=2;
	public static final int IZQUIERDA=3;


	
	//Constructor
	public JuegoBarcos() {
		super();
		
		//Defino el tamaño del tablero
		tableroJuego = new char[10][10];
		//Inicializamos las casillas
		inicializarJuego();
	
	}
	
	

	public void mostrarTablero()
	{
		
		//Recorremos los 10 arrays
		for (int i=0; i<tableroJuego.length;i++)
		{
			
			//barcosNavegando[i] es un array, lo recorremos
			for (int j=0;j<tableroJuego[i].length;j++)
			{
				//Mostramos por pantalla todas las posiciones
				System.out.print(tableroJuego[i][j] + " ");
				
			}
			
			//Pasamos a la siguiente linea
			System.out.println();
			
		}

		
	}
	
	int generarDireccion()
	{
		return (int)(Math.random()*4);
	}
	
	/**
	 * Posiciona aleatoria
	 * @return un numero entre 0 y 9 
	 */
	int valorAleatorio()
	{
		return (int)(Math.random()*10);
	}
	
	boolean posicionarBarco(int tamano)
	{

		int posInicialX = valorAleatorio();
		int posInicialY = valorAleatorio();
		boolean resultado=true;
		
		//La posicion inicial del barco tiene que ser agua
		while (tableroJuego[posInicialX][posInicialY]!=AGUA)
		{
			posInicialX = valorAleatorio();
			posInicialY = valorAleatorio();
		}
		
		int posX= posInicialX;
		int posY = posInicialY;
		//Dirección en la cual vamos a dibujar el barco
		int direccion = this.generarDireccion();
		
		//Comprobamos que alrededor de las posiciones del barco
		//Todo es agua
		for(int i=0;i<tamano;i++)
		{
			//Primero compruebo que la posicion actual es agua
			if (tableroJuego[posX][posY]!=AGUA)
				return false;
			
			//Comprobamos la posicion superior izquierda
			if (posX-1>=0 && posY-1>=0 && tableroJuego[posX-1][posY-1]!=AGUA)
				return false;
	
			//Comprobamos la posicion superior
			if (posY-1>=0 && tableroJuego[posX][posY-1]!=AGUA)
				return false;

			//Comprobamos la posicion superior derecha
			if (posX+1<=9 && posY-1>=0 && tableroJuego[posX+1][posY-1]!=AGUA)
				return false;

			//Comprobamos la posicion izquierda
			if (posX-1>=0  && tableroJuego[posX-1][posY]!=AGUA)
				return false;

			//Comprobamos la posicion derecha
			if (posX+1<=9  && tableroJuego[posX+1][posY]!=AGUA)
				return false;

			//Comprobamos la posicion inferior izquierda
			if (posX-1>=0 && posY+1>=0 && tableroJuego[posX-1][posY+1]!=AGUA)
				return false;

			//Comprobamos la posicion inferior
			if ( posY+1<=9 && tableroJuego[posX][posY+1]!=AGUA)
				return false;

			//Comprobamos la posicion inferior derecha
			if (posX+1<=9 && posY+1<=9 && tableroJuego[posX+1][posY+1]!=AGUA)
				return false;
			
			//Pasamos a la siguiente posicion
			switch (direccion)
			{
			case ARRIBA:
				posY--;
			case ABAJO:
				posY++;
			case DERECHA:
				posX++;
			case IZQUIERDA:
				posX--;
				
			}
			
			
			return true;

		}
		
		
		
		return resultado;
		
	}
	
	public void inicializarJuego() {
		
		//Recorremos los 10 arrays
		for (int i=0; i<tableroJuego.length;i++)
		{
			
			//barcosNavegando[i] es un array, lo recorremos
			for (int j=0;j<tableroJuego[i].length;j++)
			{
				//Inicializo a agua todas las posiciones
				tableroJuego[i][j] = this.AGUA;
				
			}
			
		}
		
	}

}
