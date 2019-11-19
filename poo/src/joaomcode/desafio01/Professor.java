package joaomcode.desafio01;

public class Professor extends Pessoa {

	// Criação dos atributos
	private String turma;
	private String horario;
	private double salario;

	// Métodos construtores
	public Professor() {

	}

	public Professor(String turma, String horario, double salario) {
		this.turma = turma;
		this.horario = horario;
		this.salario = salario;
	}

	public Professor(String nome, String cpf, String telefone, Endereco numero) {
		super(nome, cpf, telefone, numero);
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters
	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
