package home.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		v = new Vehiculo("2013", "chevrolet", "spark");
		
		
		System.out.println(".......Vehiculo 1 Valores asignados...........");
		
		
		System.out.println("Año: " + v.getAño());
		
		System.out.println("Marca: " + v.getMarca());
		
		System.out.println("Modelo: " + v.getModelo());
		
		
		
		
		Vehiculo v2 = new Vehiculo("2026", "mazda", "3");
		
		
		System.out.println(".......Vehiculo 2 Valores asignado...........");
		

		System.out.println("Año: " + v2.getAño());
		
		System.out.println("Marca: " + v2.getMarca());
		
		System.out.println("Modelo: " + v2.getModelo());
		
		
	}

}
