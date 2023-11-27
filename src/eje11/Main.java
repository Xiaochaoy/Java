package eje11;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		m.abecedario();
	}
	
	
	public void divisiblea2() {
		for(int i = 1; i <= 10; i++){
			if(i%2 == 0){
				System.out.println(i);
			}
		}
	}
	public void divisiblea3() {
		int[] numeros = {2,35,5,6,434,21,2};
		
		for(int i = 0; i < numeros.length; i++){
			if(numeros[i]%3 == 0){
				System.out.println(numeros[i]);
				
			}
		}
	}
	public void salude(int veces) {
        int contador = 0;
        do {
            System.out.println("Saludo #" + contador + ": ¡Hola!");
            contador++;
        } while (contador <= veces);
	}
	public void abecedario() {
		int abc = 26;
        char letra = 'Z';
        boolean cambio = false;
        for (int i = 0; i < 51; i++) {
            char ll = letra;
            for (int j = 0; j < abc; j++) {
                System.out.print(ll);
                if (!cambio) {
                    ll--;
                } else {
                    ll++;
                }
            }
            if (letra == 'A' || cambio) {
                cambio = true;
                abc++;
            } else {
                letra--;
                abc--;
            }
            System.out.println();
        }
	}
}
