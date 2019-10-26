/**
 * Desenvolva um algoritmo em Java que calcule descontos em uma determinada compra
 * após pedir o valor do produto e a porcentagem do desconto
 *
 * Versão: 1.0
 *
 * Data: 25/10/19
 * 
 * Autor: joaomcode
 *
 */

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args){
		//Criação do objeto que lê o valor digitado pelo usuário
		Scanner leitor = new Scanner(System.in);

		//Criação das variáveis preço e desconto
		int desconto;
		float preco;

		//Solicita ao usuário o valor do preço e desconto
		System.out.print("Digite o valor do preço do produto: ");
		preco = leitor.nextFloat();
		System.out.print("Digite o valor da porcentagem do desconto a ser aplicado no produto: ");
		desconto = leitor.nextInt();

		//Cálculo do desconto
		float precoFinal = preco * (100- (float) desconto)/100;

		//Aprensenta os valores na tela
		System.out.println("O valor digitado foi "+preco+" e o desconto é de "+desconto);
		System.out.println("O valor final é "+ precoFinal);
	}
}


