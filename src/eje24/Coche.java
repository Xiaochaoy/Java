package eje24;

public class Coche {
	private String color;
	private String modelo;
	private String marca;
	
	public Coche(String color, String modelo, String marca) {
		super();
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
	}
	public Coche() {
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
