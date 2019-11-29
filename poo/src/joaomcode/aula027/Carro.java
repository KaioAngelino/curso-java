package joaomcode.aula027;

enum Modelo {
	POPULAR(1) {
		@Override
		public double acrescimoAluguel(double diaria) {
			// TODO Auto-generated method stub
			return 0;
		}
	},

	ESPORTIVO(2) {

		@Override
		public double acrescimoAluguel(double diaria) {
			// TODO Auto-generated method stub
			return diaria *= 0.15;
		}
	},

	LUXO(3) {

		@Override
		public double acrescimoAluguel(double diaria) {
			// TODO Auto-generated method stub
			return diaria *= 0.30;
		}
	};

	int car;

	Modelo(int car) {
		this.car = car;
	}

	public abstract double acrescimoAluguel(double diaria);
}

public class Carro {

	private String nome;
	private Modelo modelo;
	private boolean alugado;

	// Constructors

	/**
	 * @param nome
	 * @param modelo
	 * @param alugado
	 */
	public Carro(String nome, Modelo modelo) {
		this.nome = nome;
		this.modelo = modelo;
		this.alugado = false;
	}

	// Getters and Setters

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the alugado
	 */
	public boolean isAlugado() {
		return alugado;
	}

	/**
	 * @param alugado the alugado to set
	 */
	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	/**
	 * @return the modelo
	 */
	public Modelo getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

}
