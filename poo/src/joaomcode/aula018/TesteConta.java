package joaomcode.aula018;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario f1 = new Funcionario("Joao", "123434");
		Produto p1 = new Produto("Carne", 5, 1.5);
		Conta c1 = new Conta(1, f1, p1);
		
		System.out.println(c1.getNumero());
		System.out.println(c1.getValor());
		System.out.println();
		System.out.println(c1.getFuncionario().getNome());
		System.out.println(c1.getFuncionario().getCadastro());
		System.out.println();
		System.out.println(c1.getProduto().getNome());
		System.out.println(c1.getProduto().getQuantidade());
		System.out.println(c1.getProduto().getValor());

	}

}
