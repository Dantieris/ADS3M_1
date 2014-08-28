package com.senac.algoritmos.iterativos;

public class FatorialIterativo {
	
	public static int fatorial(int n) {
		int fatorial = 1;
		int cont = 1;
		
		while (cont <= n) {
			fatorial *= cont;
			cont++;
		}
		return fatorial;
	}
}
