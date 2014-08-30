package com.senac.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormularioCalculadora extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5315264336588279707L;
	
	private JTextField tf_visor;
	private JButton bt_1, bt_2, bt_3, bt_4, bt_5, bt_6, bt_7, 
					bt_8, bt_9, bt_0, bt_soma, bt_subtracao, 
					bt_divisao, bt_multiplicacao, bt_igual,
					bt_vazio;
	
	public static void main(String[] args) {
		new FormularioCalculadora();
	}
	
	public FormularioCalculadora() {
		super("Calculadora");
		
		iniciarComponentes();
		
		this.setSize(250, 200);
		this.setLocation(200,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void iniciarComponentes() {				
		// Adicionando o visor text field ao painel.
		Font fonte = new Font("Arial", Font.BOLD, 14);
		
		tf_visor = new JTextField();
		tf_visor.setEditable(true);
		tf_visor.setHorizontalAlignment(JTextField.RIGHT);
		tf_visor.setFont(fonte);
		
		JPanel pn_visor	= new JPanel(new GridLayout(1,1));
		
		pn_visor.add(tf_visor);
		
		// Adicionando os botoes ao painel.
		bt_0 = new JButton("0");
		bt_1 = new JButton("1");
		bt_2 = new JButton("2");
		bt_3 = new JButton("3");
		bt_4 = new JButton("4");
		bt_5 = new JButton("5");
		bt_6 = new JButton("6");
		bt_7 = new JButton("7");
		bt_8 = new JButton("8");
		bt_9 = new JButton("9");
		
		bt_soma 			= new JButton("+");
		bt_subtracao		= new JButton("-");
		bt_divisao			= new JButton("/");
		bt_multiplicacao	= new JButton("*");
		bt_igual			= new JButton("=");
		bt_vazio			= new JButton("");
		
		
		JPanel pn_botoes 	= new JPanel(new GridLayout(4,4, 8, 8));

		pn_botoes.add(bt_7);
		pn_botoes.add(bt_8);
		pn_botoes.add(bt_9);
		pn_botoes.add(bt_divisao);
		
		pn_botoes.add(bt_4);
		pn_botoes.add(bt_5);
		pn_botoes.add(bt_6);
		pn_botoes.add(bt_multiplicacao);
		
		pn_botoes.add(bt_1);
		pn_botoes.add(bt_2);
		pn_botoes.add(bt_3);
		pn_botoes.add(bt_subtracao);
		
		pn_botoes.add(bt_vazio);
		pn_botoes.add(bt_0);
		pn_botoes.add(bt_igual);
		pn_botoes.add(bt_soma);
		
		// Adicionandos os paineis ao frame.
		this.getContentPane().add(pn_visor, BorderLayout.NORTH);
		this.getContentPane().add(pn_botoes, BorderLayout.CENTER);
	}
}
