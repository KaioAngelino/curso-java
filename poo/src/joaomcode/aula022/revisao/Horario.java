package joaomcode.aula022.revisao;

import java.util.Date;

public class Horario {

	private int id;
	private String codigo;
	private Date partida;
	private Date chegada;
	private int qtdEconomica;
	private int qtdExecutiva;
	private int qtdPrimeira;
	private Rota rota;

	public Horario(int id, String codigo, Date partida, Date chegada, Rota rota) {
		this.id = id;
		this.codigo = codigo;
		this.partida = partida;
		this.chegada = chegada;
	}
}
