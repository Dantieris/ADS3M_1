package com.senac.desenho;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class TelaDesenho extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		// Desenha Chao
		g.setColor(new Color(139, 69, 19));
		
		g.fillRect(0, 300, 380, 60);
		
		// Desenha Parede
		g.setColor(new Color(255, 165, 0));
		
		g.fillRect(120, 150, 200, 150);
		
		// Desenha Porta e Janela
		g.setColor(new Color(108, 166, 205));
		
		g.fillRect(235, 190, 50, 40);
		
		g.fillRect(160, 220, 50, 80);
		
		g.setColor(Color.BLACK);
		
		
		g.setFont(new Font("Ravie", Font.BOLD, 52));
		g.drawString("UMA CASA", 0, 50);
	}
	
	private class TrataBotoesMouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
