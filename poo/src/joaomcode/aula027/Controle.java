package joaomcode.aula027;

import java.util.HashMap;
import java.util.Map;

public abstract class Controle {

	static Map<Cliente, Carro> mapaClieCar = new HashMap<Cliente, Carro>();

	public static void alugarCarro(Cliente cliente, Carro carro) {
		System.out.println(carro.isAlugado());
		if (carro.isAlugado()) {
			System.out.println("Carro alugado!");
		} else {
			System.out.println("Disponivel");
			carro.setAlugado(true);
			mapaClieCar.put(cliente, carro);
		}
		System.out.println(carro.isAlugado());
	}

	public void receberCarro(Carro carro) {
		System.out.println(carro.isAlugado());
		if (carro.isAlugado()) {
			System.out.println("receber carro");
		}
	}

	public static double calcularAluguel(int dias, Carro carro) {
		double diaria = 3, aluguel = 0;
		aluguel = dias * (diaria + carro.getModelo().acrescimoAluguel(diaria));
		return aluguel;
	}

	public static void relatorioAluguel() {
		for (Map.Entry<Cliente, Carro> mp : mapaClieCar.entrySet()) {
			System.out.println(mp.getKey().getNome() + " alugou " + mp.getValue().getNome());
		}
	}

}
