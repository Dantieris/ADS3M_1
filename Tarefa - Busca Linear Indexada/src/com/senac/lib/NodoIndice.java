package com.senac.lib;

public class NodoIndice<T> {

	private NodoIndice<T> proximo;
	private NodoIndice<T> anterior;
	private Nodo<T> alvo;
	
	public NodoIndice() {}
	
	public NodoIndice(Nodo<T> alvo) {
		this.alvo = alvo;
	}

	public NodoIndice<T> getProximo() {
		return proximo;
	}

	public void setProximo(NodoIndice<T> proximo) {
		this.proximo = proximo;
	}

	public NodoIndice<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoIndice<T> anterior) {
		this.anterior = anterior;
	}

	public Nodo<T> getAlvo() {
		return alvo;
	}

	public void setAlvo(Nodo<T> alvo) {
		this.alvo = alvo;
	}
	
	
}
