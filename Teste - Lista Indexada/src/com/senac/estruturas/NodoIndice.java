package com.senac.estruturas;

public class NodoIndice<T> {
	
	private NodoIndice<T> next;
	private NodoIndice<T> prev;
	private Nodo<T> alvo;
	
	public NodoIndice<T> getNext() {
		return next;
	}
	public void setNext(NodoIndice<T> next) {
		this.next = next;
	}
	public NodoIndice<T> getPrev() {
		return prev;
	}
	public void setPrev(NodoIndice<T> prev) {
		this.prev = prev;
	}
	public Nodo<T> getAlvo() {
		return alvo;
	}
	public void setAlvo(Nodo<T> alvo) {
		this.alvo = alvo;
	}	
}
