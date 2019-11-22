package joaomcode.aula022.revisao;

public class Aviao {
	private int id;
	private String codigo;
	private double carga;
	private int qtdEconomica;
	private int qtdExecutiva;
	private int qtdPrimeira;
	private CiaAerea ciaAerea;

	public Aviao(int id, String codigo, double carga, int qtdEconomica, int qtdExecutiva, int qtdPrimeira,
			CiaAerea ciaAerea) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.carga = carga;
		this.qtdEconomica = qtdEconomica;
		this.qtdExecutiva = qtdExecutiva;
		this.qtdPrimeira = qtdPrimeira;
		this.ciaAerea = ciaAerea;

	}

}
