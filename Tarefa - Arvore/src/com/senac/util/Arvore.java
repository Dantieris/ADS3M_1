package com.senac.util;

import com.senac.util.No;

public class Arvore {
	private No raiz;
	private int ordem;
	
	public Arvore() {}
	
	public Arvore(int ordem) {
		this.ordem = ordem;
	}

	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}
	
	public void inserir(No raiz) {
		if (this.raiz == null) {
			setRaiz(raiz);
		} else {
			this.raiz.inserir(raiz);
		}
	}
	
	public No criaNo() {
		return new No(this.ordem);
	}
	
	public void printNo() {
		if (raiz != null) {
			raiz.printNo();
		}
		
		System.out.println();
	}
	
	public void emOrdem() {
		if (raiz != null) {
			raiz.emOrdem();
		}
		
		System.out.println();
	}
	
	public void preOrdem() {
		if (raiz != null) {
			raiz.preOrdem();
			
			System.out.println();
		}
	}
	
	public void posOrdem() {
		
	}
	
	public void busca(int valor) {
		
	}
	
	// NÃO IMPLEMENTADO
	public void remover(int valor) {
		
	}
}
