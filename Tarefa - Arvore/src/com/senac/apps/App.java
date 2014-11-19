package com.senac.apps;

import com.senac.util.ArvoreAVL;
import com.senac.util.NoAVL;


public class App {
	
	public static void main(String[] args) {
		ArvoreAVL arvore = new ArvoreAVL();
		
		NoAVL raiz = new NoAVL(1);
		arvore.inserir(raiz);
		
		NoAVL filho1 = new NoAVL(2);
		arvore.inserir(filho1);
		
		System.out.println(filho1.getValor());
		
		NoAVL filho4 = new NoAVL(3);
		arvore.inserir(filho4);
		
		NoAVL filho3 = new NoAVL(4);
		arvore.inserir(filho3);
		
		NoAVL filho5 = new NoAVL(5);
		arvore.inserir(filho5);
		
		arvore.printNo();
	}
}
