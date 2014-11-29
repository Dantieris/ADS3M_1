package com.senac.util;

public class Node {

	private int value;
	private Node direito;
	private Node esquerdo;
	private Node parent;
	private int h;// height
	private int fb; // fator de balanceamento

	public Node(int valor) {
		this.parent = null;
		this.value = valor;
		this.h = 1;
		this.fb = 0;
	}

	public Node(int valor, Node parent) {
		this.parent = parent;
		this.value = valor;
		this.h = 1;
		this.fb = 0;
	}

	public Node insert(Node n) {
		
		// Se o valor for menor que o do nodo atual inserir na esquerda
		if (n.getValue() < this.value) {
			if (esquerdo == null) {
				esquerdo = n;
				n.setParent(this);
			} else {
				esquerdo.insert(n);
			}
		} 
		
		else {	// Se o valor for que o do nodo atual inserir na direita
				if (n.getValue() > this.value) {
					if (direito == null) {
						direito = n;
						n.setParent(this);
					} else {
						direito.insert(n);
					}
				}
		}
		
		return this.corrigir();
	}

	/**
	 * Representação gráfica da arvore no seguinte formato:
	 * (root(child(child)(child))(child(child)(child)))
	 */
	public void print() {
		System.out.print("(" + this.getValue() + " H->" + this.h + " FB->"
				+ this.fb);// se imprime
		if (esquerdo != null)
			esquerdo.print();
		if (direito != null)
			direito.print();
		System.out.print(")");
	}

	public Node leftRotation() {
		/*
		 * b becomes the new root. a takes ownership of b's left child as its
		 * right child, or in this case, null. b takes ownership of a as its
		 * left child
		 */
		Node novaRaiz = direito;
		Node novoEsquerdo = this;
		novoEsquerdo.setDireito(novaRaiz.getEsquerdo());
		novaRaiz.setEsquerdo(novoEsquerdo);

		// ajustando parentesco
		novaRaiz.setParent(novoEsquerdo.getParent());
		novoEsquerdo.setParent(novaRaiz);
		
		return novaRaiz;
	}

	/*
	 * public Node leftRotation() { Node fd = getRightChild(); Node b =
	 * getRightChild().getLeftChild(); fd.setLeftChild(this); setParent(fd);
	 * fd.setParent(this.getParent()); setLeftChild(b); return fd; }
	 */

	public Node rightRotation() {
		/*
		 * b becomes the new root. a takes ownership of b's right child, as its
		 * left child. In this case, that value is null. b takes ownership of a,
		 * as it's right child
		 */
		Node novaRaiz = this.getEsquerdo();
		Node novoDireito = this;
		novoDireito.setEsquerdo(novaRaiz.getDireito());
		novaRaiz.setDireito(novoDireito);

		// ajustando parentesco
		novaRaiz.setParent(novoDireito.getParent());
		novoDireito.setParent(novaRaiz);
		
		return novaRaiz;
	}

	/**
	 * public Node rightRotation() { Node fe = getLeftChild();// filho esquerda
	 * Node b = getLeftChild().getRightChild();// neto direita
	 * fe.setRightChild(this); setParent(fe); fe.setParent(this.getParent());
	 * setRightChild(b); return fe; }
	 **/

	public void calculateH() {
		if (esquerdo != null & direito != null) {
			esquerdo.calculateH();
			direito.calculateH();
			
			h = 1 + Math.max(esquerdo.h, direito.h);
		} else {
			h = 1;
		}
		if (esquerdo != null) {
			esquerdo.calculateH();
			
			h = 1 + esquerdo.h;
		}
			
		if ( direito != null) {
			direito.calculateH();
			
			h = 1 + direito.h;
		}
	}

	public void calculateFb() {
		if (esquerdo != null && direito != null) {
			fb = esquerdo.h - direito.h;
		} else {
			if (esquerdo != null) {
				fb = esquerdo.h - 0;
			}
			
			if (direito != null) {
				fb = 0 - direito.h;
			}
		}
	}

	public Node corrigir() {
		Node r = this;
		
		if (direito != null) {
			this.direito.calculateH();
		}
		
		if (esquerdo != null) {
			this.esquerdo.calculateH();
		}
		
		this.calculateFb();
		
		if (fb == -2) {
			if (direito.fb == +1) {
				setDireito(direito.rightRotation());
			}
			r = leftRotation();
		}
		if (fb == +2) {
			if (esquerdo.fb == -1) {
				setEsquerdo(esquerdo.leftRotation());
			}
			r = rightRotation();
		}
		// r.posOrdem({calculateH(), calculateFb()});
		
		r.posOrderAdjustment();
		return r;
	}

	public void posOrderAdjustment() {
		
		if (esquerdo != null)
			esquerdo.posOrderAdjustment();
		
		if (direito != null)
			direito.posOrderAdjustment();
		
		calculateH();
		calculateFb();
	}

	public Node getEsquerdo() {
		return this.esquerdo;
	}

	public Node getDireito() {
		return this.direito;
	}

	public void setEsquerdo(Node esquerdo) {
		this.esquerdo = esquerdo;
	}

	public void setDireito(Node direito) {
		this.direito = direito;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getFb() {
		return fb;
	}

	public void setFb(int fb) {
		this.fb = fb;
	}

}