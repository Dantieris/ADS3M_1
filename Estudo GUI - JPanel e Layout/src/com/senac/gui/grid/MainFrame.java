package com.senac.gui.grid;

import javax.swing.JFrame;

public class MainFrame {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Estudos GUI - Grid");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,180);
		frame.setResizable(false);
		
		PainelGrid painel = new PainelGrid();
		frame.add(painel);
		
		frame.setVisible(true);
	}
}
