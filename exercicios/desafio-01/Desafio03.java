
/*
 * 3. Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando
 * o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos 
 * da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar 
 * o cálculo adequado.
 * 
 * Código Condição de pagamento
 * 1 À vista em dinheiro ou cheque, recebe 10% de desconto
 * 2 À vista no cartão de crédito, recebe 15% de desconto
 * 3 Em duas vezes, preço normal de etiqueta sem juros
 * 4 Em duas vezes, preço normal de etiqueta mais juros de 10%
 *
 * Versão: 1.0
 *
 * Data: 04/11/19
 * 
 * Autor: @joaomcode
 *
 */

import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args){

		// Intância um objeto leitor
		Scanner leitor = new Scanner(System.in);

		// Solicita ao usuário sua altura
		System.out.print("Digite o valor do produto: ");
		double preco = leitor.nextDouble();

		// Solicita ao usuário seu peso
		System.out.println("Selecione a forma de pagamento? ");
		System.out.println("1 - À vista em dinheiro ou cheque");
		System.out.println("2 - À vista no cartão de crédito");
		System.out.println("3 - Em duas vezes sem juros");
		System.out.println("4 - Em duas vezes com juros");
		int opcao = leitor.nextInt();

		// Cálculos do valor final a ser pago
		double valorFinal = 0;

		// Verficador de opção inválida
		do{
			// Cálculos do valor final a ser pago (switch)
			switch (opcao) {
				case 1:
					valorFinal = preco * 0.9;
					break;
				case 2:
					valorFinal = preco * 0.85;
					break;
				case 3:
					valorFinal = preco;
					break;
				case 4:
					valorFinal = preco * 1.1;
					break;
				default:
					System.out.println("Valor inválido!\nDigite novamente :)");
					break;
			}

			// Cálculos do valor final a ser pago (if else)
			// if (opcao == 1) {
			// 	valorFinal = preco * 0.9;
			// } else if (opcao == 2) {
			// 	valorFinal = preco * 0.85;
			// } else if (opcao == 3) {
			// 	valorFinal = preco;
			// } else if (opcao == 4) {
			// 	valorFinal = preco * 1.1;
			// } else {
			// 	System.out.println("Valor inválido!\nDigite novamente :)");
			// }

		}while(opcao > 4 && opcao < 1 );

		System.out.printf("O valor final é %.2f " , valorFinal);
		System.out.println("");
	}
}
