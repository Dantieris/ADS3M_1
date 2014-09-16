package com.senac.crud.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.senac.crud.model.Pessoa;

public class FormularioPessoa extends JFrame {
	
	private JTextField tf_nome, tf_idade;
	private JButton bt_ok, bt_cancelar;
	private Pessoa pessoa;
	
	public FormularioPessoa(Pessoa pessoa) {
		super("Formulário Pessoa");
		
		this.pessoa = pessoa;
		
		this.setLocation(400,200);
		this.setSize(280,200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		
		iniciarComponentes();
		
		this.setVisible(true);
	}

	private void iniciarComponentes() {
		GridBagConstraints c = new GridBagConstraints();
		
		// Adicionando o label nome ao painel.
		JLabel lb_nome 	= new JLabel("Nome:");
		
		c.weightx = 50;
		c.weighty = 50;

		c.anchor = GridBagConstraints.WEST;
		
	    c.gridheight = 1;
	    c.gridwidth = 1;
	    
	    c.gridx = 1;
	    c.gridy = 1;
	    
	    this.add(lb_nome, c);
		
	    // Adicionando o texto nome ao painel.
		tf_nome = new JTextField(15);
		
	    c.gridheight = 1;
	    c.gridwidth = 2;
	    
	    
	    c.gridx = 2;
	    c.gridy = 1;
	    
	    this.add(tf_nome, c);
	    
		// Adicionando o label idade ao painel.
		JLabel lb_idade = new JLabel("Idade:");
		
		c.gridheight = 1;
		c.weightx = 1;
	    c.gridx = 1;
	    c.gridy = 2;
	    
		this.add(lb_idade, c);
	    // Adicionando o texto idade ao painel.
		tf_idade = new JTextField(15);
		
		c.gridheight = 1;
	    c.gridwidth = 2;
	    
	    c.gridx = 2;
	    c.gridy = 2;
	    
	    this.add(tf_idade, c);
	    // Adicionando os botões ao painel
	    bt_ok 		= new JButton("OK");
	    bt_cancelar = new JButton("Cancelar");
	    
	    c.anchor = GridBagConstraints.CENTER;
	    
		c.gridheight = 1;
		c.weightx = 1;
	    
		c.gridx = 1;
	    c.gridy = 5;
	    
	    this.add(bt_ok, c);
	    
	    
	    
		c.gridheight = 1;
		c.weightx = 1;
		
	    c.gridx = 2;
	    c.gridy = 5;
	    
	    this.add(bt_cancelar, c);
	    
	}
	
	public Pessoa getPessoa() {
		return this.pessoa;
	}
	
	class LeitorEventos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			pessoa.setNome(tf_nome.getText());
			pessoa.setIdade(Integer.parseInt(tf_idade.getText()));
			
			JOptionPane.showMessageDialog(FormularioPessoa.this, "Cadastro realizado com sucesso...");
			
			dispose();
		}
		
	}
}
