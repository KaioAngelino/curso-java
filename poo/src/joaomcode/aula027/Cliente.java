package joaomcode.aula027;

public class Cliente extends Pessoa {

	private int inscricao;

	/**
	 * @param nome
	 * @param idade
	 * @param endereco
	 * @param inscricao
	 */
	public Cliente(String nome, int idade, String endereco, int inscricao) {
		super(nome, idade, endereco);
		this.inscricao = inscricao;
	}

	/**
	 * @return the inscricao
	 */
	public int getInscricao() {
		return inscricao;
	}

	/**
	 * @param inscricao the inscricao to set
	 */
	public void setInscricao(int inscricao) {
		this.inscricao = inscricao;
	}

	
}
