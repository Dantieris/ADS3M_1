package com.senac.desenho;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TelaDesenho extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawLine(0, 300, 400, 300);
		
		g.setColor(Color.GREEN);
		
		g.fillRect(0, 300, 400, 300);
		
		g.setColor(Color.RED);
		
		g.fillRect(120, 150, 200, 150);
		
		g.setColor(Color.BLUE);
		
		g.fillRect(235, 190, 50, 40);
		
		g.fillRect(160, 220, 50, 80);
		
		g.setColor(Color.BLACK);
		
	}
}
