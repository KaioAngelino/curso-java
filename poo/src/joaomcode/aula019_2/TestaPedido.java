package joaomcode.aula019_2;

import java.util.ArrayList;
import java.util.List;

public class TestaPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario f1 = new Funcionario("Osvaldo", "01");
		Funcionario f2 = new Funcionario();

		Produto p1 = new Produto("Final Fantasy VII", 2, 74);
		Produto p2 = new Produto("Breath of Fire IV", 1, 50);
		Produto p3 = new Produto("Tekken 7", 3, 102);
		Produto p4 = new Produto("Red Dead Rendemption", 1, 113);

		List<Produto> produtos = new ArrayList<>();

		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);

		List<Produto> produtos2 = new ArrayList<>();

		Produto p5 = new Produto("Castlevania", 2, 74);
		Produto p6 = new Produto("Medievil", 1, 50);
		Produto p7 = new Produto("Bomberman", 3, 102);
		Produto p8 = new Produto("Crash", 1, 113);

		produtos2.add(p5);
		produtos2.add(p6);
		produtos2.add(p7);
		produtos2.add(p8);

		Compra c1 = new Compra(112233456, f1);
		
		Compra c2 = new Compra(111111, f1, produtos2);
		
		c2.setProduto(produtos);

		c1.addicionar(1, p1);
		c1.addicionar(1, p2);
		c1.addicionar(1, p3);
		c1.addicionar(1, p4);
		c1.addicionar(1, p5);
		c1.addicionar(1, p6);
		c1.addicionar(3, p7);
		c1.addicionar(1, p8);
		//c1.setProduto(produtos2);

		c1.geraComprovante();

		// System.out.println(c1.getProduto());

		// for(Produto prod: c1.getProduto()) {
		// System.out.print(prod.getNome()+" ");
		// System.out.println(prod.getValor());
		// }

	}

}
