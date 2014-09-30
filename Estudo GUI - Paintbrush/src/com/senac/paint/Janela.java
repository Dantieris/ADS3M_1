package com.senac.paint;

import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela () {
		super("Paintbrush");
		
		this.setLocation(600,250);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Paint paint = new Paint();
		
		paint.repaint();
		
		this.add(paint);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Janela();
	}
}
