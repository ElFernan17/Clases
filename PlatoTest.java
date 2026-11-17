package home.krakedev;

public class PlatoTest {

	public static void main(String[] args) {
		
Plato platoA = new Plato();
		
		System.out.println("................Plato Creado:................");
		
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.getDisponible());
		
		System.out.println("................Plato Valores Asignados:................ ");
		
		platoA.setNombre("SuperBurguer");
		platoA.setTipo("Hamburguesa");
		platoA.setPrecio(7.50);
		platoA.setDisponible(true);
		
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.getDisponible());
		
Plato platoB = new Plato();
		
		System.out.println("................Plato Creado:................");
		
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.getDisponible());
		
		System.out.println("................Plato Valores Asignados:................ ");
		
		platoB.setNombre("TurboCombo");
		platoB.setTipo("Combo");
		platoB.setPrecio(10.0);
		platoB.setDisponible(true);
		
		
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.getDisponible());
		
Plato platoC = new Plato();
		
		System.out.println("................Plato Creado:................");
		
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.getDisponible());
		
		System.out.println("................Plato Valores Asignados:................ ");
		
		platoC.setNombre("SalchiBurger");
		platoC.setTipo("Combo");
		platoC.setPrecio(9.50);
		platoC.setDisponible(false);
		
		
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.getDisponible());
		
		
	}
	
	

}
