package eje29;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean xo = true;
	boolean bxo = true;
	public static void main(String[] args) {
		Main m = new Main();
		m.menu();
	}
	public void menu() {
		System.out.println("1. Humano vs Humano");
		System.out.println("2. Humano vs CPU");
		System.out.println("3. CPU vs CPU");
		System.out.print("Elige: ");
		int opcion = sc.nextInt();
        sc.nextLine();
		switch (opcion) {
			case 1:
				pelea();
				break;
			case 2:
				entrena();
				break;
			case 3:
				mirar();
				break;
		}
	}
	public void pelea(){
		System.out.println("Comienza el X");
		String[][] cuadrado = new String[4][4];
		
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 4; j++) {
		    	cuadrado[i][j] = " ";
		    }
		}
		premostrar(cuadrado);
		jugarPvP(cuadrado);
	}
	private void jugarPvP(String[][] cuadrado) {
		do {
			mostrar(cuadrado);

	        int jugador = xo ? 1 : 2;
	        System.out.println("\nJugador " + jugador + ". Ingresa coordenadas (x, y) para colocar la pieza");
	        System.out.print("Ingresa X: ");
	        int x = obtenerEntradaUsuario(cuadrado.length);
	        System.out.print("Ingresa Y: ");
	        int y = obtenerEntradaUsuario(cuadrado[0].length);

	        if (cuadrado[x][y].equals(" ")) {
	            cuadrado[x][y] = xo ? "X" : "O";
	            xo = !xo;
	        } else {
	            System.err.println("Esta casilla ya está ocupada. Intenta de nuevo.");
	        }

	    } while (getGanado(cuadrado, "X", "O").equals("") && hayEspaciosVacios(cuadrado));

	    mostrar(cuadrado);

	    String ganador = getGanado(cuadrado, "X", "O");
	    if (!ganador.equals("")) {
	    	ganador(ganador);
	    } else {
	    	ganador("Empate");
	    }
	    menu();
	}
	public String getGanado(String[][] cuadrado, String p1, String p2) {
	    for (int i = 1; i <= 3; i++) {
	        if (((cuadrado[i][1] == cuadrado[i][2] && cuadrado[i][2] == cuadrado[i][3]) && cuadrado[i][2] != " ") ||
	            ((cuadrado[1][i] == cuadrado[2][i] && cuadrado[2][i] == cuadrado[3][i]) && cuadrado[2][i] != " ")) {
	            if (cuadrado[i][2].equals("X")) {
	                return p1;
	            } else if (cuadrado[i][2].equals("O")) {
	                return p2;
	            }
	        }
	    }
	    if ((cuadrado[1][1] == cuadrado[2][2] && cuadrado[2][2] == cuadrado[3][3]) ||
	        (cuadrado[1][3] == cuadrado[2][2] && cuadrado[2][2] == cuadrado[3][1])) {
	        if (cuadrado[2][2].equals("X")) {
	            return p1;
	        } else if (cuadrado[2][2].equals("O")) {
	            return p2;
	        }
	    }
	    return "";
	}
	private void entrena() {
		System.out.println("Comienza el X");
		String[][] cuadrado = new String[4][4];
		
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 4; j++) {
		    	cuadrado[i][j] = " ";
		    }
		}
		premostrar(cuadrado);
		jugarBot(cuadrado);
	}
	private void jugarBot(String[][] cuadrado) {
		do {
			mostrar(cuadrado);

	        System.out.println("\nJugador 1"  + ". Ingresa (x, y) para colocar la pieza");
	        System.out.print("Ingresa X: ");
	        int x = obtenerEntradaUsuario(cuadrado.length);
	        System.out.print("Ingresa Y: ");
	        int y = obtenerEntradaUsuario(cuadrado[0].length);

	        if (cuadrado[x][y].equals(" ")) {
	            cuadrado[x][y] = "X";
	        } else {
	            System.out.println("Esta casilla ya está ocupada. Intenta de nuevo.");
	            continue;
	        }
	        if (!getGanado(cuadrado, "X", "BOT").equals("") || !hayEspaciosVacios(cuadrado)) {
	            break;
	        }
	        
	        mostrar(cuadrado);
	        bxo = false;
	        System.out.println("\nTurno del Bot. Realizando movimiento...");
	        realizarMovimientoBot(cuadrado);

	        if (!getGanado(cuadrado, "X", "BOT").equals("") || !hayEspaciosVacios(cuadrado)) {
	            break;
	        }
	    } while (true);

	    mostrar(cuadrado);

	    String ganador = getGanado(cuadrado, "X", "BOT");
	    if (!ganador.equals("")) {
	    	ganador(ganador);
	    } else {
	    	ganador("Empate");
	    }
	    menu();
	}
	private void realizarMovimientoBot(String[][] cuadrado) {
		int x, y;
		do {
			x = (int) Math.round(Math.random()*2+1);
			y = (int) Math.round(Math.random()*2+1);
		} while (!cuadrado[x][y].equals(" "));
		if(!bxo) {
			cuadrado[x][y] = "O";
		}else {
			cuadrado[x][y] = "X";
		}
	}
	private void mirar() {
		String[][] cuadrado = new String[4][4];
		
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 4; j++) {
		    	cuadrado[i][j] = " ";
		    }
		}
		premostrar(cuadrado);
		justWatch(cuadrado);
	}
	private void justWatch(String[][] cuadrado) {
		do {
			mostrar(cuadrado);
	        int bot = bxo ? 1 : 2;
	        
	        System.out.println("\nTurno del Bot" + bot + ". Realizando movimiento...");
	        sc.nextLine();
	        realizarMovimientoBot(cuadrado);
	        bxo = !bxo;
	        if (!getGanado(cuadrado, "BOT1", "BOT2").equals("") || !hayEspaciosVacios(cuadrado)) {
	            break;
	        }
	    } while (true);

	    mostrar(cuadrado);

	    String ganador = getGanado(cuadrado, "BOT1", "BOT2");
	    if (!ganador.equals("")) {
	    	ganador(ganador);
	    } else {
	    	ganador("Empate");
	    }
	    menu();
	}
	public void mostrar(String[][] cuadrado) {
		System.out.println();
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
            	if(j+1 == cuadrado[i].length) {
            		System.out.print("|" + cuadrado[i][j] + "|");            		
            	}else {
            		System.out.print("|" + cuadrado[i][j]);
            	}
            }
            System.out.println();
        }
	}
	private void premostrar(String[][] cuadrado) {	
		cuadrado[0][1] = "1";
		cuadrado[0][2] = "2";
		cuadrado[0][3] = "3";
		cuadrado[1][0] = "1";
		cuadrado[2][0] = "2";
		cuadrado[3][0] = "3";
		xo = true;
	}
	private int obtenerEntradaUsuario(int rango) {
		int entrada = 0;
		    do {
	    		String input = sc.nextLine();
	    		if (input.isEmpty()) {
	    			System.out.println("Entrada vacía. Por favor, ingresa un número.");
	    			continue; 
	    		}
	    		try {
	    			entrada = Integer.parseInt(input);
	    			
	    			if (entrada < 0 || entrada >= rango) {
	    				System.out.println("Coordenada fuera de rango.");
	    			}
	    			
	    		} catch (NumberFormatException e) {
	    			System.out.println("Entrada no válida. Ingresa un número.");
	    			entrada = -1;
	    		}
		    } while (entrada < 1 || entrada > rango);

		return entrada;
	}
	private boolean hayEspaciosVacios(String[][] cuadrado) {
	    for (int i = 1; i < cuadrado.length; i++) {
			for (int j = 1; j < cuadrado[i].length; j++) {
				if (cuadrado[i][j].equals(" ")) {
	                return true;
	            }
			}
		}
	    return false;
	}
	public void ganador(String msg) {
		int anchoConsola = 24; 
	    int longitudMensaje = msg.length() + 4;

	    int espaciosEnBlanco = (anchoConsola - longitudMensaje) / 2;

	    System.out.printf("\n%s%s%s\n", "|", "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾", "|");

	    System.out.printf("|%" + espaciosEnBlanco + "s %s %-" + espaciosEnBlanco + "s|\n", "", msg, "");

		System.out.printf("%s%s%s\n", "|", "______________________", "|");

	    System.out.printf("%" + (espaciosEnBlanco *2+3) + "s\n", "(\\__/) ||");
	    System.out.printf("%" + (espaciosEnBlanco *2+2) + "s\n", "(•ㅅ•) ||");
	    System.out.printf("%" + (espaciosEnBlanco *2) + "s\n\n", "/    づ");
	}
}
