package eje19;

public class Main {
	public static void main(String[] args) {
		int b = 100;
		System.out.println(b + " es de tipo " + ((Object)b).getClass().getSimpleName());
		
		b = b*2;
		System.out.println(b + " es de tipo " + ((Object)b).getClass().getSimpleName());

	}
}
