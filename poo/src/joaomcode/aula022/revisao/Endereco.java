package joaomcode.aula022.revisao;

public class Endereco {

	// Atributos
	private int id;
	private int numero;
	private String rua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;

	public Endereco(int id, int numero, String rua, String complemento, String bairro, String cidade, String estado,
			String pais) {
		this.id = id;
		this.numero = numero;
		this.rua = rua;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

}
