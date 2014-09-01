package com.senac.controller;

import java.io.FileNotFoundException;

import com.senac.csv.LeitorCSV;
import com.senac.view.Console;

public class Controller {

	private LeitorCSV csv;
	
	public Controller() {
		try {
			csv = new LeitorCSV();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int menu() {
		int op = Console.exibirMenu();
		
		switch (op) {
		case 1 :
			Console.exibirInserir();
			break;
		case 2 :
			Console.exibirRemover();
			break;
		case 3 :
			Console.exibirProcura();
			break;
		case 4 :
			Console.exibirSaida();
			return -1;
		default :
			Console.exibirOpcaoInvalida();
		}
		
		return 0;
	}
	
}
