/**
 * 
 */
package com.projeto.model.ov;

import java.time.LocalDate;

/**
 * @author joaomcode
 *
 */
public class Passageiro {

	private long id;
	private String nome;
	private LocalDate dataNascimento;
	private int idade;
	private Endereco endereco;
	private String documento;
	private String cartao;
	private Bilhete bilhete;

	/**
	 * @param id
	 * @param nome
	 * @param dataNascimento
	 * @param idade
	 * @param endereco
	 * @param documento
	 * @param cartao
	 * @param bilhete
	 */
	public Passageiro(long id, String nome, LocalDate dataNascimento, int idade, Endereco endereco, String documento,
			String cartao, Bilhete bilhete) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.endereco = endereco;
		this.documento = documento;
		this.cartao = cartao;
		this.bilhete = bilhete;
	}

	/**
	 * @param nome
	 * @param dataNascimento
	 * @param idade
	 * @param endereco
	 * @param documento
	 * @param cartao
	 * @param bilhete
	 */
	public Passageiro(String nome, LocalDate dataNascimento, int idade, Endereco endereco, String documento,
			String cartao, Bilhete bilhete) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.endereco = endereco;
		this.documento = documento;
		this.cartao = cartao;
		this.bilhete = bilhete;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

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
	 * @return the dataNascimento
	 */
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
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
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	/**
	 * @return the cartao
	 */
	public String getCartao() {
		return cartao;
	}

	/**
	 * @param cartao the cartao to set
	 */
	public void setCartao(String cartao) {
		this.cartao = cartao;
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
