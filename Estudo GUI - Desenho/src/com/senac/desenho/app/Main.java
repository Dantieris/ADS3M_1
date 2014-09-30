package com.senac.desenho.app;

import javax.swing.JFrame;

import com.senac.desenho.TelaDesenho;

public class Main {
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		
		tela.setLocation(600,250);
		tela.setSize(400,400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tela.add(new TelaDesenho());
		
		tela.setVisible(true);
	}
}
