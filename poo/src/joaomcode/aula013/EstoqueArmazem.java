package joaomcode.aula013;

import java.util.Scanner;

public class EstoqueArmazem {

	public static void main(String[] args) {
		// Criação do vetor com o estoque
		int estoque[][] = {
				{150,0,100,150,200},
				{200,300,230,100,90},
				{250,300,0,200,150},
				{300,100,90,450,0},
				{350,300,400,250,200}
		};
		
		// Instancia um objeto da Classe Scanner
		Scanner leitor = new Scanner(System.in);
		
		// Solicita do usuário o armazem (0 a 4)
		System.out.print("Digite o armazem: ");
		int armazem = leitor.nextInt();
		// Solicita do usuário o produto (0 a 4)
		System.out.print("Digite o produto desejado: ");
		int produto = leitor.nextInt();
		// Solicita do usuário a quantidade a retirar
		System.out.print("Digite a quantidade desejada: ");
		int quantidade = leitor.nextInt();
		
		// Verifica se existe algum produto no armazem selecionado
		if (estoque[armazem][produto] > 0) {
			
			// Verifica se a quantidade solicitada é maior que o estoque 
			if (estoque[armazem][produto] > quantidade) {
				
				// Diminui a quantidade solicitada do total em estoque
				estoque[armazem][produto] -= quantidade;
				// Mostra na tela quanto foi retirado
				System.out.println("Você retirou "+quantidade+" do estoque.");
				// Mostra na tela quanto o que sobrou em estoque
				System.out.println("Saldo atual: "+estoque[armazem][produto]);
			}
		
		// Em caso de não haver estoque ou a quantidade
		// solicitada for maior que o estoque 
		} else {
			System.out.println("Quantidade insuficiente");
		}
		

	}

}
