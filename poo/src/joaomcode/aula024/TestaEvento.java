package joaomcode.aula024;

import java.util.ArrayList;

public class TestaEvento {

	public static void main(String[] args) {
		Corredor c1 = new Corredor("Bolt", Categoria.PLATINUM);
		Corredor c2 = new Corredor("Azaian", Categoria.CONVENIADO);
		
		ArrayList<Corredor> grupo = new ArrayList<>();
		
		grupo.add(c1);
		grupo.add(c2);
		
		Evento e1 = new Evento("Corrida Pague Menos", grupo);
		
		e1.mostraCorredores();
	}
}
