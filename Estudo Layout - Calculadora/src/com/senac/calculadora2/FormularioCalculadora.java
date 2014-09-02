package com.senac.calculadora2;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.ldap.Rdn;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FormularioCalculadora extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5109265784904439912L;
	private JTextField tf_numero1, tf_numero2, tf_resultado;
	private JButton bt_calcular, bt_zerar;
	private JRadioButton rb_soma, rb_multiplicacao, rb_divisao, 
						rb_subtracao;
	
	public static void main(String[] args) {
		new FormularioCalculadora();
	}
	
	public FormularioCalculadora() {
		super("Calculadora 2");
		
		iniciarComponentes();
		
		this.setSize(340, 220);
		this.setLocation(200,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new GridLayout(5,1));
	}

	private void iniciarComponentes() {
		// Adicionando os campo de texto do numero 1 e numero 2 ao painel numero1, e numero2.
		Font fonte = new Font("Arial", Font.BOLD, 14);
		
		tf_numero1 = new JTextField(15);
		tf_numero2 = new JTextField(15);
		
		tf_numero1.setEditable(true);
		tf_numero1.setHorizontalAlignment(JTextField.RIGHT);
		tf_numero1.setFont(fonte);
		
		tf_numero2.setEditable(true);
		tf_numero2.setHorizontalAlignment(JTextField.RIGHT);
		tf_numero2.setFont(fonte);
		
		JLabel lb_numero1 = new JLabel("Numero 1: ");
		JLabel lb_numero2 = new JLabel("Numero 2: ");
		
		JPanel pn_numero1 = new JPanel();
		
		pn_numero1.add(lb_numero1);
		pn_numero1.add(tf_numero1);
		
		JPanel pn_numero2 = new JPanel();
		
		pn_numero2.add(lb_numero2);
		pn_numero2.add(tf_numero2);
		
		// Adicionandos o grupo de radio button ao painel de operadores.
		rb_soma 			= new JRadioButton("Soma");
		rb_multiplicacao 	= new JRadioButton("Multiplicação");
		rb_subtracao 		= new JRadioButton("Subtração");
		rb_divisao 			= new JRadioButton("Divisão");
		
		ButtonGroup operadores = new ButtonGroup();
		
		operadores.add(rb_soma);
		operadores.add(rb_subtracao);
		operadores.add(rb_multiplicacao);
		operadores.add(rb_divisao);
		
		JPanel pn_operadores = new JPanel();
		
		pn_operadores.add(rb_soma);
		pn_operadores.add(rb_subtracao);
		pn_operadores.add(rb_multiplicacao);
		pn_operadores.add(rb_divisao);		
		
		// Adicionando o campo de texto do resultado ao painel resultado.
		tf_resultado = new JTextField(15);
		
		tf_resultado.setEditable(true);
		tf_resultado.setHorizontalAlignment(JTextField.RIGHT);
		tf_resultado.setFont(fonte);
		
		JLabel lb_resultado = new JLabel("Resultado: ");
		
		JPanel pn_resultado = new JPanel();
		
		pn_resultado.add(lb_resultado);
		pn_resultado.add(tf_resultado);
		
		// Adicionando os botões ao painel botões.
		bt_calcular = new JButton("Calcular");
		bt_zerar	= new JButton("Zerar");
		
		JPanel pn_botoes = new JPanel();
		
		pn_botoes.add(bt_zerar);
		pn_botoes.add(bt_calcular);
		
		// Adicionando tratamento de ações nos botões.
		bt_calcular.addActionListener(this);
		bt_zerar.addActionListener(this);
		
		// Adicionando os paineis ao frame.
		this.getContentPane().add(pn_numero1);
		this.getContentPane().add(pn_numero2);
		this.getContentPane().add(pn_operadores);
		this.getContentPane().add(pn_resultado);
		this.getContentPane().add(pn_botoes);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(bt_calcular)) {
			tf_resultado.setText(calcular());
		}
		else 
			if (e.getSource().equals(bt_zerar)) {
				limparCampos();
			}
	}
	
	private String calcular() {
		int numero1 = Integer.parseInt(tf_numero1.getText());
		int numero2 = Integer.parseInt(tf_numero2.getText());
		
		if (rb_soma.isSelected()) {
			return String.valueOf(numero1 + numero2);			
		}
		
		if (rb_subtracao.isSelected()) {
			return String.valueOf(numero1 - numero2);
		}
		
		if (rb_multiplicacao.isSelected()) {
			return String.valueOf(numero1 * numero2);
		}
		
		if (rb_divisao.isSelected()) {
			return String.valueOf(numero1 / numero2);
		}
		
		return null;
	}

	private void limparCampos() {
		tf_numero1.setText("");
		tf_numero2.setText("");
		tf_resultado.setText("");
	}
}
