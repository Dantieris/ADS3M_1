package com.senac.algoritmos.app;

import com.senac.algoritmos.iterativos.FatorialIterativo;
import com.senac.algoritmos.iterativos.FibonacciIterativo;
import com.senac.algoritmos.recursivos.FatorialRecursivo;
import com.senac.algoritmos.recursivos.FibonacciRecursivo;


public class Main {
	public static void main(String[] args) {
		long faii = System.currentTimeMillis();
		FatorialIterativo.fatorial(45);
		long faif = System.currentTimeMillis();
		
		System.out.println(faif - faii);
		
		long fari = System.currentTimeMillis();
		FatorialRecursivo.fatorial(45);
		long farf = System.currentTimeMillis();
		
		System.out.println(farf - fari);
		
		long fiii = System.currentTimeMillis();
		FibonacciIterativo.fibonacci(75);
		long fiif = System.currentTimeMillis();
		
		System.out.println(fiif - fiii);
		
		long firi = System.currentTimeMillis();
		FibonacciRecursivo.fibonacci(54); // 46 16120 - 47 26090 - 48 42115 - 49 68242 - 50 110568 - 51 178417 - 53 467474


		long firf = System.currentTimeMillis();
		
		System.out.println(firf - firi);
	}
}
