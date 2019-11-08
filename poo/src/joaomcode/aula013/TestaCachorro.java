package joaomcode.aula013;

import java.util.List;
import java.util.ArrayList;

public class TestaCachorro {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();
		
		c1.setNome("Pingo");
		c1.setRaca("Pincher");
		c1.setIdade(2);
		
		c2.setNome("Rex");
		c2.setRaca("Poodle");
		c2.setIdade(4);
		
		List<Cachorro> canil = new ArrayList<>();
		
		canil.add(c1);
		canil.add(c2);
		
		System.out.println(c1.getNome());
		System.out.println(c1.getRaca());
		System.out.println(c1.getIdade());
		
		c1.latir();

	}

}
