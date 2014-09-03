package com.senac.model;

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
		criarIndices();
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
	
	private void criarIndices() {
		this.head.setAlvo(lista.getHead());
		this.tail.setAlvo(lista.getTail());
		NodoIndice<T> iter1 = this.head;
		
		System.out.println(iter1.getAlvo().getValor());			
		
		if (contIndice >= 10) {
			NodoIndice<T> novo = new NodoIndice<T>();
			Nodo<T> iter = lista.getHead();
			for (int i = 0 ; i < 10 ; i++) {
				iter = iter.getProximo();
			}
			contIndice = 0;
			inserir(novo);
		}
	}
	
	public void inserir(NodoIndice<T> novo) {
		NodoIndice<T> nodo = procuraProximo(novo.getAlvo().getValor());
		
		if ( nodo != null ) {
			novo.setAnterior(nodo.getAnterior());
			novo.setProximo(nodo);
			
			if ( nodo.getAnterior() != null ) {
				nodo.getAnterior().setProximo(novo);
			}
			else {
				this.head = novo;
			}
			
			novo.getProximo().setAnterior(novo);
		}
		else {
			novo.setProximo(null);
			novo.setAnterior(this.tail);

			tail.setProximo(novo);
			tail = novo;
		}
		
	}
	
	private NodoIndice<T> procuraProximo(T valor) {
		NodoIndice<T> iter = this.head;
		while (iter != null) {
			int cmp = valor.compareTo(iter.getAlvo().getValor());
			
			if (cmp < 0)
				return iter;
			
			iter = iter.getProximo();
			}
			return null;
	}
	
	
	
}
