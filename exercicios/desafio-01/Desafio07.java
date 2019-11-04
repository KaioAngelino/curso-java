
/*
 * 7) Faça um algoritmo que estando em um loop infinito peça que o usuário digite um
 * número e só saia do laço quando o usuário digitar um número negativo
 *
 * Versão: 1.0
 *
 * Data: 04/11/19
 * 
 * Autor: @joaomcode
 *
 */

import java.util.Scanner;

public class Desafio07 {
	public static void main(String[] args){

		Scanner leitor = new Scanner(System.in);
		int num = 0;

		do{
			System.out.print("Digite um número: ");
			num = leitor.nextInt();
		}while(num>=0);
	}
}
