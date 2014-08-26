package com.senac.gui.bordermix;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		new Formulario();
	}
	
	private JLabel lb_nome, lb_idade;
	private JTextField tf_nome, tf_idade;
	private JButton bt_ok, bt_limpar;
	
	public Formulario() {
		super("Formulario");
		
		iniciarComponentes();
		
		this.setSize(300, 300);
		this.setLocation(200,300);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void iniciarComponentes() {				
		// Adicionando o label e text field ao painel.
		lb_nome 	= new JLabel("Nome: ");
		tf_nome 	= new JTextField(20);
		
		JPanel pn_north		= new JPanel(new GridLayout(2,1));
		
		pn_north.add(lb_nome);
		pn_north.add(tf_nome);
		lb_idade 	= new JLabel("Idade: ");
		tf_idade 	= new JTextField(20);
				
		pn_north.add(lb_idade);		
		pn_north.add(tf_idade);
		
		// Adicionando os botoes ao painel.
		bt_ok 		= new JButton("OK");		
		bt_limpar 	= new JButton("Limpar");
		
		bt_ok.addActionListener(this);
		bt_limpar.addActionListener(this);
		
		JPanel pn_botoes 	= new JPanel();
		
		pn_botoes.add(bt_ok);
		pn_botoes.add(bt_limpar);
		
		// Adicionandos os paineis ao frame.
		this.getContentPane().add(pn_north);
		this.getContentPane().add(pn_botoes, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(bt_ok)) {
			JOptionPane.showMessageDialog(this, "Botão OK");
		} else if (e.getSource().equals(bt_limpar)){
			JOptionPane.showMessageDialog(this, "Botão limpar");
		}
	}
	
}
