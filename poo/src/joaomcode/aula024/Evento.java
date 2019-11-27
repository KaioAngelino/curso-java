package joaomcode.aula024;

import java.util.ArrayList;

public class Evento {
	private String nome;
	private ArrayList<Corredor> corredores;

	public Evento() {
	}

	/**
	 * @param nome
	 * @param corredores
	 */
	public Evento(String nome, ArrayList<Corredor> corredores) {
		this.nome = nome;
		this.corredores = corredores;
	}

	public void mostraCorredores() {
		for (Corredor c : corredores) {
			double inscricao = 120;
			double desconto = c.getCategoria().desconto();
			inscricao = inscricao - (inscricao * desconto) / 100;
			
			System.out.println(c.getNome()+ " Categoria: "+c.getCategoria()+" valor da inscrição: "+inscricao);
		}

	}

}
