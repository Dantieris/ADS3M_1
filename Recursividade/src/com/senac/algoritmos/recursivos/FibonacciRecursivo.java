package com.senac.algoritmos.recursivos;

public class FibonacciRecursivo {
	
	public static double fibonacci(int n) {
		if(n == 0) {
			return 0;
		} 
		else if(n ==1) {
			return 1;
		}
		else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
