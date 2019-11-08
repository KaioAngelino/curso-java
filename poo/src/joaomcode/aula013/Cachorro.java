package joaomcode.aula013;

public class Cachorro {
	
	private String raca;
	private String nome;
	private int idade;
	private boolean temPulga;
	
	public void latir() {
		System.out.println("Au au");
	}
	
	public void dormir() {
		System.out.println("ZZzzZzZzzZZzzzZZZ");
	}
	
	// Métodos Getters e Setters

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isTemPulga() {
		return temPulga;
	}

	public void setTemPulga(boolean temPulga) {
		this.temPulga = temPulga;
	}
	
}
