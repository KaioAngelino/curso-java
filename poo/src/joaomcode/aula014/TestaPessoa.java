package joaomcode.aula014;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		
		// Intancia um objeto do tipo leitor
		Scanner leitor = new Scanner(System.in);
		
		// Instancia um objeto do tipo Pessoa
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("Albert Einstein");
		p1.ajustaDataDeNascimento(14, 3,1879);
		p1.calculaIdade(11, 11, 2019);
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
		
		p2.setNome("Isaac Newton");
		p2.ajustaDataDeNascimento(14, 3,1879);
		p2.calculaIdade(11, 11, 2019);
		System.out.println(p2.getNome());
		System.out.println(p2.getIdade());
	}

}
