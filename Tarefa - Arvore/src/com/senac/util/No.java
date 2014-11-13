package com.senac.util;

public class No {
	private int valor;
	private No esquerdo;
	private No direito;
	private No pai;

	public No() {
	}

	public No(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(No esquerda) {
		this.esquerdo = esquerda;
	}

	public No getDireito() {
		return direito;
	}

	public void setDireito(No direita) {
		this.direito = direita;
	}
	
	public No getPai() {
		return this.pai;
	}
	
	public void setPai(No pai) {
		this.pai = pai;
	}

	public void inserir(No filho) {
		if (filho.getValor() < this.valor) {
			if (this.esquerdo == null) {
				this.esquerdo = filho;
			} else {
				this.esquerdo.inserir(filho);
			}

		} else if (filho.getValor() > this.valor) {
			if (this.direito == null) {
				this.direito = filho;
			} else {
				this.direito.inserir(filho);
			}
		}
	}

	public void printNo() {
		System.out.print("(" + this.getValor());

		if (esquerdo != null) {
			esquerdo.printNo();
		}

		if (direito != null) {
			direito.printNo();
		}

		System.out.print(")");
	}

	public void emOrdem() {
		if (this.getDireito() != null) {
			this.getDireito().preOrdem();
		}

		System.out.print(this.getValor() + ",");

		if (this.getEsquerdo() != null) {
			this.getEsquerdo().preOrdem();
		}
	}

	public void preOrdem() {
		System.out.print(this.getValor() + ",");

		if (this.getEsquerdo() != null) {
			this.getEsquerdo().preOrdem();
		}

		if (this.getDireito() != null) {
			this.getDireito().preOrdem();
		}
	}

	public void posOrdem() {
		if (this.getEsquerdo() != null) {
			this.getEsquerdo().posOrdem();
		}
		if (this.getDireito() != null) {
			this.getDireito().posOrdem();
		}
		System.out.println(this.getValor());
	}

	public void busca(int valor) {

	}

	// NÃO IMPLEMENTADO
	public void remover(int valor) {

	}

}
