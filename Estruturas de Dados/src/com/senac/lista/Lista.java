package com.senac.lista;

public class Lista {
	Nodo head;
	
	/**
	 * 	Insere um item no inicio da lista, o nodo a ser insereido � enviado por par�metro.
	 * 
	 * @param novo O novo nodo a ser inserido na lista.
	 */
	public void inserir(Nodo novo) {
		if (head == null) {
			/* Se a lista est� vazia,
			 * define o head como o novo nodo.
			 * Sen�o define o pr�ximo do novo como o proximo do head,
			 * e o proximo do head como o novo.*/
			head = novo;
		} 
		else {
			novo.proximo = head.proximo;
			head.proximo= novo;
		}
		
	}
	
	/**
	 * Remove um item da lista, de acordo com o seu valor.
	 * 
	 * @param valor O valor do item a ser removido.
	 */
	public void remover(Object valor) {
		if (head.valor == valor) { 
			/* Se o item a ser removido for o head,
			 * � s� definir o head como o seu pr�ximo
			 * o que ir� tira-lo da lista. */
			head = head.proximo;
		} 
		else {
			// Objeto Nodo de itera��o. Basicamente um contador.
			Nodo iter = head;
			
			// La�o que percorre a lista inteira.
			while(iter.proximo != null) {
				/* Se o valor do proximo item for igual ao valor a ser removido.
				 * Definir o pr�ximo item como o pr�ximo do pr�ximo. */
				if(iter.proximo.valor == valor) {
					iter.proximo = iter.proximo.proximo;
				}
				
				iter = iter.proximo; // Itera��o do iter.
			}
		}
	}
	
	/**
	 * Procura um nodo na lista e retorna, o valor a ser procurado � definido pelo par�metro.
	 * 
	 * @param valor O valor do nodo a ser procurado.
	 * @return O nodo com o valor de busca. Se retornar null o nodo n�o foi encontrado.
	 */
	public Nodo procurar(Object valor) {
		Nodo iter = head;
		
		while(iter.proximo != null) {
			if (iter.valor == valor) {
				return iter;
			}
			
			iter = iter.proximo;			
		}
		
		return null;
	}
}
