package eje34;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		cositas4(0);
	}
	public static void cositas4(int r) {
		ImageIcon[] imgs = {new ImageIcon("src/eje34/pizza.png"), new ImageIcon("src/eje34/pera.png"), new ImageIcon("src/eje34/hamburguesa.png")};
		String[] titulos = {"¿Te gusta la pizza con piña?", "¿Te gusta la pera?", "¿Te gusta la hamburguesa?"};
		String[] tipos = {"comida", "comida", "comida"};
		String[][] options = {{"Si, me encanta!", "No, puags!", "Mejor una 4 quesos", "Siguiente", "Salir"},
							  {"Si, me encanta!", "No me gusta!", "Mejor manzana!", "Siguiente", "Salir"},
							  {"Si, me encanta!", "No, puags!", "Mejor KFC", "Siguiente", "Salir"}};
		
		
	    var selection = JOptionPane.showOptionDialog(null, titulos[r], "Preguntas sobre " + tipos[r], 
	                                                      0, -1, imgs[r], options[r], options[r][r]);
	    if (selection == 0) {
	      JOptionPane.showMessageDialog(null, "Good choice");
	    }
	    if (selection == 1) { 
	      JOptionPane.showMessageDialog(null, "GG");
	    }
	    if (selection == 2) { 
	      JOptionPane.showMessageDialog(null, "I agree");
	    }
	    if (selection == 3) { 
	    	if((r+1) >= tipos.length) {
	    		cositas4(0);
	    	}else {
	    		cositas4(r+1);	    		
	    	}
		}
	}
	public void cositas3() {
		JOptionPane.showOptionDialog(null, "Would you like green eggs and ham?","A Silly Question" ,
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
				null, new Object[] { "YES, please", "No way!"}, "YES, please");
		
	}
	public void cositas2() {
		ImageIcon img;
		Object resp = JOptionPane.showInputDialog(null, "¿Cual es tu animal favorito?",
                "Animal Quiz", JOptionPane.QUESTION_MESSAGE,
                null, new Object[] { "Perro","Lobo", "Gato", "Leon" },
                "Lobo");
		try {
			switch (resp.toString()){
			case "Lobo":
				img = new ImageIcon("src\\eje34\\lobo.jpg");
                JOptionPane.showMessageDialog(null, null, "LOBO", JOptionPane.INFORMATION_MESSAGE, img);
				break;
			case "Perro":
				img = new ImageIcon("src\\eje34\\perro.jpg");
				JOptionPane.showMessageDialog(null, null, "Perro", JOptionPane.INFORMATION_MESSAGE, img);
				break;
			case "Gato":
				img = new ImageIcon("src\\eje34\\gato.png");
				JOptionPane.showMessageDialog(null, null, "Gato", JOptionPane.INFORMATION_MESSAGE, img);
				break;
			case "Leon":
				img = new ImageIcon("src\\eje34\\leon.jpg");
				JOptionPane.showMessageDialog(null, null, "Leon", JOptionPane.INFORMATION_MESSAGE, img);
				break;
			}
			
		}catch (Exception e) {
			System.err.println(e);
		}
	}
	public void cositas() {
		String msg = "Queue Operations Menu \n 1.Insert \n 2.Delete \n 3.Display \n 4.Exit \n\n Enter your option";
		
		String texto = JOptionPane.showInputDialog(null, msg, "Input",JOptionPane.QUESTION_MESSAGE);
		
		if(texto == null) {
			JOptionPane.showMessageDialog(null, "Cancelaste", "WARNING", JOptionPane.WARNING_MESSAGE);
		}else {
			if(texto.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No hay nada", "ERROR", JOptionPane.ERROR_MESSAGE);
			}else {
				int t = Integer.parseInt(texto);
				switch(t) {
					case 1:
						JOptionPane.showMessageDialog(null, "Insertando", "INFO", t);
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Borrando", "DELETE", t);
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Display", "DISPLAY", t);
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "EXIT", "EXIT", 0);
						break;
				}

			}
		}
	}
}
