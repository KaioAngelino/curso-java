package joaomcode.aula022.revisao;

public class Executiva extends Bilhete {

	public Executiva(int id, int numero, String assento, Horario horario) {
		super(id, numero, assento, horario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int maximoBagagens() {
		// TODO Auto-generated method stub
		return 2;
	}

}
