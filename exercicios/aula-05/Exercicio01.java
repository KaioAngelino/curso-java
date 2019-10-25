/**
 * Desenvolva um algoritmo em Java que leia um número inteiro
 * e imprima o seu antecessor e seu sucessor
 *
 * Versão: 1.0
 *
 * Data: 25/10/19
 * 
 * Autor: joaomcode
 *
 */

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args){
		//Criação do objeto que lê o valor digitado pelo usuário
		Scanner leitor = new Scanner(System.in);

		//Criação das variáveis
		int valor;

		//Solicita ao usuário um número
		System.out.print("Digite um número: ");
		valor = leitor.nextInt();

		//Aprensenta os valores na tela
		System.out.println("O valor digitado foi "+valor);
		System.out.println("Seu antecessor é "+ --valor);
		System.out.println("Seu sucessor é "+ (valor+2));
	}
}


