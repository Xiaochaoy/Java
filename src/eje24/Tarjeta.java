package eje24;

public class Tarjeta {
	private String entidad_emisora;
	private Long numero;
	private String titular;
	private String fecha_caducidad;
	private boolean activado = false;
	private int dinero = 0;
	
	
	
	public Tarjeta(String entidad_emisora, Long numero, String titular, String fecha_caducidad) {
		super();
		this.entidad_emisora = entidad_emisora;
		this.numero = numero;
		this.titular = titular;
		this.fecha_caducidad = fecha_caducidad;
	}
	public String getEntidad_emisora() {
		return entidad_emisora;
	}
	public void setEntidad_emisora(String entidad_emisora) {
		this.entidad_emisora = entidad_emisora;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	public void pagar(int money) {
		if(activado) {
			if((dinero - money) >= 0) {
				dinero -= money;				
			}else {
				System.out.println("No tienes suficiendo dinero");
			}
		}else {
			System.out.println("Tu tarjeta no esta activado");
		}
	}
	public void activar() {
		if(activado) {
			System.out.println("Ya esta activado");
		}else {
			activado = true;
			dinero = 1000;
		}
	}
	@Override
	public String toString() {
		return "Entidad emisora= " + entidad_emisora + "\nNumero= " + numero + "\ntitular= " + titular
				+ "\nfecha_caducidad= " + fecha_caducidad + "\nactivado= " + activado + "\ndinero= " + dinero;
	}
	public void anular() {
		if(!activado) {
			System.out.println("No esta activado");
		}else {
			activado = false;
		}
	}
	public void verDinero() {
		if(activado) {
			if(dinero <= 0) {
				System.out.println("No tienes dinero! ");
			}else {
				System.out.println("Tienes: " + dinero + "€");
			}			
		}else {
			System.out.println("No tienes ni activado como quieres tener dinero!");
		}
	}
}
