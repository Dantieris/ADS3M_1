package com.senac.lista;

public class ListaOrdenada {
	private NodoOrdenado head;
	
	public void insere(NodoOrdenado nodo) {
		if (isEmpty()) {
			head = nodo;
		} else {
			NodoOrdenado next = findNext();
		}
	}

	private NodoOrdenado findNext() {
		
		return null;
	}

	private boolean isEmpty() {
		return head == null;
	}
}
