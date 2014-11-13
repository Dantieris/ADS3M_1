package com.senac.util;

public class NoAVL {

	private int valor;
	private NoAVL direito;
	private NoAVL esquerdo;
	private NoAVL pai;

	public NoAVL() {

	}

	public NoAVL(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public NoAVL getDireito() {
		return direito;
	}

	public void setDireito(NoAVL direito) {
		this.direito = direito;
	}

	public NoAVL getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(NoAVL esquerdo) {
		this.esquerdo = esquerdo;
	}

	public NoAVL getPai() {
		return pai;
	}

	public void setPai(NoAVL pai) {
		this.pai = pai;
	}

	public int calcularAltura() {
		int altura = 0;

		altura = 1 + Math.max(getDireito().calcularAltura(), getEsquerdo()
				.calcularAltura());

		return altura;
	}

	public int calcularFatorBalanceamento() {
		int fatorBalanceamento = 0;

		fatorBalanceamento = this.getEsquerdo().calcularAltura()
				- this.getDireito().calcularAltura();

		return fatorBalanceamento;
	}

	public void inserir(NoAVL filho) {
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
		
		int fatorBalanceamento = this.calcularFatorBalanceamento();

		if (Math.abs(fatorBalanceamento) == 2) {
			this.corrigirNodo();
		}
		
		this.getPai().corrigirNodo();
	}

	private void corrigirNodo() {
		int fatorBalanceamento = this.calcularFatorBalanceamento();
		
		if (Math.abs(fatorBalanceamento) == -2) {
			if (this.getDireito().calcularFatorBalanceamento() == 1) {
				
			}
		}
	}

}
