package joaomcode.aula015;

public class TestaConta {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria(1, "João", "123", 200, true, true);
		
		c1.visualizaSaldo();
		c1.deposito(35);
		c1.visualizaSaldo();
		c1.saque(30);
		c1.visualizaSaldo();

	}

}
