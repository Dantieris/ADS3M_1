package com.senac.apps.resultado;

import com.senac.util.resultado.No;
import com.senac.util.resultado.Arvore;

public class Principal {
	public static void main(String[] args) {
		Arvore arvore = new Arvore(3);
		
		No raiz1 = arvore.criaNo();
		raiz1.setValor(1);
		arvore.insert(raiz1);
		
		No filho2 = arvore.criaNo();
		filho2.setValor(2);
		raiz1.inserir(filho2);
		
		No folha5 = arvore.criaNo();
		folha5.setValor(5);
		filho2.inserir(folha5);
		
		arvore.buscaLargura(2);
	}
}
