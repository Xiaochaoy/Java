package eje29;

public class Main2 {
	public static void main(String[] args) {
		ganador("Jugador1");
		ganador("BOT1");
	}
	
	public static void ganador(String msg) {
		int anchoConsola = 24; 
	    int longitudMensaje = msg.length() + 4;

	    int espaciosEnBlanco = (anchoConsola - longitudMensaje) / 2;

	    System.out.printf("%s%s%s\n", "|", "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾", "|");

	    System.out.printf("|%" + espaciosEnBlanco + "s %s %-" + espaciosEnBlanco + "s|\n", "", msg, "");

		System.out.printf("%s%s%s\n", "|", "______________________", "|");

	    System.out.printf("%" + (espaciosEnBlanco *2+3) + "s\n", "(\\__/) ||");
	    System.out.printf("%" + (espaciosEnBlanco *2+2) + "s\n", "(•ㅅ•) ||");
	    System.out.printf("%" + (espaciosEnBlanco *2) + "s\n", "/    づ");
	}
}
