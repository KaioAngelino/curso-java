package joaomcode.aula022.revisao;

import java.util.Date;

public class Passageiro extends Pessoa {

	private String documento;
	private String numeroCartao;

	public Passageiro(int id, String nome, String email, String telefone, String usuario, String senha,
			Date dataNascimento, Endereco endereco, String documento, String numeroCartao) {
		super(id, nome, email, telefone, usuario, senha, dataNascimento, endereco);

		this.documento = documento;
		this.numeroCartao = numeroCartao;

	}

}
