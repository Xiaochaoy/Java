package eje13;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		
		System.out.println(main.parOimpar());
		System.out.println(main.parOimpar());
		System.out.println(main.parOimpar());

	}
	
	public Boolean parOimpar() {
		int i = (int) Math.round(Math.random()*10);
		if(i%2 == 0){
			return true;
		}else {
			return false;
		}
		
	}
	
	public String login(String user, int pass) {
		if(user.equals("admin") && pass == 1234) {
			return "Login true";
		}else {
			return "Login false";
		}
	}
	public String javaOrNull(String texto) {
		if(texto.toLowerCase().equals("java")) {
			return texto;			
		}else {
			return null;
		}
	}
}
