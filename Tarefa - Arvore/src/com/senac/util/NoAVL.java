package com.senac.util;

public class NoAVL {

	private int valor;
	private NoAVL direito;
	static int test = 1;
	private NoAVL esquerdo;
	private NoAVL pai;

	public NoAVL() {

	}

	public NoAVL(int valor) {
		this.valor = valor;
	}

	public NoAVL(NoAVL pai, int valor) {
		this.pai = pai;
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public NoAVL getDireito() {
		return direito;
	}

	public void setDireito(NoAVL direito) {
		this.direito = direito;
	}

	public NoAVL getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(NoAVL esquerdo) {
		this.esquerdo = esquerdo;
	}

	public NoAVL getPai() {
		return pai;
	}

	public void setPai(NoAVL pai) {
		this.pai = pai;
	}

	public int calcularAltura() {
		int altura = 0;

		if (getDireito() != null && getEsquerdo() != null) {
			altura = 1 + Math.max(getDireito().calcularAltura(), getEsquerdo()
					.calcularAltura());
		}
		
		System.out.println(altura);

		return altura;
	}

	public int calcularFatorBalanceamento() {
		int fatorBalanceamento = 0;

		int esquerdoAltura = 0;
		int direitoAltura = 0;

		if (this.getDireito() != null) {
			direitoAltura = this.getDireito().calcularAltura();
		}

		if (this.getEsquerdo() != null) {
			esquerdoAltura = this.getEsquerdo().calcularAltura();
		}
		fatorBalanceamento = esquerdoAltura - direitoAltura;

		return fatorBalanceamento;
	}

	public void inserir(NoAVL filho) {
		filho.getValor();
		
		if (filho.getValor() < this.valor) {
			if (this.esquerdo == null) {
				filho.setPai(this);
				this.esquerdo = filho;
			} else {
				filho.setPai(this);
				this.esquerdo.inserir(filho);
			}

		} else if (filho.getValor() > this.valor) {
			if (this.direito == null) {
				filho.setPai(this);
				this.direito = filho;
			} else {
				filho.setPai(this);
				this.direito.inserir(filho);
			}
		}

		int fatorBalanceamento = calcularFatorBalanceamento();

		if (Math.abs(fatorBalanceamento) == 2) {
			this.corrigirNodo();
		}

		if (this.getPai() != null)
			this.getPai().corrigirNodo();
	}

	private NoAVL corrigirNodo() {
		int fatorBalanceamento = this.calcularFatorBalanceamento();

		NoAVL retorno = null;

		if (Math.abs(fatorBalanceamento) == -2) {
			if (getDireito().calcularFatorBalanceamento() == 1) {
				setDireito(this.rotDireita(getDireito()));
			}

			retorno = this.rotEsquerda(this);
		}

		if (Math.abs(fatorBalanceamento) == 2) {
			if (getEsquerdo().calcularFatorBalanceamento() == 1) {
				setEsquerdo(this.rotEsquerda(getEsquerdo()));
			}

			retorno = this.rotDireita(this);
		}

		if (retorno != null) {
			retorno.posOrdem();
		}

		return retorno;
	}

	public void printNo() {
		System.out.print("(" + this.getValor());

		if (esquerdo != null) {
			esquerdo.printNo();
		}

		if (direito != null) {
			direito.printNo();
		}

		System.out.print(")");
	}

	public void emOrdem() {
		if (this.getDireito() != null) {
			this.getDireito().preOrdem();
		}

		System.out.print(this.getValor() + ",");

		if (this.getEsquerdo() != null) {
			this.getEsquerdo().preOrdem();
		}
	}

	public void preOrdem() {
		System.out.print(this.getValor() + ",");

		if (this.getEsquerdo() != null) {
			this.getEsquerdo().preOrdem();
		}

		if (this.getDireito() != null) {
			this.getDireito().preOrdem();
		}
	}

	public void posOrdem() {
		if (this.getEsquerdo() != null) {
			this.getEsquerdo().posOrdem();
		}
		if (this.getDireito() != null) {
			this.getDireito().posOrdem();
		}

		int fatorBalanceamento = this.calcularFatorBalanceamento();
		int altura = this.calcularAltura();

		if (Math.abs(fatorBalanceamento) == 2) {
			this.corrigirNodo();
		}
	}

	// NÃO IMPLEMENTADO
	public void remover(int valor) {

	}

	public NoAVL rotDireita(NoAVL n) {
		ArvoreAVL backUp = new ArvoreAVL(n.getEsquerdo().getDireito());

		NoAVL netoEsquerdo = n;

		NoAVL filhoEsquerdo = n.getEsquerdo();

		n.getEsquerdo().setDireito(netoEsquerdo); // FD.dir = n
		netoEsquerdo.setEsquerdo(backUp.getRaiz()); // n.esq = b;

		if (n.equals(getPai())) {
			setPai(filhoEsquerdo);
		}
		return filhoEsquerdo;
	}

	public NoAVL rotEsquerda(NoAVL n) {
		ArvoreAVL backUp = new ArvoreAVL(n.getDireito().getEsquerdo());

		NoAVL netoDireito = n;

		NoAVL filhoDireita = n.getDireito();

		// Add a parte de pais para poder utilizar metodo no meio de arvores
		filhoDireita.setPai(n.getPai());

		n.setPai(filhoDireita);

		n.getDireito().setEsquerdo(netoDireito); // FD.esq = n
		netoDireito.setDireito(backUp.getRaiz()); // n.dir = b;

		if (n.equals(getPai())) {
			setPai(filhoDireita);
		}
		return filhoDireita;
	}
}
