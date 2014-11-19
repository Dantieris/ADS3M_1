package com.senac.util;

import java.util.ArrayDeque;
import java.util.Stack;

public class ArvoreAVL {
	
	private NoAVL raiz;
	
	public ArvoreAVL() {
	}
	
	public ArvoreAVL(NoAVL raiz) {
		this.raiz = raiz;
	}
	
	public void setRaiz(NoAVL raiz) {
		this.raiz = raiz;
	}
	
	public NoAVL getRaiz() {
		return this.raiz;
	}
	
	public void inserir(NoAVL no) {
		if (this.raiz == null) {
			setRaiz(no);
		} else {
			getRaiz().inserir(no);
		}
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
		if (raiz != null) {
			this.raiz.posOrdem();
		}
	}

	public void buscaProfundidade() {
		System.out.println("Busca em profundidade:");

		Stack<NoAVL> pilha = new Stack<NoAVL>();
		pilha.push(this.raiz);

		while (!pilha.empty()) {
			NoAVL ultimoElemento = pilha.pop();
			
			if (ultimoElemento.getEsquerdo() != null)
				pilha.push(ultimoElemento.getEsquerdo());
			
			if (ultimoElemento.getDireito() != null)
				pilha.push(ultimoElemento.getDireito());

			System.out.println(ultimoElemento.getValor());
		}
	}

	public void buscaLargura() {
		System.out.println("Busca em largura:");

		ArrayDeque<NoAVL> fila = new ArrayDeque<NoAVL>();
		fila.add(this.raiz);

		while (!fila.isEmpty()) {
			NoAVL ultimoElemento = fila.poll();
			
			if (ultimoElemento.getEsquerdo() != null)
				fila.addLast(ultimoElemento.getEsquerdo());

			if (ultimoElemento.getDireito() != null)
				fila.addLast(ultimoElemento.getDireito());

			System.out.println(ultimoElemento.getValor());
		}
	}
	
	public void buscaLargura(NoAVL n) {
		System.out.println("Busca em largura a partir do nó: " + n.getValor());

		ArrayDeque<NoAVL> fila = new ArrayDeque<NoAVL>();
		fila.add(n);

		while (!fila.isEmpty()) {
			NoAVL ultimoElemento = fila.poll();
			
			if (ultimoElemento.getEsquerdo() != null)
				fila.addLast(ultimoElemento.getEsquerdo());

			if (ultimoElemento.getDireito() != null)
				fila.addLast(ultimoElemento.getDireito());

			System.out.println(ultimoElemento.getValor());
		}
	}

	// NÃO IMPLEMENTADO
	public void remover(int valor) {

	}

	public NoAVL rotEsquerda(NoAVL n) {
		ArvoreAVL backUp = new ArvoreAVL(n.getDireito().getEsquerdo());

		NoAVL netoDireito = n;

		NoAVL filhoDireita = n.getDireito();

		// Add a parte de pais para poder utilizar metodo no meio de arvores
		filhoDireita.setPai(n.getPai());

		n.setPai(filhoDireita);

		n.getDireito().setEsquerdo(netoDireito); // FD.esq = n
		netoDireito.setDireito(backUp.getRaiz()); // n.dir = b;

		if (n.equals(this.raiz)) {
			this.raiz = filhoDireita;
		}
		return filhoDireita;
	}

	public NoAVL rotDireita(NoAVL n) {
		ArvoreAVL backUp = new ArvoreAVL(n.getEsquerdo().getDireito());

		NoAVL netoEsquerdo = n;

		NoAVL filhoEsquerdo = n.getEsquerdo();

		n.getEsquerdo().setDireito(netoEsquerdo); // FD.dir = n
		netoEsquerdo.setEsquerdo(backUp.getRaiz()); // n.esq = b;

		if (n.equals(this.raiz)) {
			this.raiz = filhoEsquerdo;
		}
		return filhoEsquerdo;
	}
}
