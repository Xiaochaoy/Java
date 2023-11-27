package eje23;

public class Main {
	String[] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
	int i = 0;
	
	
	public static void main(String[] args) {
		Main m = new Main();
	
		System.out.println(m.suma(225235));
	}
	
	public int suma(int i){
		if(i == 0) {
			return 0;
		}else {
			System.out.println(i%10);
			return i % 10 + suma(i / 10);			
		}
	}
	public String textoReverse(String palabra) {
		 if (palabra.isEmpty()) {
	            return palabra;
	        } else {
	            return textoReverse(palabra.substring(1)) + palabra.charAt(0);
	        }
	}
	public int fibonaci(int n) {
		if (n <= 1) {
            return n;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
	}
	public void saludar() {
		if(!tecnologies[i].equals("HTML")) {
			System.out.println("Hola " + tecnologies[i]);		
			i++;
			if(i < tecnologies.length) {
				saludar();			
			}
		}else {
			System.out.println("Hola " + tecnologies[i]);		
		}
		
	}
}
