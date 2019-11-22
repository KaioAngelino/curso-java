package joaomcode.aula022.revisao;

import java.util.Date;

public class Funcionario extends Pessoa {

	private String codigo;
	private String contaCorrente;
	private Funcao funcao;

	public Funcionario(int id, String nome, String email, String telefone, String usuario, String senha,
			Date dataNascimento, Endereco endereco, String codigo, String contaCorrente, Funcao funcao) {
		super(id, nome, email, telefone, usuario, senha, dataNascimento, endereco);
		// TODO Auto-generated constructor stub

		this.codigo = codigo;
		this.contaCorrente = contaCorrente;
		this.funcao = funcao;
	}

}
