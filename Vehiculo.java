package home.krakedev;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String año;
	private double valor;
	
	public Vehiculo(String año, String marca, String modelo) {
		
		this.año = año;
		this.marca = marca;
		this.modelo = modelo;
		
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
