package joaomcode.aula026;

import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestaViajem {

	public static void main(String[] args) {

		Instant i = Instant.now();
		Date data = Date.from(i);

		Bilhete b1 = new Bilhete(1, Categoria.COMUM, data);
		Bilhete b2 = new Bilhete(2, Categoria.EXECUTIVO, data);
		Bilhete b3 = new Bilhete(3, Categoria.PRIMEIRA_CLASSE, data);

		Pessoa p1 = new Pessoa("Olavo", 42, "Portugal", b1);

		Map<Pessoa, Integer> mapa = new LinkedHashMap<Pessoa, Integer>();

		mapa.put(p1, p1.getBilhete().numDeBagagem());

		for (Pessoa p : mapa.keySet()) {
			System.out.println(p.getNome());
		}

		System.out.println(" ");

		for (Integer p : mapa.values()) {
			System.out.println(p);
		}

		for (Map.Entry<Pessoa, Integer> m : mapa.entrySet()) {
			System.out.println(m.getKey().getNome() + " : " + m.getValue());
		}
	}

}
