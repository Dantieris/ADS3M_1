package com.senac.gui.border;

import javax.swing.JFrame;

public class MainFrame {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Estudos GUI - Flow");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,250);
		frame.setResizable(true);
		
		PainelBorder painel = new PainelBorder();
		frame.add(painel);
		
		frame.setVisible(true);
	}
}
