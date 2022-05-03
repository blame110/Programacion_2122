package tema5Entornos;

public class PruebasHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Repartidor adrian = new Repartidor("Adrian", 'H', "No te importa", 19 ,"Honda Transalp", "M3V3", false, 600);

		Persona miguel = new Persona("Miguel", 'H', "Mi casa, telefono", 19);
		
		System.out.println("Retenciones de Adrian " + adrian.calculoRenteciones());

		System.out.println("Retenciones de Miguel " + miguel.calculoRenteciones());
		
		
	}

}
