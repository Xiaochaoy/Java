package eje15;

public class Main {
	static final String rojo = "\u001B[41m";
	static final String amarillo = "\u001B[43m";
	static final String azul = "\u001B[44m";
	static final String naranja = "\u001B[48;5;208m";
	static final String reset = "\u001B[0m";
    
	static final String negrita = "\u001B[1m";
	static final String italic = "\u001B[3m";

    
	public static void main(String[] args) {
		String[] bcolor = {rojo, amarillo , azul, naranja};
		String[] ttexto = {negrita,italic};
		
		for(int i = 0; i < 10; i++) {
			String rcolor = bcolor[(int) Math.round(Math.random()*3)];
			String rtexto = ttexto[(int) Math.round(Math.random())];
			
			System.out.println(rcolor + rtexto+ "hola bono dia" + reset);
		}
	}
}
