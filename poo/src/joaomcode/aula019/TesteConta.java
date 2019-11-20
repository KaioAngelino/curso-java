package joaomcode.aula019;

import java.util.ArrayList;

public class TesteConta {

	public static void imprime(Conta conta) {
		for (Produto prod : conta.getProduto()) {
			System.out.println(prod);
		}
		System.out.println();
	}

	public static void main(String[] args) {

//		Instanciando objetos utilizando "private String[] produtos"
		Funcionario f1 = new Funcionario("João", "01");
//		String[] p1 = { "Nescau", "Coca-cola", "Suco de Laranja" };
//		String[] p2 = { "Pão", "Queijo", "Presunto" };
//		Conta c1 = new Conta(111112, f1, p1);
//		imprime(c1);
//		c1.setProduto(p2);
//		imprime(c1);

		ArrayList<Produto> produtos = new ArrayList<Produto>();

		Produto p3 = new Produto("Final Fantasy VII Remake", 1, 349.99);
		Produto p4 = new Produto("Breath of Fire IV", 2, 50);

		produtos.add(p3);
		produtos.add(p4);

		Conta c1 = new Conta(111112, f1, produtos);

	}

}
