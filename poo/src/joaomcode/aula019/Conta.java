package joaomcode.aula019;

import java.util.ArrayList;

public class Conta {

	// Atributo
	private int numero;
	private double valor;
	private Funcionario funcionario;
	// private String[] produtos;
	private ArrayList<Produto> produtos;

	// Construtores
	public Conta() {

	}

	public Conta(int numero, Funcionario funcionario, ArrayList<Produto> produtos) {
		this.numero = numero;
		this.funcionario = funcionario;
		this.produtos = produtos;
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

	public ArrayList<Produto> getProduto() {
		return this.produtos;
	}

	public void setProduto(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

//	public double getValor() {
//		this.valor = this.setValor();
//		return valor;
//	}
//	
//	public double setValor() {
//		this.valor = produto.getValor() * produto.getQuantidade();
//		return valor;
//	}
}
