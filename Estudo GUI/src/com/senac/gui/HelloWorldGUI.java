package com.senac.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldGUI {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				helloWorld();
			}
		});
	}
	
	private static void helloWorld() {
		// Criando e definindo a janela
		JFrame janela = new JFrame("Hello World GUI!");
		janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
		
		// Criando a mensagem "Hello World GUI!" e adicionando à janela
		JLabel lb_hello = new JLabel("Hello World GUI!");
		janela.getContentPane().add(lb_hello);
		
		// Mostrando a janela
		janela.pack();
		janela.setVisible(true);
	}
}
