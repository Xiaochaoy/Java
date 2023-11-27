package eje17;

import java.util.Iterator;

public class Main {
	static final String negro = "\u001B[40m";
	static final String rojo = "\033[101m";
	static final String verde = "\033[102m";
	static final String amarillo = "\033[103m";
	static final String azul = "\033[104m";
	static final String cyan = "\033[106m";
	static final String naranja = "\u001B[48;5;208m";
	static final String reset = "\u001B[0m";
	static final String[] colores = {rojo, verde, amarillo, azul, cyan, naranja};
	static final String negrita = "\u001B[1m";
	static final String italic = "\u001B[3m";
	
	public static void main(String[] args) {
		String[] texto = {"byte", "short", "int", "long", "float", "double"};
		for (int i = 0; i < texto.length; i++) {
			switch (texto[i]) {
	            case "byte":
	                System.out.println( colores[0] + "Rango " + negrita + texto[i].toUpperCase() + reset + 
	                					colores[0] + " desde: " + italic + Byte.MIN_VALUE + reset + 
	                					colores[0] + " hasta: " + italic + Byte.MAX_VALUE + reset);
	                break;
	            case "short":
	                System.out.println( colores[1] + "Rango " + negrita + texto[i].toUpperCase() + reset + 
				                		colores[1] + " desde: " + italic + Short.MIN_VALUE + reset + 
				                		colores[1] + " hasta: " + italic + Short.MAX_VALUE + reset);
	                break;
	            case "int":
	                System.out.println( colores[2] + "Rango " + negrita + texto[i].toUpperCase() + reset + 
				                		colores[2] + " desde: " + italic + Integer.MIN_VALUE + reset + 
				                		colores[2] + " hasta: " + italic + Integer.MAX_VALUE + reset);
	                break;
	            case "long":
	                System.out.println( colores[3] + "Rango " + negrita + texto[i].toUpperCase() + reset + 
				                		colores[3] + " desde: " + italic + Long.MIN_VALUE + reset + 
				                		colores[3] + " hasta: " + italic + Long.MAX_VALUE + reset);
	                break;
	            case "float":
	                System.out.println( colores[4] + "Rango " + negrita + texto[i].toUpperCase() + reset + 
				                		colores[4] + " desde: " + italic + Float.MIN_VALUE + reset + 
				                		colores[4] + " hasta: " + italic + Float.MAX_VALUE + reset);
	                break;
	            case "double":
	                System.out.println( colores[5] + "Rango " + negrita + texto[i].toUpperCase() + reset + 
				                		colores[5] + " desde: " + italic + Double.MIN_VALUE + reset + 
				                		colores[5] + " hasta: " + italic + Double.MAX_VALUE + reset);
	                break;
	            default:
	                System.out.println("Tipo de dato no reconocido: " + texto[i]);
			}
			System.out.println("---------------------------------------------------------------------");
		}
	}
}
