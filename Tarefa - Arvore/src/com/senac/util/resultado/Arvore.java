package com.senac.util.resultado;

import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class Arvore {
	private No raiz;
	private int ordem;
	
	public Arvore(int ordem) {
		this.ordem = ordem;
	}
	
	public void insert(No no) {
		raiz = no;
	}
	
	public No criaNo() {
		return new No(this.ordem);
	}
	
	public void print() {
		if (raiz != null) {
			raiz.print();
		}
		System.out.println();
	}
	
	public void buscaLargura(int valor) {
		Stack<No> pilha = new Stack<>();
		
		pilha.push(raiz);
		
		while(!pilha.isEmpty()) {
			No no = pilha.pop();
			
			for (No n : no.getFilhos()) {
				pilha.push(n);
			}
			
			System.out.print(no.getValor());
		}
	}
	
//	public void buscaProfundidade(int valor) {
//		Queue<No> fila = new Que
//		
//		fila.push(raiz);
//		
//		while(!pilha.isEmpty()) {
//			No no = pilha.pop();
//			
//			for (No n : no.getFilhos()) {
//				pilha.push(n);
//			}
//			
//			System.out.print(no.getValor());
//		}
//	}
}
