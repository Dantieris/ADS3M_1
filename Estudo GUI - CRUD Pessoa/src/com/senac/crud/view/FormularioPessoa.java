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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9146403213983006501L;
	
	private JTextField tf_nome, tf_idade;
	private JButton bt_ok, bt_cancelar;
	private FormularioLista formularioLista;
	private Pessoa pessoa;
	
	public FormularioPessoa(FormularioLista formularioLista, Pessoa pessoa) {
		super("Formulário Pessoa");
		
		this.formularioLista = formularioLista;
		this.pessoa = pessoa;
		
		this.setLocation(600,300);
		this.setSize(280,200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		
		iniciarComponentes();
		
		if (pessoa.getIdade() > 0) {
			tf_nome.setText(pessoa.getNome());
			tf_idade.setText(String.valueOf(pessoa.getIdade()));
		}
		
		this.setVisible(true);
	}

	private void iniciarComponentes() {
		// Adicionando os elementos ao painel de conteudo
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
	    
	    // Adicionando evento aos botões
	    bt_ok.addActionListener(new LeitorEventos());
	    bt_cancelar.addActionListener(new LeitorEventos());
	}	
	
	class LeitorEventos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(bt_ok)) {
				
				if (pessoa.getIdade() == 0) {
					String nome = tf_nome.getText();
					int idade = Integer.parseInt(tf_idade.getText());
					
					pessoa.setNome(nome);
					pessoa.setIdade(idade);
					
					formularioLista.getModelList().addElement(pessoa);
					
					JOptionPane.showMessageDialog(FormularioPessoa.this, "Cadastro realizado com sucesso...");
				} 
				else {					
					String nome = tf_nome.getText();
					int idade = Integer.parseInt(tf_idade.getText());
					
					pessoa.setNome(nome);
					pessoa.setIdade(idade);
					
					formularioLista.refresh();
					
					JOptionPane.showMessageDialog(FormularioPessoa.this, "Cadastro editado com sucesso...");
				}

				dispose();
			}
			else {
				dispose();
			}
		}
		
	}
}
