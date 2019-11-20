package joaomcode.aula019_2;

public class Produto {

	private String nome;
	private int quantidade;
	private double valor;

	public Produto(String nome, int quantidade, double valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

}
