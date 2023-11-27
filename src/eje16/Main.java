package eje16;

import java.util.Scanner;

public class Main {
	static final String negro = "\u001B[40m";
	static final String rojo = "\033[101m";
	static final String verde = "\033[102m";
	static final String amarillo = "\033[103m";
	static final String azul = "\033[104m";
	static final String cyan = "\033[106m";
	static final String naranja = "\u001B[48;5;208m";
	static final String reset = "\u001B[0m";
	static final String[] colores = {rojo, amarillo, cyan, naranja};

	public static void main(String args[]){
		Main main = new Main();
		main.arbol(12,12);
	}
	public void arbol(int altura, int ancho) {
		boolean si = false;
		String estrella = "**";
		int tronco = ancho-1;
		String troco = "****";
		for (int i = 1; i <= altura; i++) {
			System.out.print(azul);
            System.out.printf("%"+ ancho + "s","");
            
            for (int j = 0; j < estrella.length(); j++) {
            	if(si) {
                    System.out.print(verde + "*" + reset);
                    si = false;
            	}else {
            		if (Math.round(Math.random()) == 0) {
            			
                        System.out.print(colores[(int) Math.round(Math.random()*3)] + "*" + reset);
                        si = true;
                    } else {
                        System.out.print(verde + "*" + reset);
                    }
            	}
            }
			System.out.print(azul);
            System.out.printf("%"+ ancho + "s%n","");
            estrella += "**";
            ancho--;
        }
		for (int i = 0; i < 2; i++) {
			System.out.print(azul);
			System.out.printf("%"+ tronco + "s","");
			System.out.print(negro + troco + reset);
			System.out.print(azul);
			System.out.printf("%"+ tronco + "s%n","");
		}
	}
}
