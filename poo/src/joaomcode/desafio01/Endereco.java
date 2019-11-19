package joaomcode.desafio01;

public class Endereco {

	// Criação dos atributos
	private String numero;
	private String rua;
	private String cidade;

	// Métodos Contrutores
	public Endereco() {

	}

	public Endereco(String numero, String rua, String cidade) {
		this.numero = numero;
		this.rua = rua;
		this.cidade = cidade;
	}

	// Getters and Setters

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
