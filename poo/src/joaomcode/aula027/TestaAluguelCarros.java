package joaomcode.aula027;

public class TestaAluguelCarros {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("João", 30, "Rua Norvinda Pires", 123);
		Carro car1 = new Carro("Herbie", Modelo.POPULAR);

		Controle.alugarCarro(c1, car1);

	}
}
