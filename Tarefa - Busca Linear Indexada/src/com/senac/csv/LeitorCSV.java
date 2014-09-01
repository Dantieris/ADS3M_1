package com.senac.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeitorCSV {
	
	private Scanner leitor;
	
	public LeitorCSV() throws FileNotFoundException {
		leitor = new Scanner( new BufferedReader( new FileReader("dados.csv")));
	}
	
	public String getLine() {
		return leitor.nextLine();
	}
	
	public String[] getArrayLine(String line) {
		return line.split("#");
	}
	
}
