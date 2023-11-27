package eje18;

public class Main {
	public static void main(String[] args) {

		System.out.println(fun("hola"));
		System.out.println(fun('H'));
		System.out.println(fun(true));
		System.out.println(fun(2f));
		System.out.println(fun(2L));

	}
	public static String fun(Object o) {
		return o.getClass().getSimpleName();
	}
}
