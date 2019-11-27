package joaomcode.aula024;

enum Categoria {
	COMUM(1) {
		public double desconto() {
			return 0;
		}
	},
	ASSESSORIA(2) {
		public double desconto() {
			return 10;
		}
	},
	CONVENIADO(3) {

		public double desconto() {
			return 10;
		}
	},
	PLATINUM(4) {

		public double desconto() {
			return 25;
		}
	};

	private int valor;

	Categoria(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public abstract double desconto();
}

public class Corredor {
	private String nome;
	private Categoria categoria;

	/**
	 * @param nome
	 * @param categoria
	 */
	public Corredor(String nome, Categoria categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}
}
