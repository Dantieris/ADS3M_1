package com.senac.algoritmos.iterativos;

public class FibonacciIterativo {
	
	public static double fibonacci(int n) {
		double f1 	= 0;
		double f2 	= 1;
		double fibo = 0;
		
		for(int i = 1 ; i <= n ; ++i) {
			fibo = f1 + f2;
			
			f2 = f1;
			
			f1 = fibo;
		}
		
		return fibo;
	}
}
