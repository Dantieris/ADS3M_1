package com.senac.boundary;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import com.senac.entity.Figure;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4367262602094992196L;
	
	private JMenuItem mi_novo, mi_editar, mi_remover;
	private JButton tb_inicio, tb_fim, tb_processamento, tb_decisao, tb_subrotina, tb_seta;
	private DefaultListModel<Figure> modelList;
	private JList<Figure> lt_lista;
	
	public MainFrame() {
		super("MeuFluxograma");
		
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		iniciarMenu();
		iniciarToolbar();
		iniciarComponentes();
		
		this.setVisible(true);
	}

	private void iniciarComponentes() {
		// Adicionando o painel de desenho
		JPanel pn_tela = new JPanel();
		
		this.add(pn_tela, BorderLayout.EAST);
		// Adicionando o scrollpane de estruturas
		JPanel pn_estruturas = new JPanel();
		
		modelList = new DefaultListModel<>();
		lt_lista = new JList<>(modelList);
		lt_lista.setSize(200, 200);
		
		pn_estruturas.add(lt_lista);
		
		// Adicionando os paineis ao JFrame
		this.add(pn_tela);
		this.add(pn_estruturas);
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
		
		toolbar.setLayout(new FlowLayout());
		
		toolbar.setFloatable(false);
		
		tb_inicio = new JButton("INICIO");
		tb_fim = new JButton("FIM");
		tb_processamento = new JButton("PROCESSAMENTO");
		tb_decisao = new JButton("DECISAO");
		tb_subrotina = new JButton("SUBROTINA");
		tb_seta = new JButton("SETA");
		
		toolbar.add(tb_inicio);
		toolbar.add(tb_fim);
		toolbar.add(tb_processamento);
		toolbar.add(tb_decisao);
		toolbar.add(tb_subrotina);
		toolbar.add(tb_seta);
		
		this.add(toolbar, BorderLayout.NORTH);
		
		// Adicionando leitor de eventos aos botões da toolbar
		
	}
	
	class LeitorEventos implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
	
}
