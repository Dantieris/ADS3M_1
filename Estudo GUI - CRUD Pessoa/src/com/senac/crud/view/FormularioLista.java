package com.senac.crud.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

import com.senac.crud.model.Pessoa;

public class FormularioLista extends JFrame {
	
	private DefaultListModel<Pessoa> modelList;
	private JList<Pessoa> lt_lista;
	private JButton bt_novo, bt_editar, bt_remover;
	
	public FormularioLista() {
		super("CRUD Pessoa");		
		this.setLocation(400,200);
		this.setSize(280,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		
		iniciarComponentes();
		
		this.setVisible(true);
	}

	private void iniciarComponentes() {
		// Configurando o Layout
		GridBagConstraints c = new GridBagConstraints();
		
		modelList = new DefaultListModel<Pessoa>();
		lt_lista = new JList<Pessoa>(modelList);
		
		// Adicionando a lista ao JFrame
		lt_lista.setSize(200, 200);
		
		c.fill = GridBagConstraints.BOTH;
		
		c.ipadx = 0;
		c.ipady = 0;
		
		c.weightx = 100;
		c.weighty = 100;		
		
		c.anchor = GridBagConstraints.NORTH;
		
	    c.gridheight = 1;
	    c.gridwidth = 3;
	    
	    c.gridx = 0;
	    c.gridy = 0;
		
		this.add(lt_lista, c);
		
		// Adicionando o botão novo ao JFrame
		bt_novo = new JButton("Novo");
		
		c.fill = GridBagConstraints.NONE;
		
		c.weightx = 50;
		c.weighty = 50;		
		
		c.anchor = GridBagConstraints.LINE_START;
		
	    c.gridheight = 1;
	    c.gridwidth = 1;
	    
	    c.gridx = 0;
	    c.gridy = 1;
		
		this.add(bt_novo, c);
		
		// Adicionando o botão editar ao JFrame
		bt_editar = new JButton("Editar");
		
		c.weightx = 50;
		c.weighty = 50;		
		
		c.anchor = GridBagConstraints.CENTER;
		
	    c.gridheight = 1;
	    c.gridwidth = 1;
	    
	    c.gridx = 1;
	    c.gridy = 1;
		
		this.add(bt_editar, c);
		
		// Adicionando o botão remover ao JFrame
		bt_editar = new JButton("Remover");
		
		c.weightx = 50;
		c.weighty = 50;		
		
		c.anchor = GridBagConstraints.LINE_END;
		
	    c.gridheight = 1;
	    c.gridwidth = 1;
	    
	    c.gridx = 2;
	    c.gridy = 1;
		
		this.add(bt_editar, c);
		
		// Adicionando evento aos botões
		bt_novo.addActionListener(new LeitorEventos());
	}
	
	class LeitorEventos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			FormularioPessoa form = new FormularioPessoa(new Pessoa());
			
			modelList.addElement(form.getPessoa());
		}
		
	}
	
}
