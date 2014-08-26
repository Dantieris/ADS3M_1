package com.senac.gui.janela;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MinhaJanela extends JFrame {
	
	public MinhaJanela(String titulo) {
		super(titulo);
		this.setLocation(400,200);
		this.setSize(250,250);
		
		JLabel lb_nome = new JLabel("Nome: ");
		this.add(lb_nome);
		
		JTextField tf_nome = new JTextField();
		this.add(tf_nome);
		
		JLabel lb_idade = new JLabel("Idade: ");
		this.add(lb_idade);
		
		JTextField tf_idade = new JTextField();
		this.add(tf_idade);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
