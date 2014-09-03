package com.senac.view;

import java.util.Scanner;

public class Console {
	
	public static void exibirSaudacao() {
		System.out.println("*** Bem Vindo ao Sistema! ***");
	}
	
	public static void exibirSaida() {
		System.out.println("*** Sistema Finalizando... ***");
	}
	
	public static int exibirMenu() {
		String menu = "\n"
				+ "1 - Inserir\n"
				+ "2 - Remover\n"
				+ "3 - Procurar\n"
				+ "4 - Sair\n";
		
		System.out.println(menu);
		
		return scanner().nextInt();
	}

	private static Scanner scanner() {
		return new Scanner(System.in,"UTF-8");
	}

	public static void exibirInserir() {
		System.out.println("\n"
				+ "** Opção Inserir ** ");
	}

	public static void exibirRemover() {
		System.out.println("\n"
				+ "** Opção Remover **");
	}

	public static void exibirProcura() {
		System.out.println("\n"
				+ "** Opção Procurar **");
	}

	public static void exibirOpcaoInvalida() {
		System.out.println("\n"
				+ "** Opção inválida **");
	}

	public static String receberValor() {
		System.out.println("\n"
				+ "Digite o valor: ");
		return scanner().nextLine();
	}

	public static void exibirErro(String mensagem) {
		System.err.println(mensagem);
	}
}
