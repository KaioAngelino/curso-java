package joaomcode.aula020;

public abstract class Animal {

	private String nome;

	public Animal() {

	}

	public Animal(String nome) {
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public abstract void barulho();

}
