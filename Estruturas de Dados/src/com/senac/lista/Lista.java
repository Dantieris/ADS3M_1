package com.senac.lista;

public class Lista {
	Nodo head;
	
	/**
	 * 	Insere um item no inicio da lista, o nodo a ser insereido é enviado por parâmetro.
	 * 
	 * @param novo O novo nodo a ser inserido na lista.
	 */
	public void inserir(Nodo novo) {
		if (head == null) {
			/* Se a lista está vazia,
			 * define o head como o novo nodo.
			 * Senão define o próximo do novo como o proximo do head,
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
			 * é só definir o head como o seu próximo
			 * o que irá tira-lo da lista. */
			head = head.proximo;
		} 
		else {
			// Objeto Nodo de iteração. Basicamente um contador.
			Nodo iter = head;
			
			// Laço que percorre a lista inteira.
			while(iter.proximo != null) {
				/* Se o valor do proximo item for igual ao valor a ser removido.
				 * Definir o próximo item como o próximo do próximo. */
				if(iter.proximo.valor == valor) {
					iter.proximo = iter.proximo.proximo;
				}
				
				iter = iter.proximo; // Iteração do iter.
			}
		}
	}
	
	/**
	 * Procura um nodo na lista e retorna, o valor a ser procurado é definido pelo parâmetro.
	 * 
	 * @param valor O valor do nodo a ser procurado.
	 * @return O nodo com o valor de busca. Se retornar null o nodo não foi encontrado.
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
