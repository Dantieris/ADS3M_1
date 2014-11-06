import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner arquivo = null;

		try {
			arquivo = new Scanner(new BufferedReader(
					new FileReader("dados.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Arquivo carregado");
		
		String dados [] = new String[7];
		
		int i = 0;
		while (arquivo.hasNext()) {
			dados[i++] = arquivo.nextLine();
		}
		
		System.out.println("Dados do arquivo tranportado para o array.");
		
		for (i = 0 ; i < dados.length ; i++) {
			System.out.println(dados[i]);
		}
		
		int grafo [][] = new int [5][5];
		
		for (i = 0 ; i < dados.length ; i++) {
			char [] linhaDados = dados[i].replace(";", "").toCharArray();
			
			int linha = linhaDados[0] - 96;
			int coluna = linhaDados[1] - 96;
			
			System.out.println(linha+";"+coluna);
		}
		
	}
}
