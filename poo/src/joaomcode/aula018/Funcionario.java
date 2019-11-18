package joaomcode.aula018;

public class Funcionario {

	// Atributos
	private String nome;
	private String cadastro;

	// Construtores
	public Funcionario() {

	}

	public Funcionario(String nome, String cadastro) {
		this.nome = nome;
		this.cadastro = cadastro;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

//	public void setNome(String nome) {
//		this.nome = nome;
//	}

	public String getCadastro() {
		return cadastro;
	}

//	public void setCadastro(String cadastro) {
//		this.cadastro = cadastro;
//	}

}
