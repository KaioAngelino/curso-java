package joaomcode.aula014;

public class Pessoa {

	private String nome;
	private int idade;
	private int dia;
	private int mes;
	private int ano;

	public void calculaIdade(int dia, int mes, int ano) {

		if (this.mes < mes) {
			this.idade = ano - this.ano;
			
		} else if (this.mes == mes) {
			
			if (this.dia <= dia) {
				
				this.idade = ano - this.ano;
				
			} else {
				
				this.idade = ano - this.ano - 1;
			}
			
		} else {
			this.idade = ano - this.ano - 1;
		}
	}

	public void informaIdade(String nome) {
		System.out.println("A sua idade é " + this.idade);
	}

	public void informaNome() {
		System.out.println("Bom dia Sr(a) " + this.nome);
	}

	public void ajustaDataDeNascimento(int dia, int mes, int ano) {
		if (dia>0 && dia<=30) {
			this.dia = dia;
		}
		
		if (mes>0 && mes<=12) {
			this.mes = mes;
		}
		
		if (ano>0 && ano <2020) {
			this.ano = ano;
		}
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

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
