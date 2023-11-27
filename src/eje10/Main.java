package eje10;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();

		main.arbol(8,10);
	}
	public void arbol(int altura, int ancho) {
		String estrella = "**";
		int tronco = ancho-1;
		String troco = "****";
		for (int i = 1; i <= altura; i++) {
            System.out.printf("%"+ ancho + "s","");
            System.out.print(estrella);
            System.out.printf("%"+ ancho + "s%n","");
            estrella += "**";
            ancho--;
        }
		for (int i = 0; i < 2; i++) {
			System.out.printf("%"+ tronco + "s","");
			System.out.print(troco);
			System.out.printf("%"+ tronco + "s%n","");
		}
	}
	public void intAString(int i) {
		switch (i){
		case 1:
            System.out.println("Uno");
            break;
        case 2:
            System.out.println("Dos");
            break;
        case 3:
            System.out.println("Tres");
            break;
        case 4:
            System.out.println("Cuatro");
            break;
        case 5:
            System.out.println("Cinco");
            break;
        case 6:
            System.out.println("Seis");
            break;
        case 7:
            System.out.println("Siete");
            break;
		case 8:
            System.out.println("Ocho");
            break;
		case 9:
            System.out.println("Nueve");
            break;
	}
	}
	public void ifATernario(int number) {
		
		String r = number > 0 ? "¡Es positivo!": number < 0 ? "¡Es negativo!": "¡Es cero, na de ná!";
		System.out.println(r);
	}
	public void temperatura(int i) {
		if(i < 10){
			System.out.println("Climas fríos"); 
			if(i >= 5){
				System.out.println("Tipo Alta montaña"); 
			}else{
				System.out.println("Tipo Polar"); 
			}
		}else if(i >= 10 && i < 20){
			System.out.println("Climas templados"); 
			if(i < 13.5){
				System.out.println("Tipo Oceánico"); 
			}else if(i < 16.5){
				System.out.println("Tipo Mediterráneo"); 
			}else{
				System.out.println("Tipo Continental"); 
			}
		}else if(i >= 20){
			System.out.println("Climas cálidos"); 
			if(i < 23.5){
				System.out.println("Tipo Ecuatorial"); 
			}else if(i < 26.5){
				System.out.println("Tipo Tropical"); 
			}else{
				System.out.println("Tipo Desértico"); 
			}
		}
	}
	public void ceroUno() {
		int num = (int) Math.round(Math.random());
		System.out.println((num != 0) ? true + "\n" + "rojo": false + "\n" + "negro");            
    }

}


