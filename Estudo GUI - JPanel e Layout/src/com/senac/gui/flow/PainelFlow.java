package com.senac.gui.flow;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelFlow extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 41447826784377611L;

	public PainelFlow() {
		super(new FlowLayout());
		
		JLabel lb_nome = new JLabel("Nome:");
		add(lb_nome);
		
		JTextField tf_nome = new JTextField("                       ");
		add(tf_nome);
		
		JLabel lb_idade = new JLabel("Idade:");
		add(lb_idade);
		
		JTextField tf_idade = new JTextField("                      ");
		add(tf_idade);
		
		JButton bt_ok = new JButton("OK");
		add(bt_ok);
		
		JButton bt_cancelar = new JButton("Cancelar");
		add(bt_cancelar);
	}
}
