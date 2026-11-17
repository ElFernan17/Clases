package home.krakedev;

public class RestauranteTest {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		
		System.out.println("................Restaurante Creado:................");
		
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: " + rest1.getCalificacion());
		
		System.out.println("................Restaurante Valores Asignados:................ ");
		
		rest1.setNombre("SuperSalchis");
		rest1.setDireccion("calle sucre y Quito");
		rest1.setCalificacion((float) 3.5);
		
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: " + rest1.getCalificacion());
		
		Restaurante rest2 = new Restaurante();

		System.out.println("................Restaurante Creado:................ ");
		
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: " + rest2.getCalificacion());
		
		System.out.println("................Restaurante Valores Asignados:................ ");
		
		rest2.setNombre("TurboBurgers");
		rest2.setDireccion("Calle roca y Bolivar");
		rest2.setCalificacion((float) 4.1);

		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: " + rest2.getCalificacion());
		
		
	}

}
