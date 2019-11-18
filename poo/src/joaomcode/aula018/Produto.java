package joaomcode.aula018;

public class Produto {

	// Atributos
	private String nome;
	private int quantidade;
	private double valor;

	// Construtores
	public Produto() {

	}

	public Produto(String nome, int quantidade, double valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

}
