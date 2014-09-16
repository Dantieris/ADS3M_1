package com.senac.crud.controller;

import com.senac.crud.view.FormularioLista;

public class Controller implements Runnable {

	@Override
	public void run() {
		new FormularioLista();
	}

	public static void main(String[] args) {
		new Controller().run();
	}
}