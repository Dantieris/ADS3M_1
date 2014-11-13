package com.senac.util;

import java.util.ArrayDeque;
import java.util.Stack;

import com.senac.util.No;

public class Arvore {
	private No raiz;
	private int ordem;

	public Arvore() {
	}

	public Arvore(int ordem) {
		this.ordem = ordem;
	}

	public Arvore(No raiz) {
		this.raiz = raiz;
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
		if (raiz != null) {
			this.raiz.posOrdem();
		}
	}

	public void buscaProfundidade() {
		System.out.println("Busca em profundidade:");

		Stack<No> pilha = new Stack<No>();
		pilha.push(this.raiz);

		while (!pilha.empty()) {
			No ultimoElemento = pilha.pop();
			
			if (ultimoElemento.getEsquerdo() != null)
				pilha.push(ultimoElemento.getEsquerdo());
			
			if (ultimoElemento.getDireito() != null)
				pilha.push(ultimoElemento.getDireito());

			System.out.println(ultimoElemento.getValor());
		}
	}

	public void buscaLargura() {
		System.out.println("Busca em largura:");

		ArrayDeque<No> fila = new ArrayDeque<No>();
		fila.add(this.raiz);

		while (!fila.isEmpty()) {
			No ultimoElemento = fila.poll();
			
			if (ultimoElemento.getEsquerdo() != null)
				fila.addLast(ultimoElemento.getEsquerdo());

			if (ultimoElemento.getDireito() != null)
				fila.addLast(ultimoElemento.getDireito());

			System.out.println(ultimoElemento.getValor());
		}
	}
	
	public void buscaLargura(No n) {
		System.out.println("Busca em largura a partir do nó: " + n.getValor());

		ArrayDeque<No> fila = new ArrayDeque<No>();
		fila.add(n);

		while (!fila.isEmpty()) {
			No ultimoElemento = fila.poll();
			
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

	public No rotEsquerda(No n) {
		Arvore backUp = new Arvore(n.getDireito().getEsquerdo());

		No netoDireito = n;

		No filhoDireita = n.getDireito();

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

	public No rotDireita(No n) {
		Arvore backUp = new Arvore(n.getEsquerdo().getDireito());

		No netoEsquerdo = n;

		No filhoEsquerdo = n.getEsquerdo();

		n.getEsquerdo().setDireito(netoEsquerdo); // FD.dir = n
		netoEsquerdo.setEsquerdo(backUp.getRaiz()); // n.esq = b;

		if (n.equals(this.raiz)) {
			this.raiz = filhoEsquerdo;
		}
		return filhoEsquerdo;
	}

}
