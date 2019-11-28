package joaomcode.aula026;

public class Pessoa {

	// Atributos
	private String nome;
	private int idade;
	private String endereco;
	private Bilhete bilhete;

	// Construtores

	public Pessoa() {

	}

	/**
	 * @param nome
	 * @param idade
	 * @param endereco
	 */
	public Pessoa(String nome, int idade, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	/**
	 * @param nome
	 * @param idade
	 * @param endereco
	 * @param bilhete
	 */
	public Pessoa(String nome, int idade, String endereco, Bilhete bilhete) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.bilhete = bilhete;
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
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the bilhete
	 */
	public Bilhete getBilhete() {
		return bilhete;
	}

	/**
	 * @param bilhete the bilhete to set
	 */
	public void setBilhete(Bilhete bilhete) {
		this.bilhete = bilhete;
	}

}
