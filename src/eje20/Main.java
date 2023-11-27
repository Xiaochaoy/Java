package eje20;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		m.eje1();
		m.eje2();
		m.eje3();
		m.eje4();
		m.eje5();
		m.eje6();
		m.eje7();
	}
	
	public void eje1() {
		System.out.printf("%s\t%s\t%s%n", "NOMBRE", "APELLIDO1", "APELLIDO2");
	}
	public void eje2() {
		System.out.printf("%s\t%s %s%n", "NOMBRE", "apellido1", "apellido2");
	}
	public void eje3() {
		System.out.printf("%3$s, %2$s, %1$s%n", "Nombre", "apellido1", "apellido2");
	}
	public void eje4() {
		System.out.printf("\t%d%n", 22);
	}
	public void eje5() {
		System.out.printf("%010d%n", 22);
	}
	public void eje6() {
		System.out.printf("%010.2f%n", 17.1829327);
	}
	public void eje7() {
		System.out.printf("%s%s%n", "Hola", "Mundo");
	}
}
