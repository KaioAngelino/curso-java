package joaomcode.aula019_2;

public class Funcionario {
	private String nome;
	private String cadastro;

	public Funcionario() {
	}

	public Funcionario(String nome, String cadastro) {
		this.nome = nome;
		this.cadastro = cadastro;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCadastro() {
		return this.cadastro;
	}

}
