package com.senac.jogos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.Random;
import java.util.Scanner;

public class PalavrasCruzadas {

	private static char[][] matrizPalavra;
	private static int x,y;
	private static char[] letras = {'a', 'b','c','d','e','f','g','l','s','p','j','m','n','o','i','t'};
	public static void main(String[] args) {

		x = 0;
		y = 0;

		// le o arquivo e passa os dados como entrada
		Scanner arquivo = null;
		try {
			arquivo = new Scanner(new BufferedReader(
					new FileReader("nomes.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// cria uma matriz que usa os dados do arquivo como entrada
		ArrayDeque<char[]> arrayDados = new ArrayDeque<char[]>();

		preencherArrayDados(arquivo, arrayDados);

		matrizPalavra = new char[20][14];

		preencherMatriz();

		while (!arrayDados.isEmpty()) {
			if (arrayDados.size() >= 2) {
				char [] palavra1 = arrayDados.pollFirst();
				char [] palavra2 = arrayDados.pollFirst();

				// Se a palavra1 possui o primeiro caracter da palavra2
				if (combinaPalavra(palavra1, palavra2[0])) {
					int i = 0;
					int j = 0;
					for (i = 0 ; i < palavra1.length ; i++) {
						matrizPalavra[i+x][y] = palavra1[i]; // Inserindo na vertical da matriz
						System.out.println(palavra1[i]);
						if (palavra2 != null && palavra1[i] == palavra2[0]) {	// se o caracter de combinação foi alcançado, 
							//começa a inserir a palavra na horizontal
							for (j = 1 ; j < palavra2.length ; j++) {
								matrizPalavra[i+x][j+y] = palavra2[j]; // Inserindo na horizontal da matriz
								System.out.println(palavra2[j]);
							}

							palavra2 = null; // Elimina a possibilidade de inserir a palavra2 novamente
						}

					}
					x += 3;
					y += 2;
					//Se a palavra2 possui o primeiro caracter da palavra1
				} else if (combinaPalavra(palavra2, palavra1[0])) {
					int i = 0;
					int j = 0;
					for (i = 0 ; i < palavra2.length ; i++) {
						matrizPalavra[i+x][y] = palavra2[i]; // Inserindo na vertical da matriz
						System.out.println(palavra2[i]);

						if (palavra1 != null && palavra2[i] == palavra1[0]) {
							for (j = 1 ; j < palavra1.length ; j++) {
								matrizPalavra[i+x][j+y] = palavra1[j];
								System.out.println(palavra1[j]);
							}

							palavra1 = null;
						}
					}
					x += i;
					y += 2;
				}
			}
		}
		
		exibirMatriz();
	}

	private static void preencherMatriz() {
		for (int coluna = 0 ; coluna < matrizPalavra.length ; coluna++) {
			for (int linha =  0 ; linha < matrizPalavra[coluna].length ; linha++) {
				matrizPalavra[coluna][linha] = letras[new Random().nextInt(letras.length)];
			}
		}
	}

	private static void exibirMatriz() {
		for (int column = 0; column < matrizPalavra.length; column++) {
			System.out.print("|");
			for (int row = 0; row < matrizPalavra[column].length; row++) {
				System.out.print(matrizPalavra[column][row] + "|");
			}
			System.out.println();
		}
	}

	// Retorna verdadeiro se a palavra1 possui o caractere que a palavra2 começa.
	// Ex.: Casaco e Casa, casaco possui a letra c duas vezes, que é a letra que a palavra2 começa. 
	private static boolean combinaPalavra(char[] palavra, char primeiraLetra) {
		for (int i = 0 ; i < palavra.length ; i++) {
			if (palavra[i] == primeiraLetra) {
				return true;
			}
		}
		return false;
	}

	private static void preencherArrayDados(Scanner arquivo, ArrayDeque<char []> arrayDados) {
		while (arquivo.hasNextLine()) {
			String entradaDados = arquivo.nextLine().trim();

			arrayDados.addLast(entradaDados.toCharArray());
		}
	}

}
