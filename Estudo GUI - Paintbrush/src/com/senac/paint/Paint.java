package com.senac.paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Paint extends JPanel {
	
	private int x, y, altura, largura, r, gr, b, color;
	private int forma;
	
	public Paint() {
		addMouseListener(new TratarBotoesMouse());
		addMouseMotionListener(new TratarMovimentoMouse());
		
		altura = 1;
		largura = 1;
		
		r = 255;
		gr = 0;
		b = 0;
		
		color = 2;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		calculaColor();
		
		System.out.println(r + "," + gr + "," + ",");
		
		g.setColor(new Color(r, gr, b));
		
		if (forma == 1) {
			g.drawOval(x, y, largura++, altura++);
		}
		
		if (forma == 2) {
			g.drawRect(x, y, largura++, altura++);
		}
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	private class TratarBotoesMouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			largura = 1;
			altura = 1;
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			switch (e.getButton()) {
			case 1 : 
				x = e.getX();
				y = e.getY();
				
				forma = 1;
				
				repaint();
				break;
			case 2 :
				altura = 0;
				largura = 0;
				break;
			case 3 :
				x = e.getX();
				y = e.getY();
				
				forma = 2;
				
				repaint();
				break;
				
			default : 
			}
		}
		
	}
	
	public void calculaColor() {
		switch (color) {
		case 1 : 
			if (r < 255) {
				r++;
			} else {
				r = 0;
				color = 2;
			}
			break;
		case 2 :
			if (gr < 255) {
				gr++;
			} else {
				gr = 0;
				color = 3;
			}
			break;
		case 3 :
			if (b < 255) {
				b++;
			} else {
				b = 0;
				color = 1;
			}
		}
	}
	
	private class TratarMovimentoMouse implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			
		}
		
	}
}
