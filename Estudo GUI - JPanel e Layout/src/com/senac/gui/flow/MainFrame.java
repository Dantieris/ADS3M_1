package com.senac.gui.flow;

import javax.swing.JFrame;

public class MainFrame {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Estudos GUI - Flow");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(160,115);
		frame.setResizable(false);
		
		PainelFlow painel = new PainelFlow();
		frame.add(painel);
		
		frame.setVisible(true);
	}
}
