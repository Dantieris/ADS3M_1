package com.senac.model;

import com.senac.estruturas.ListaOrdenada;
import com.senac.estruturas.Nodo;
import com.senac.exceptions.ItemNaoEncontradoException;
import com.senac.exceptions.ListaVaziaException;


public class ListaIndices<T extends Comparable<T>> {
	
	private int contIndice;
	private ListaOrdenada<T> lista;
	private NodoIndice<T> head;
	private NodoIndice<T> tail;

	public ListaIndices() {
		contIndice = 0;
		
		tail	= new NodoIndice<T>();
		head  	= new NodoIndice<T>();
		lista 	= new ListaOrdenada<T>();
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
		lista.inserir(valor);
		contIndice++;
		
		if (head == null) {
			head.setAlvo(lista.getHead());
			tail.setAlvo(lista.getTail());
		}

		if (contIndice >= 10) {
			inserirIndice(valor);
		}
		
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
			System.out.println(iterIndices);
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
	
	public void inserirIndice( T valor) {
		
	}
	
	
	
}
