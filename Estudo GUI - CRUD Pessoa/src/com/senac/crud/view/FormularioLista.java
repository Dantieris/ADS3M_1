package com.senac.crud.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import com.senac.crud.model.Pessoa;

public class FormularioLista extends JFrame {
	
	private DefaultListModel<Pessoa> modelList;
	private JList<Pessoa> lt_lista;
	private JButton bt_novo, bt_editar, bt_remover;
	private JMenuItem mi_novo, mi_editar, mi_remover;
	private JButton tb_novo, tb_editar, tb_remover;
	
	public FormularioLista() {
		super("CRUD Pessoa");		
		this.setLocation(600,250);
		this.setSize(280,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		
		iniciarMenu();
		iniciarToolbar();
		iniciarComponentes();
		
		this.setVisible(true);
	}
	
	private void iniciarMenu() {
		// Adicionando menu arquivo
		JMenuBar mb_menu = new JMenuBar();
		
		JMenu mn_arquivo = new JMenu("Arquivo");
		
		mn_arquivo.setMnemonic(KeyEvent.VK_A);
		
		JMenu mn_ajuda = new JMenu("Ajuda");
		
		mn_ajuda.setMnemonic(KeyEvent.VK_J);

		mi_novo = new JMenuItem("Novo");
		
		mi_novo.setMnemonic(KeyEvent.VK_N);
		mi_novo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		
		mi_editar = new JMenuItem("Editar");
		
		mi_editar.setMnemonic(KeyEvent.VK_E);
		mi_editar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_MASK));
		
		mi_remover = new JMenuItem("Remover");
		
		mi_remover.setMnemonic(KeyEvent.VK_R);
		mi_remover.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK));
		
		mn_arquivo.add(mi_novo);
		mn_arquivo.add(mi_editar);
		mn_arquivo.add(mi_remover);

		mb_menu.add(mn_arquivo);
		mb_menu.add(mn_ajuda);
		
		this.setJMenuBar(mb_menu);
		
		// Adicionando leitor de eventos aos itens de menu
		mi_novo.addActionListener(new LeitorEventos());
		mi_editar.addActionListener(new LeitorEventos());
		mi_remover.addActionListener(new LeitorEventos());
	}
	
	private void iniciarToolbar() {
		JToolBar toolbar = new JToolBar();
		
		toolbar.setFloatable(true);
		
		ImageIcon iconeNovo = new ImageIcon("imagens/novo.jpg", "Novo");
		ImageIcon iconeEditar = new ImageIcon("imagens/editar.jpg", "Editar");
		ImageIcon iconeRemover = new ImageIcon("imagens/remover.png", "Remover");
		
		tb_novo = new JButton(iconeNovo);
		tb_editar = new JButton(iconeEditar);
		tb_remover = new JButton(iconeRemover);
		
		toolbar.add(tb_novo);
		toolbar.add(tb_editar);
		toolbar.add(tb_remover);
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.ipadx = 0;
		c.ipady = 0;
		
		c.weightx = 100;
		c.weighty = 100;		
		
		c.anchor = GridBagConstraints.NORTH;
		
	    c.gridheight = 1;
	    c.gridwidth = 3;
	    
	    c.gridx = 0;
	    c.gridy = 0;
		
		this.add(toolbar, c);
		
		// Adicionando leitor de eventos aos botões da toolbar
		tb_novo.addActionListener(new LeitorEventos());
		tb_editar.addActionListener(new LeitorEventos());
		tb_remover.addActionListener(new LeitorEventos());
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
		bt_remover = new JButton("Remover");
		
		c.weightx = 50;
		c.weighty = 50;		
		
		c.anchor = GridBagConstraints.LINE_END;
		
	    c.gridheight = 1;
	    c.gridwidth = 1;
	    
	    c.gridx = 2;
	    c.gridy = 1;
		
		this.add(bt_remover, c);
		
		// Adicionando evento aos botões
		bt_novo.addActionListener(new LeitorEventos());
		bt_editar.addActionListener(new LeitorEventos());
		bt_remover.addActionListener(new LeitorEventos());
	}
	
	public DefaultListModel<Pessoa> getModelList() {
		return this.modelList;
	}
	
	public void refresh() {
		lt_lista.updateUI();
	}

	class LeitorEventos implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(bt_novo) || e.getSource().equals(mi_novo) || e.getSource().equals(tb_novo)) {
				new FormularioPessoa(FormularioLista.this, new Pessoa());
			}
			
			if (e.getSource().equals(bt_editar) || e.getSource().equals(mi_editar) || e.getSource().equals(tb_editar)) {
				new FormularioPessoa(FormularioLista.this, lt_lista.getSelectedValue());
			}
			
			if (e.getSource().equals(bt_remover) || e.getSource().equals(mi_remover) || e.getSource().equals(tb_remover)) {
				modelList.removeElement(lt_lista.getSelectedValue());
				
				refresh();
				
				JOptionPane.showMessageDialog(FormularioLista.this, "Cadastro removido com sucesso...");
			}
		}
		
	}
	
}
