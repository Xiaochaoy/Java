package eje35;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultCaret;

public class MiJFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	JButton[][] botones = new JButton[5][5];
	private int contador = 0;
	private int ronda = 1;
	private int fallos = 0;
	private int botonesClicados = 0;
	private JTextArea textArea;

    public MiJFrame() {
    	String[] options = {"Facil", "Medio", "Dificil"};

    	int selection = JOptionPane.showOptionDialog(null, "Dificuldad", "Menu", 
                                            0, -1, null, options, options[0]);
    	
    	switch (selection) {
			case 0: 
				jugar(5);
				break;
			case 1:
				jugar(10);
				break;
			case 2:
				jugar(15);
				break;
    	}
    }

	private boolean comprobar(int x, int y) {
		if(((int)Math.round(Math.random()*10)) <= 3){
			textArea.append("\nRonda: "+ ronda + " (" + x + ", " + y + ") -> AGUA");
			contador++;
			return false;
		}else{
			textArea.append("\nRonda: "+ ronda + " (" + x + ", " + y + ") -> BARCO");
			return true;
		}
	}
	
	private void jugar(int k) {
		fallos = k;
        setTitle("BatterShip");
        setSize(250,400);
		setResizable(false);
		
		JPanel panelBotones = new JPanel(new GridLayout(6, 6));
		panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 10, 0, 20));

		for (int i = 0; i < 5; i++) {
			JLabel x = new JLabel(String.valueOf(i + 1));
			x.setHorizontalAlignment(SwingConstants.CENTER);
			panelBotones.add(x);

			for (int j = 0; j < 5; j++) {
				JButton boton = new JButton();
				boton.setPreferredSize(new Dimension(40, 40));
				botones[i][j] = boton;
				int xh = i+1;
				int yv = j+1;
				boton.addActionListener(e -> {
					boolean b = comprobar(xh,yv);
					ronda++;
					botonesClicados++;
					boton.setEnabled(false);
					
					if(b) {
						ImageIcon icon = new ImageIcon("src/eje35/barco.png");
						Image img = icon.getImage().getScaledInstance(40, 40, 0);
						boton.setIcon(new ImageIcon(img));
					}else {
						ImageIcon icon = new ImageIcon("src/eje35/agua.jpg");
						Image img = icon.getImage().getScaledInstance(40, 40, 0);
						boton.setIcon(new ImageIcon(img));

					}
					if(contador == fallos) {
						JOptionPane.showMessageDialog(null, "Perdiste");
						System.exit(0);
					}else if(botonesClicados == 25 - (fallos - contador)) {
						JOptionPane.showMessageDialog(null, "Ganaste");
						System.exit(0);
					}
					textArea.setCaretPosition(textArea.getDocument().getLength());
				});
				panelBotones.add(boton);
			}
		}
		panelBotones.add(new JLabel());
		for (int i = 1; i <= 5; i++) {
			JLabel x = new JLabel(String.valueOf(i));
			x.setHorizontalAlignment(SwingConstants.CENTER);
			panelBotones.add(x);

		}

        textArea = new JTextArea("Dale click");
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setForeground(Color.WHITE);
        textArea.setBackground(Color.BLACK);


        DefaultCaret caret = (DefaultCaret) textArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 30, 20));
        scrollPane.setPreferredSize(new Dimension(100, 105));

		JLabel titulo = new JLabel("Zona enemiga");
		titulo.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
		
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(titulo, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.SOUTH);
        getContentPane().add(panelBotones, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
	}
}
