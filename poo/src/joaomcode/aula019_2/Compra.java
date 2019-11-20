package joaomcode.aula019_2;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private int numero;
	private double valor;
	private Funcionario funcionario;
	private List<Produto> produtos;
	private List<Produto> prod = new ArrayList<>();

	public Compra(int numero, Funcionario funcionario) {
		this.numero = numero;
		this.funcionario = funcionario;

	}

	public Compra(int numero, Funcionario funcionario, List<Produto> produtos) {
		this.numero = numero;
		this.funcionario = funcionario;
		this.produtos = produtos;

	}

	public int getNumero() {
		return numero;
	}

	/*
	 * public double getValor() { this.valor = this.setValor(); return valor; }
	 * 
	 * public double setValor() { double resultado =
	 * produto.getQuantidade()*produto.getValor(); return resultado; }
	 */
	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Produto> getProduto() {
		return produtos;
	}

	public void setProduto(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void addicionar(int quantidade, Produto produto) {
		prod.add(produto);
	}

	public void geraComprovante() {
		System.out.println("===========Super Java Store===========");
		if (funcionario != null) {
			if (funcionario.getNome() != null) {
				System.out.print("atendente: " + funcionario.getNome());
			}

			if (funcionario.getCadastro() != null) {
				System.out.println(" cadastro nº: " + funcionario.getCadastro());
				System.out.println();

			}
		}
		/*
		 * for(Produto prod: produtos) { System.out.print(prod.getNome()+" ");
		 * System.out.println(prod.getValor());
		 * 
		 * }
		 */

		for (Produto p : prod) {
			if (p.getNome().length() > 10) {
				System.out.print(p.getNome().substring(0, 10) + " ");
			} else if (p.getNome().length() > 7) {
				System.out.print(p.getNome() + " ");
			} else {
				System.out.print(p.getNome() + " \t");
			}

			System.out.print(p.getValor() + " ");
			System.out.print(" x " + p.getQuantidade() + " = ");
			System.out.println(p.getValor() * p.getQuantidade());
			valor += (p.getValor() * p.getQuantidade());
		}

		System.out.println("Total                  " + valor);
	}

}