package com.senac.util.resultado;

public class No {
	private int valor;
	private No[] filhos;
	private int numFilhos;
	
	public No(int ordem) {
		this.filhos = new No[ordem];
		this.numFilhos = 0;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public No getFilho(int indice) {
		if (indice < numFilhos) {
			return filhos[indice];
		}
		return null;
	}
	
	public No[] getFilhos() {
		return filhos;
	}
	
	public void inserir(No filho) {
		if (numFilhos < filhos.length) {
			filhos[numFilhos] = filho;
			numFilhos++;
		}
	}
	
	public void print() {
		System.out.print("(" + this.valor);
		for (int i = 0 ; i < numFilhos ; i++) {
			filhos[i].print();
		}
		System.out.print(")");
	}
}
