package eje9;
import java.util.Scanner;

public class Main {
	static int numero = 0;
	Scanner sc = new Scanner(System.in);
	
	public static int getNumber() {
		return numero;
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.logico3();
	}
	public void logico2() {
		int i = sc.nextInt();
		System.out.println((i%2 == 0)? "par": "impar");
	}
	public void logico3() {
		for(int a = 0; a < 10; a++) {
			int i = (int) Math.round(Math.random());
			System.out.println((i%2 == 0)? "blanco": "negro");
		}
	}
	
	public void logico() {
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = false;
		System.out.println((bool1 == !bool2)); 
		System.out.println((bool2 == !bool3)); 
	}
	public void relacion() {
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 2;

		System.out.println((num2 == num4));
		System.out.println((num2 == num3));
		System.out.println((num1 != num3));
		System.out.println((num2 != num2));
		System.out.println((num4 < num3));
		System.out.println((num3 < num1));
		System.out.println((num1 > num3));
		System.out.println((num2 > num4));
		System.out.println((num2 > num3));
		System.out.println((num2 <= num3));
		System.out.println((num2 <= num4));
		System.out.println((num2 <= num1));
		System.out.println((num1 >= num2));
		System.out.println((num2 >= num1));
		System.out.println((num2 >= num2));
	}
	public void combinado() {
		int n = 25;
		n += 5;
		System.out.println(n); 
		n -= 15;
		System.out.println(n); 
		n *= 2;
		System.out.println(n); 
		n /= 2;
		System.out.println(n); 
		n %= 3;
		System.out.println(n); 
	}
	public void incremento() {
		numero++;
		System.out.println(getNumber());
	}
	public void decremento() {
		numero-=2;
		System.out.println(getNumber());
	}
	public static void normal() {
		System.out.println(10-5); 
		System.out.println(55+45);
		System.out.println(-3);
		System.out.println(5*5);
		System.out.println(25/7);
		System.out.println((double) 25/7);
		System.out.println(25%4);
	}
}
