package com.senac.gui.grid;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelGrid extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6084919849457737861L;

	public PainelGrid() {
		super(new GridLayout(3,3,20,10));
		
		JLabel lb_nome = new JLabel("Nome:");
		Font fonte = new Font("Ravie", Font.PLAIN, 20);
		lb_nome.setFont(fonte);
		add(lb_nome);
		
		JTextField tf_nome = new JTextField();
		tf_nome.setFont(fonte);
		add(tf_nome);
		
		JLabel lb_idade = new JLabel("Idade:");
		lb_idade.setFont(fonte);
		add(lb_idade);
		
		JTextField tf_idade = new JTextField();
		tf_idade.setFont(fonte);
		add(tf_idade);
		
		JButton bt_ok = new JButton("OK");
		Font fonte2 = new Font("Ravie", Font.PLAIN, 14);
		bt_ok.setFont(fonte2);
		add(bt_ok);
		
		JButton bt_cancelar = new JButton("Cancelar");
		bt_cancelar.setFont(fonte2);
		add(bt_cancelar);

	}
}
