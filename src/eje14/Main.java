package eje14;

public class Main {
	String negro = "\u001B[40m";
	String rojo = "\u001B[41m";
	String amarillo = "\u001B[43m";
	String azul = "\u001B[44m";
	String blanco = "\u001B[47m";
	String naranja = "\u001B[48;5;208m";
    String azulFuerte = "\u001B[48;5;33m";
    String reset = "\u001B[0m";
    
	public static void main(String[] args) {
		Main m = new Main();
		m.selectBandera("Ucrania", 15);
		m.selectBandera("Grecia", 20);
		m.selectBandera("Francia", 10);
		m.selectBandera("España", 20);
		m.selectBandera("Catalunya", 20);
		m.selectBandera("Alemania", 20);
	}
	
	public void selectBandera(String name, int ancho) {
        switch (name) {
            case "Ucrania": {
                hacerBandera(new String[]{azul, amarillo}, new int[]{2, 2}, ancho);
                break;
            }
            case "Grecia":{
            	hacerBandera(new String[]{azul, blanco});
            	break;
            }
            case "Francia":{
            	hacerBandera(new String[]{azul, blanco, rojo}, ancho);
            	break;
            }
            case "España": {
            	hacerBandera(new String[]{rojo, amarillo, rojo}, new int[]{2, 4, 2}, ancho);
            	break;
            }
            case "Catalunya":{
            	hacerBandera(new String[]{amarillo, rojo, amarillo, rojo, amarillo, rojo, amarillo, rojo, amarillo}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, ancho);
            	break;
            }
            case "Alemania":{
            	hacerBandera(new String[]{negro, rojo, amarillo}, new int[]{2, 2, 2}, ancho);
            	break;
            }
        }
    }

    public void hacerBandera(String[] colores, int[] filas, int ancho) {
    	for (int i = 0; i < colores.length; i++) {
            for (int j = 0; j < filas[i]; j++) {
                System.out.printf(colores[i] + "%" + ancho + "s%n" + reset, "");
            }
        }
    }
    public void hacerBandera(String[] colores, int ancho) {
        for (int j = 0; j < 8; j++) {
            System.out.printf(colores[0] + "%" + ancho + "s" + reset, "");
            System.out.printf("%" + ancho + "s" + reset, "");
            System.out.printf(colores[2] + "%" + ancho + "s%n" + reset, "");
        }
        
    }
    public void hacerBandera(String[] colores) {
    	for(int i = 0; i < 9; i++) {
    		if(i < 5) {
    			if(i != 2) {
    				System.out.printf(colores[0] + "%" + 4 + "s" + reset, "");
    				System.out.printf("%" + 3 + "s" + reset, "");
    				System.out.printf(colores[0] + "%" + 4 + "s" + reset, "");    				
    			}else {
    				System.out.printf("%" + 11 + "s" + reset, "");
    			}
    		}else {
    			if(i%2 == 0) {
        			System.out.printf(colores[0] + "%" + 11 + "s" + reset, "");
        			
        		}else {
        			System.out.printf("%" + 11 + "s" + reset, "");
        		}
    		}

    		if(i%2 == 0) {
    			System.out.printf(colores[0] + "%" + 18 + "s" + reset, "");
    			
    		}else {
    			System.out.printf("%" + 18 + "s" + reset, "");
    		}
    		
    		System.out.println();    		
    	}
    }
}
