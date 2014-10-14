package com.senac.apps;

import com.senac.util.Arvore;
import com.senac.util.No;


public class App {
	
	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		
		No raiz2 = new No(2);
		arvore.inserir(raiz2);
		
		No filho1 = new No(1);
		arvore.inserir(filho1);
		
		No filho4 = new No(4);
		arvore.inserir(filho4);
		
		No filho3 = new No(3);
		arvore.inserir(filho3);
		
		No filho5 = new No(5);
		arvore.inserir(filho5);
		
		arvore.preOrdem();
		
		arvore.emOrdem();
		
		arvore.printNo();
	}
}
