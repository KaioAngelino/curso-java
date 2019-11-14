package joaomcode.aula017;

public class TestaEndereco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Endereco end1 = new Endereco("Rua Q", "11", "60300-000", "Uberlandia");

		Pessoa p1 = new Pessoa("Lucivaldo", end1, "123.234.345-45", "(85) 99901.1223");

		System.out.println(p1.getNome());

		if (end1.getCidade() != null) { // Verificar se existe valor no atributo antes de imprimir
			System.out.println(p1.getEndereco().getCidade());
		}
		System.out.println(p1.getEndereco().getCep());

	}

}
