package com.senac.lista;

public class NodoOrdenado {
	private String data;
	private NodoOrdenado next;
	private NodoOrdenado previous;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public NodoOrdenado getNext() {
		return next;
	}
	public void setNext(NodoOrdenado next) {
		this.next = next;
	}
	public NodoOrdenado getPrevious() {
		return previous;
	}
	public void setPrevious(NodoOrdenado previous) {
		this.previous = previous;
	}
	
}
