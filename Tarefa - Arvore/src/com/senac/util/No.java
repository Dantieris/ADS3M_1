package com.senac.util;


public class No {
	private int valor;
	private No esquerda;
	private No direita;
	
	public No() {}

	public No(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}

	public void inserir(No filho) {
		if (filho.getValor() < this.valor) {
			if (this.esquerda == null) {
				this.esquerda = filho;
			} else {
				this.esquerda.inserir(filho);
			}
			
		} else if (filho.getValor() > this.valor) {
				if (this.direita == null) {
					this.direita = filho;
				} else {
					this.direita.inserir(filho);
				}
			}
	}
	
	public void printNo() {
		System.out.print("("+this.getValor());
		
		if (esquerda != null) {
			esquerda.printNo();
		}
		
		if (direita != null) {
			direita.printNo();
		}
		
		System.out.print(")");
	}
	
	public void emOrdem() {
		if (this.getDireita() != null) {
			this.getDireita().preOrdem();
		}
		
		System.out.print(this.getValor()+",");
		
		if (this.getEsquerda() != null) {
			this.getEsquerda().preOrdem();
		}
	}
	
	public void preOrdem() {
		System.out.print(this.getValor()+",");
		
		if (this.getEsquerda() != null) {
			this.getEsquerda().preOrdem();
		}
		
		if (this.getDireita() != null) {
			this.getDireita().preOrdem();
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
