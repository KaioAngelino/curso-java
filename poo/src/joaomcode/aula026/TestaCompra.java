package joaomcode.aula026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestaCompra {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Osvald", 30, "Onde o vento faz a curva");
		Pessoa p2 = new Pessoa("Handerson", 20, "Liverpool");

		Produto prod1 = new Produto("Nescau", 2.3);
		Produto prod2 = new Produto("Laranja", 1.2);
		Produto prod3 = new Produto("Rufles", 3.7);
		Produto prod4 = new Produto("Pão", 1.1);
		Produto prod5 = new Produto("Presunto", 5);
		Produto prod6 = new Produto("Queijo", 4.5);

		Map<Pessoa, Produto> mapa1 = new HashMap<Pessoa, Produto>();
		mapa1.put(p1, prod1);
		mapa1.put(p2, prod2);

		ArrayList<Produto> lista1 = new ArrayList<Produto>();

		lista1.add(prod1);
		lista1.add(prod2);
		lista1.add(prod3);
		lista1.add(prod4);
		lista1.add(prod5);

		for (Map.Entry<Pessoa, Produto> m1 : mapa1.entrySet()) {
			System.out
					.println(m1.getKey().getNome() + " : " + m1.getValue().getNome() + " " + m1.getValue().getPreco());
		}

		System.out.println();

		ArrayList<Produto> lista2 = new ArrayList<Produto>();
		lista2.add(prod4);
		lista2.add(prod5);
		lista2.add(prod6);

		Map<Pessoa, ArrayList<Produto>> mapa2 = new HashMap<Pessoa, ArrayList<Produto>>();

		mapa2.put(p1, lista1);
		mapa2.put(p2, lista2);

		for (Map.Entry<Pessoa, ArrayList<Produto>> m2 : mapa2.entrySet()) {
			System.out.println(m2.getKey().getNome());

			for (Produto produto : m2.getValue()) {
				System.out.println(produto.getNome() + " : " + produto.getPreco() + " ");
			}
			System.out.println();
		}

	}

}
