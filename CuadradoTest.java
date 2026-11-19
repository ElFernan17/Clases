package home.krakedev;

public class CuadradoTest {

	public static void main(String[] args) {
		
		
		Cuadrado c1 = new Cuadrado(4);
		
		double resultado = c1.calcularArea();
		
		double resultadoPerimetro = c1.calcularPerimetro();
		
		System.out.println("resultado area cuadrado= " + resultado);
		
		System.out.println("resultado perimetro cuadrado= " + resultadoPerimetro);
		
		
		
		Cuadrado c2 = new Cuadrado(3);
		
		double resultado2 = c2.calcularArea();
		
		double resultadoPerimetro2 = c2.calcularPerimetro();
		
		System.out.println("resultado area cuadrado= " + resultado2);
		
		System.out.println("resultado perimetro cuadrado= " + resultadoPerimetro2);
		
		
		
		Cuadrado c3 = new Cuadrado(8);
		
		double resultado3 = c3.calcularArea();
		
		double resultadoPerimetro3 = c3.calcularPerimetro();
		
		System.out.println("resultado area cuadrado= " + resultado3);
		
		System.out.println("resultado perimetro cuadrado= " + resultadoPerimetro3);
	}

}
