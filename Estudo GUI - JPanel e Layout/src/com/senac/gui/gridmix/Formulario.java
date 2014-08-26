package com.senac.gui.gridmix;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario extends JFrame {
	
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
		this.getContentPane().setLayout(new FlowLayout());
				
		// Adicionando o label e text field ao painel.
		lb_nome 	= new JLabel("Nome: ");
		tf_nome 	= new JTextField(20);
		
		JPanel pn_nome		= new JPanel();
		
		pn_nome.add(lb_nome);
		pn_nome.add(tf_nome);
		
		// Adicionando o label e text field ao painel.
		lb_idade 	= new JLabel("Idade: ");
		tf_idade 	= new JTextField(20);
		
		JPanel pn_idade 	= new JPanel();
		
		pn_idade.add(lb_idade);		
		pn_idade.add(tf_idade);
		
		// Adicionando os botoes ao painel.
		bt_ok 		= new JButton("OK");		
		bt_limpar 	= new JButton("Limpar");
		
		JPanel pn_botoes 	= new JPanel();
		
		pn_botoes.add(bt_ok);
		pn_botoes.add(bt_limpar);
		
		// Adicionandos os paineis ao frame.
		this.getContentPane().add(pn_nome);
		this.getContentPane().add(pn_idade);
		this.getContentPane().add(pn_botoes);
	}
	
}
