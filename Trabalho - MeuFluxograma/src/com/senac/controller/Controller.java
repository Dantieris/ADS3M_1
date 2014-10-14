package com.senac.controller;

import com.senac.boundary.MainFrame;

public class Controller implements Runnable {

	@Override
	public void run() {
		new MainFrame();
	}

	public static void main(String[] args) {
		new Controller().run();
	}
}