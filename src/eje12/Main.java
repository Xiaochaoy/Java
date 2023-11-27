package eje12;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Iteración #" + i);
        }
	}
	
	public void iteracion1() {
		for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Iteración #" + i);
        }
	}
}
