package com.senac.algoritmos.recursivos;

public class FatorialRecursivo {
	
	public static int fatorial(int n) {
		if(n <= 0) {
			return 1;
		}
		else {
			return (n * fatorial(n - 1));
		}
	}
}
