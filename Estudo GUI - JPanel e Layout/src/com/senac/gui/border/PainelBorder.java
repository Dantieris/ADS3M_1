package com.senac.gui.border;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelBorder extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5740736044303692604L;

	public PainelBorder() {
		super(new BorderLayout());
		
		JLabel lb_nome = new JLabel("Nome:");
		add(lb_nome, BorderLayout.AFTER_LAST_LINE);
		
		JTextField tf_nome = new JTextField("                       ");
		add(tf_nome, BorderLayout.AFTER_LINE_ENDS);
		
		JLabel lb_idade = new JLabel("Idade:");
		add(lb_idade, BorderLayout.BEFORE_FIRST_LINE);
		
		JTextField tf_idade = new JTextField("                      ");
		add(tf_idade, BorderLayout.BEFORE_LINE_BEGINS);
		
		JButton bt_ok = new JButton("OK");
		add(bt_ok, BorderLayout.LINE_END);
		
		JButton bt_cancelar = new JButton("Cancelar");
		add(bt_cancelar, BorderLayout.LINE_START);
	}
}
