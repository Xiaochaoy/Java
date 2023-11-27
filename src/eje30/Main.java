package eje30;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			if(sc.hasNextInt()) {
				int i = sc.nextInt();
			}else {
				throw new NumberFormatException("No es un numero"); 				
			}
			sc.nextLine();
			
			String i2 = sc.nextLine();
			if(i2.isEmpty()) {
				throw new NullPointerException("no hay nada");					
			}
			
			if(sc.hasNextBoolean()) {
	    		boolean i3 = sc.nextBoolean();
	    	}else {
	    		throw new InputMismatchException("No es un bolean");	    		
	    	}
			sc.nextLine();
			
			sc.useLocale(Locale.US);
	    	if(sc.hasNextFloat()) {
	    		float i4 = sc.nextFloat();
	    	}else {
				throw new InputMismatchException("No hay decimal"); 
	    	}
			
		} catch (NumberFormatException e1) {
			System.err.println(e1);
		} catch (NullPointerException e2) {
			System.err.println(e2);
		} catch (InputMismatchException e3) {
			System.err.println(e3);
		} catch (Exception e4) {
			System.err.println(e4);
		}
	}
	
}
