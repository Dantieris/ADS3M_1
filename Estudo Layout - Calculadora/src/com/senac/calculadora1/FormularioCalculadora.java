package com.senac.calculadora1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormularioCalculadora extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5315264336588279707L;
	
	private char operador;
	private int numero;
	private JTextField tf_visor;
	private JButton bt_1, bt_2, bt_3, bt_4, bt_5, bt_6, bt_7, 
					bt_8, bt_9, bt_0, bt_soma, bt_subtracao, 
					bt_divisao, bt_multiplicacao, bt_igual,
					bt_c;
	
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
		
		// Criando as instâncias dos botões e do painel.
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
		bt_c				= new JButton("C");
		
		
		JPanel pn_botoes 	= new JPanel(new GridLayout(4,4, 8, 8));
		
		// Adicionandos os botões ao painel.
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
		
		pn_botoes.add(bt_c);
		pn_botoes.add(bt_0);
		pn_botoes.add(bt_igual);
		pn_botoes.add(bt_soma);
		
		// Adicionando leitores de evento aos botões
		bt_7.addActionListener(this);
		bt_8.addActionListener(this);
		bt_9.addActionListener(this);
		bt_divisao.addActionListener(this);
		
		bt_4.addActionListener(this);
		bt_5.addActionListener(this);
		bt_6.addActionListener(this);
		bt_multiplicacao.addActionListener(this);
		
		bt_1.addActionListener(this);
		bt_2.addActionListener(this);
		bt_3.addActionListener(this);
		bt_subtracao.addActionListener(this);
		
		bt_c.addActionListener(this);
		bt_0.addActionListener(this);
		bt_igual.addActionListener(this);
		bt_soma.addActionListener(this);
		
		// Adicionandos os paineis ao frame.
		this.getContentPane().add(pn_visor, BorderLayout.NORTH);
		this.getContentPane().add(pn_botoes, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Define a operação do calculo.
		if (e.getSource().equals(bt_soma)) {
			this.operador = '+';
			numero = getNumeroVisor();
			tf_visor.setText("");
		} else
		if (e.getSource().equals(bt_subtracao)) {
			this.operador = '-';
			numero = getNumeroVisor();
			tf_visor.setText("");
		} else
		if (e.getSource().equals(bt_divisao)) {
			this.operador = '/';
			numero = getNumeroVisor();
			tf_visor.setText("");
		}
		if (e.getSource().equals(bt_multiplicacao)) {
			this.operador = '*';
			numero = getNumeroVisor();
			tf_visor.setText("");
		} else
		
		// Define a operação igual e limpar.
		if (e.getSource().equals(bt_igual)) {
			tf_visor.setText(String.valueOf(calculo(this.numero, getNumeroVisor())));
		} else
		if(e.getSource().equals(bt_c)) {
			this.limpar();
		}

		// Define o texto do visor como: texto do visor + texto do botao.
		if (e.getSource().equals(bt_0)) {
			tf_visor.setText(tf_visor.getText() + bt_0.getText());
		} else
		if (e.getSource().equals(bt_1)) {
			tf_visor.setText(tf_visor.getText() + bt_1.getText());
		} else
		if (e.getSource().equals(bt_2)) {
			tf_visor.setText(tf_visor.getText() + bt_2.getText());
		} else
		if (e.getSource().equals(bt_3)) {
			tf_visor.setText(tf_visor.getText() + bt_3.getText());
		} else
		if (e.getSource().equals(bt_4)) {
			tf_visor.setText(tf_visor.getText() + bt_4.getText());
		} else
		if (e.getSource().equals(bt_5)) {
			tf_visor.setText(tf_visor.getText() + bt_5.getText());
		} else
		if (e.getSource().equals(bt_6)) {
			tf_visor.setText(tf_visor.getText() + bt_6.getText());
		} else
		if (e.getSource().equals(bt_7)) {
			tf_visor.setText(tf_visor.getText() + bt_7.getText());
		} else
		if (e.getSource().equals(bt_8)) {
			tf_visor.setText(tf_visor.getText() + bt_8.getText());
		} else
		if (e.getSource().equals(bt_9)) {
			tf_visor.setText(tf_visor.getText() + bt_9.getText());
		}
	}

	private int calculo(int num1, int num2) {
		switch (this.operador) {
			case '+' :
				return num1 + num2;
			case '-' :
				return num1 - num2;
			case '/' :
				return num1 / num2;
			case '*' :
				return num1 * num2;
			
			default : return 0;
		}
	}

	private int getNumeroVisor() {
		if (tf_visor.getText() != null) {
			return Integer.parseInt(tf_visor.getText());
		}
		return 0;
	}
	
	private void limpar() {
		tf_visor.setText("");
		
		operador 	= ' ';
		numero		= 0;
	}
}
