package joaomcode.aula022.revisao;

public class Rota {

	private int id;
	private String nome;
	private String descricao;
	private Aeroporto aeroporto;
	private CiaAerea ciaAerea;

	public Rota(int id, String nome, String descricao, Aeroporto aeroporto, CiaAerea ciaAerea) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.aeroporto = aeroporto;
		this.ciaAerea = ciaAerea;
	}

}
