
public class Aresta {

	private char nome;
	private int custo;

	public Aresta(char nome, int custo) {
		this.nome = nome;
		this.custo = custo;
	}

	public char getNome() {
		return nome;
	}

	public void setNome(char nome) {
		this.nome = nome;
	}

	public int getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;
	}
}
