package home.krakedev;

public class Calculadora {
	
	public int sumar(int a, int b) {
		int resultado;
		
		resultado = a + b;
		
		return resultado;
	}
	
	public double restar(double a, double b) {
		double resultado;
		
		resultado = a - b;
		
		return resultado;
	}
	
	public double multiplicar(double valor1, double valor2) {
		double resultado;
		
		resultado = valor1 * valor2;
		
		return resultado;
	}
	
	public double dividir(double dividendo, double divisor) {
		double cociente;
		
		cociente = dividendo / divisor;
		
		return cociente;
	}
	
	public double promediar(double valor1, double valor2, double valor3) {
		double suma;
		double promedio;
		
		suma = valor1 + valor2 + valor3;
		
		promedio = suma / 3;
				
		return promedio;
	}
	
	public double calcularDescuento(double precio, double descuento) {
		double retorno;
		
		retorno = precio - (precio * descuento/100);
		
		return retorno;
	}
	
	
	public void mostrarResultados() {
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
	}
	
}
