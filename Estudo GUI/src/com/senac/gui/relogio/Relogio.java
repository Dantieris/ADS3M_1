package com.senac.gui.relogio;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Relogio {
	
	public static void main(String[] args) {
		JFrame janela = new JFrame();
		janela.setTitle("Relógio");
		janela.setResizable(false);
		janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
		
		Date d = new Date();  
		  
		Calendar cal = new GregorianCalendar();  
		  
		cal.setTime(d);  
		
		JLabel hora = new JLabel(strHora);
		Font fonte = new Font("Arial", Font.BOLD, 32);
		hora.setFont(fonte);
		JLabel pont = new JLabel(":");
		pont.setFont(fonte);
		JLabel minu = new JLabel(strMinu);
		minu.setFont(fonte);
		JPanel pain = new JPanel();
		TitledBorder title;
		Border blackline;
		blackline = BorderFactory.createLineBorder(Color.black);
		title = BorderFactory.createTitledBorder(
                blackline, "Relógio");
		title.setTitleJustification(TitledBorder.CENTER);
		pain.setBorder(title);
		
		pain.add(hora);
		pain.add(pont);
		pain.add(minu);
		
		janela.getContentPane().add(pain);
		
		janela.pack();
		janela.setVisible(true);
		
	}
	
}
