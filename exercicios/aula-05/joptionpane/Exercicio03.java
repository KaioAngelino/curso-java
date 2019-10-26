/**
 * Desenvolva um algoritmo em Java que peça no valor do raio, maior que zero,
 * e calcule o diâmetro, comprimento e área da circunferencia.
 *
 * Versão: 1.0
 *
 * Data: 25/10/19
 * 
 * Autor: joaomcode
 *
 */

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args){
		//Criação do objeto que lê o valor digitado pelo usuário
		Scanner leitor = new Scanner(System.in);

		//Criação da variável raio
		float raio;

		//Solicita ao usuário um número
		System.out.print("Digite o valor do raio da circunferência: ");
		raio = leitor.nextFloat();

		//Aprensenta os valores na tela
		System.out.println("O valor digitado foi "+raio);
		System.out.println("O diâmetro da circunferência é "+ (2*raio));
		System.out.println("O comprimento da circunferência é "+ (2*raio*Math.PI));
		System.out.println("A área da circunferência é "+ (Math.pow(raio,2)*Math.PI));
		
	}
}


