package com.senac.apps;

import java.util.Scanner;

import com.senac.util.Arvore;
import com.senac.util.No;

public class Principal {
	
	private static Scanner scanner = new Scanner(System.in, "UTF-8");
	private static Arvore arvore;
	public static void main(String[] args) {
		arvore = new Arvore();

		int op = 0;
		
		while(op < 2) {
			System.out.println("1 - Inserir na �rvore\n"
					+ "2 - Definir Ordem \n"
					+ "3 - Imprimir �rvore"
					+ "3 - Sair");
	
			op = scanner.nextInt();
			
			switch(op) {
			case 1 :
				inserirArvore();
				break;
			case 2 :
				definirOrdem();
				break;
			case 3 :
				imprimirArvore();
				break;
			default : System.out.println("Op��o inv�lida.");
			}
		}
	}

	public static void inserirArvore() {
		System.out.println("Digite o valor do n�: ");
		
		arvore.inserir(new No(scanner.nextInt()));
	}
	
	public static void definirOrdem() {
		System.out.println("Digite a ordem da �rvore: ");
		
		No.setOrdem(scanner.nextInt());
	}
	
	private static void imprimirArvore() {
		
	}
}
