package home.krakedev;

public class Cuadrado {
	private int lado;
	
	
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	

	public double calcularArea() {
		double resultadoArea;
		
		resultadoArea = lado * lado;
		
		
		return resultadoArea;
	}
	
	public double calcularPerimetro() {
		double resultadoPerimetro;
		
		resultadoPerimetro = lado * 4;
		
		return resultadoPerimetro;
	}
}
