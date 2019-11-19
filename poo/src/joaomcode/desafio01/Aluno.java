package joaomcode.desafio01;

public class Aluno extends Pessoa {

	// Criação dos atributos
	private String curso;
	private String turno;

	// Métodos Construtores
	public Aluno() {

	}

	public Aluno(String curso, String turno) {
		this.curso = curso;
		this.turno = turno;
	}

	public Aluno(String curso, String turno, String nome, String cpf, String telefone, Endereco endereco) {
		super(nome, cpf, telefone, endereco);
		this.curso = curso;
		this.turno = turno;
	}

	// Getter and Setters
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

}
