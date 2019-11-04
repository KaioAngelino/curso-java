
/*
 * 4. O cardápio de uma casa de lanches é dado pela tabela abaixo:
 *
 * Cógigo	Produto 			R$
 * 100		Cachorro quente		1,70
 * 101		Baurú Simples		2,30
 * 102		Baurú com ovo 		2,60
 * 103		Hamburguer			2,40
 * 104		Cheeseburguer		2,50
 * 105		Refrigerante		1,00
 *
 * Escreva um algoritmo que leia o código do item adquirido pelo consumidor e a
 * quantidade, calculando e mostrando o valor a pagar. Não será necessário exibir o produto
 * e o valor, somente o valor final.
 *
 * Versão: 1.0
 *
 * Data: 04/11/19
 * 
 * Autor: @joaomcode
 *
 */

import java.util.Scanner;

public class Desafio04 {
	public static void main(String[] args){

		// Intância um objeto leitor
		Scanner leitor = new Scanner(System.in);

		// Solicita ao usuário valores do código e a quantidade a levar
		System.out.print("Digite o código do produto: ");
		int codigo = leitor.nextInt();
		System.out.print("Qual a quantidade o cliente quer levar: ");
		int quantidade = leitor.nextInt();

		// Instancia a variável valor e a zera
		double valor = 0;

		// Realiza os cálculos do valor total a se pagar
		// de acordo com o código digitado
		switch (codigo) {
			case 100:
				valor = quantidade * 1.7;
				break;
			case 101:
				valor = quantidade * 2.3;
				break;
			case 102:
				valor = quantidade * 2.6;
				break;
			case 103:
				valor = quantidade * 2.4;
				break;
			case 104:
				valor = quantidade * 2.5;
				break;
			case 105:
				valor = quantidade * 1;
				break;
		}

		// Apresenta o valor final a ser pago
		System.out.printf("O valor total é: R$%.2f",valor);
		System.out.println("");
	}
}
