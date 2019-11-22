package joaomcode.aula022.revisao;

import java.util.Date;

public abstract class Pessoa {
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String usuario;
	private String senha;
	private Date dataNascimento;
	private Endereco endereco;

	public Pessoa(int id, String nome, String email, String telefone, String usuario, String senha, Date dataNascimento,
			Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.usuario = usuario;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		if (endereco != null) {
			this.endereco = endereco;
		}

	}

}
