package joaomcode.aula022.revisao;

public class Primeira extends Bilhete {

	public Primeira(int id, int numero, String assento, Horario horario) {
		super(id, numero, assento, horario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int maximoBagagens() {
		// TODO Auto-generated method stub
		return 3;
	}

}
