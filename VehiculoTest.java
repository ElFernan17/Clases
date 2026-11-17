package home.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		v = new Vehiculo();
		
		System.out.println(".......Vehiculo Creado...........");
		
		System.out.println("Año: " + v.getAño());
		
		System.out.println("Marca: " + v.getMarca());
		
		System.out.println("Modelo: " + v.getModelo());
		
		
		
		System.out.println(".......Vehiculo 1 Valores asignados...........");
		
		v.setAño("2013");
		v.setMarca("chevrolet");
		v.setModelo("spark");
		
		System.out.println("Año: " + v.getAño());
		
		System.out.println("Marca: " + v.getMarca());
		
		System.out.println("Modelo: " + v.getModelo());
		
		
		
		System.out.println(".......Vehiculo 2 Creado...........");
		
		Vehiculo v2 = new Vehiculo();
		
		System.out.println("Año: " + v2.getAño());
		
		System.out.println("Marca: " + v2.getMarca());
		
		System.out.println("Modelo: " + v2.getModelo());

		
		
		
		System.out.println(".......Vehiculo 2 Valores asignado...........");
		
		v2.setAño("2026");
		v2.setMarca("mazda");
		v2.setModelo("3");

		System.out.println("Año: " + v2.getAño());
		
		System.out.println("Marca: " + v2.getMarca());
		
		System.out.println("Modelo: " + v2.getModelo());
		
		
	}

}
