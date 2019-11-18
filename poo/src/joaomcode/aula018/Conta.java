package joaomcode.aula018;

public class Conta {

	// Atributo
	private int numero;
	private double valor;
	private Funcionario funcionario;
	private Produto produto;

	// Construtores
	public Conta() {

	}

	public Conta(int numero, Funcionario funcionario, Produto produto) {
		this.numero = numero;
		this.funcionario = funcionario;
		this.produto = produto;
	}

	// Getters and Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getValor() {
		this.valor = this.setValor();
		return valor;
	}
	
	public double setValor() {
		this.valor = produto.getValor() * produto.getQuantidade();
		return valor;
	}
}
