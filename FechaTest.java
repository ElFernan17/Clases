package home.krakedev;

public class FechaTest {

	public static void main(String[] args) {


		Fecha f1 = new Fecha();
		
		f1.setDia(4);
		f1.setMes(9);
		f1.setAño(2021);
		
		System.out.println("Dia: " + f1.getDia());
		System.out.println("Mes: " + f1.getMes());
		System.out.println("Año: " + f1.getAño());
		
	}

}
