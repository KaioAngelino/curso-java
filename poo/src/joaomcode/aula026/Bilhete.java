package joaomcode.aula026;

import java.util.Date;

enum Categoria {
	COMUM(1), EXECUTIVO(2), PRIMEIRA_CLASSE(3);

	int bagagem;

	Categoria(int bagagem) {
		this.bagagem = bagagem;
	}

	public int getBagagem() {
		return bagagem;
	}

}

public class Bilhete {

	// Atributos
	private int numero;
	private Categoria categoria;
	private Date desembarque;

	// Construtores

	public Bilhete() {

	}

	/**
	 * @param numero
	 * @param categoria
	 * @param desembarque
	 */
	public Bilhete(int numero, Categoria categoria, Date desembarque) {
		this.numero = numero;
		this.categoria = categoria;
		this.desembarque = desembarque;
	}
	
	public int numDeBagagem() {
		return categoria.getBagagem();
	}
}
