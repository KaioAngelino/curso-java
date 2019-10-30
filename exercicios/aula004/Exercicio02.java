/**
 * Desenvolva um algoritmo em Java que leia a idade de uma pessoa expressa em anos,
 * meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias
 * e o mês com 30. (EX.: 3 anos, 2 meses e 15 dias = 1170 dias.)
 * 
 *
 * Versão: 1.0
 *
 * Data: 25/10/19
 * 
 * Autor: joaomcode
 *
 */

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args){
		//Instanciamento do objeto que lê o valor digitado pelo usuário
		Scanner leitor = new Scanner(System.in);

		//Criação das variáveis ano, meses e dias
		int anos, meses, dias;

		//Solicita ao usuário a idade dele
		System.out.print("Qual sua idade? ");
		anos = leitor.nextInt();

		//Solicita ao usuário a quantos meses ele tem
		System.out.print("Quantos meses? ");
		meses = leitor.nextInt();

		//Solicita ao usuário quantos dias ele tem
		System.out.print("E dias? ");
		dias = leitor.nextInt();

		//Cálculo de quantos dias o cliente possui de vida
		int diasDeVida =  anos*365 + meses*30 + dias;


		//Aprensenta os valores na tela
		System.out.println("Você tem "+anos+" anos "+meses+" meses e "+dias+" dias de vida.");
		System.out.println("Sua idade em dias é: "+diasDeVida);
	}
}


