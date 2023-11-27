package eje31;

public class Main {
	public static void main(String[] args) {
		
		for (String string : args) {
			if(string.equals("Federico")) {
				System.out.println("Fede lorem lorem \n "
						+ "lorem lorem lorem \n "
						+ "lorem lorem lorem \n "
						+ "lorem lorem lorem");
			}else if(string.equals("GarcíaLorca")) {
				System.out.println("Garcia lorem lorem \n "
						+ "lorem lorem lorem \n "
						+ "lorem lorem lorem \n "
						+ "lorem lorem lorem");
			}else {
				System.out.println("No es lo que espero, Noob!");
			}
		}
	}
}
