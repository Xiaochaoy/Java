package eje24;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args){
		Main m = new Main();
		Tarjeta t = new Tarjeta("Caixa", 1234567898765432L, "Your Daddy", "12-99");
		
		int option = m.menu();
		while(option > 0 && option < 6) {
			switch(option) {
				case 1:
					t.verDinero();
					break;
				case 2:
					System.out.println("Cuanto quieres pagar?");
					t.pagar(s.nextInt());
					break;
				case 3:
					t.activar();
					break;
				case 4:
					t.anular();
					break;
				case 5:
					System.out.println(t.toString());
					break;
			}
			option = m.menu();
		}
	}
	
	public int menu() {
		int o = 0;
		do {

			System.out.println(" \nMENU PRINCIPAL \n");

			System.out.println("1. Ver Dinero");
			System.out.println("2. Pagar");
			System.out.println("3. Activar");
			System.out.println("4. Anular");
			System.out.println("5. Informacion de Tarjeta");
			System.out.println("Esculli opció: ");
			try {
				o = s.nextInt();
			} catch (InputMismatchException e) {
	            System.err.println("Error: Se esperaba un número entero.");
	            s.next();
	        }
		} while (o != 1 && o != 2 && o != 3 && o != 4 && o != 5);

		return o;
	}
}