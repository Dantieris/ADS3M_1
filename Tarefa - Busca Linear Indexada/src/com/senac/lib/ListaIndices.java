package com.senac.lib;

import com.senac.lib.exceptions.ItemNaoEncontradoException;
import com.senac.lib.exceptions.ListaVaziaException;


public class ListaIndices<T extends Comparable<T>> {
	ListaOrdenada<T> lista;
	private NodoIndice<T> head;
	private NodoIndice<T> tail;

	public ListaIndices() {
		this.head.setAlvo(this.lista.getHead());
		this.tail.setAlvo(this.lista.getTail());
	}
	
	public NodoIndice<T> getHead() {
		return head;
	}

	public void setHead(NodoIndice<T> head) {
		this.head = head;
	}

	public NodoIndice<T> getTail() {
		return tail;
	}

	public void setTail(NodoIndice<T> tail) {
		this.tail = tail;
	}
	
	public void inserir(T valor) {
		this.lista.inserir(valor);
	}
	
	public void remover(T valor) throws ListaVaziaException, ItemNaoEncontradoException {
		this.lista.remover(valor);
	}
	
	public Nodo<T> procurar(T valor) {
		NodoIndice<T> iterIndices = this.head;
		
		while (iterIndices != null) {
			int cmpIndices = valor.compareTo(iterIndices.getAlvo().getValor());
			
			if (cmpIndices == 0) {
				return iterIndices.getAlvo();
			}
			
			if (cmpIndices < 0) {
				break;
			}
			
			iterIndices = iterIndices.getProximo();
		}
		
		Nodo<T> iterNodos = iterIndices.getAlvo();
		
		int cmpNodos = 0;
		while (cmpNodos > 0) {
			cmpNodos = valor.compareTo(iterNodos.getValor());
			
			if (cmpNodos == 0) {
				return iterNodos;
			}
			iterNodos = iterNodos.getAnterior();
		}
		
		return null;
	}
	
	
	
}
