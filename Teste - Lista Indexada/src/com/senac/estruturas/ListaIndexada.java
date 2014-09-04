package com.senac.estruturas;

import com.senac.exceptions.ItemNaoEncontradoException;
import com.senac.exceptions.ListaVaziaException;

public class ListaIndexada<T extends Comparable<T>> {

	private NodoIndice<T> head;
	private NodoIndice<T> tail;
	private ListaOrdenada<T> lista;
	
	public ListaIndexada() {
		lista = new ListaOrdenada<T>();
	}
	
	public void inserir(T valor) {
		lista.inserir(valor);
	}
	
	public Nodo<T> procurar(T valor) throws ListaVaziaException, ItemNaoEncontradoException {
		return lista.procura(valor);
	}
	
	public void remover(T valor) throws ListaVaziaException, ItemNaoEncontradoException {
		lista.remover(valor);
	}
	
	
	
}
