package joaomcode.aula022.revisao;

public abstract class Bilhete {

	// Atributos

	private int id;
	private int numero;
	private String assento;
	private Horario horario;

	public Bilhete(int id, int numero, String assento, Horario horario) {
		this.id = id;
		this.numero = numero;
		this.assento = assento;
		this.horario = horario;
	}

	public void reservar(Passageiro passageiro) {

	}

	public void comprar() {

	}

	public void cancelarReserva() {

	}

	public void checkIn(Bagagem bagagem) {

	}

	public abstract int maximoBagagens();

}
