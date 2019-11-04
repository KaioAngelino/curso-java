	
/*
 * 1. Fazer um algoritmo que receba três números
 * e imprima-os em ordem crescente.
 *
 * Versão: 1.0
 *
 * Data: 03/11/19
 * 
 * Autor: @joaomcode
 *
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Desafio01 {
	public static void main(String[] args){

		// Intância um objeto leitor
		Scanner leitor = new Scanner(System.in);

		int numero[] = new int[3];
		int aux, min, max;

		for (int i = 0; i <= 2; i++) {

			// Solicita ao usuário que digite um número
			// Devido ao vetor iniciar com o indice numero[0]
			// o indice i = 0 precisa de um pré-incremento (++i)
			// para que na mensagem apareça 1º, 2º e 3º
			System.out.print("Digite o "+(++i)+"º número: ");

			// É preciso realizar um pré-decremento no indice i
			// para retornar o valor dos indices 0, 1 e 2
			numero[--i] = leitor.nextInt();
		}

		Arrays.sort(numero);

		for (int i = 0; i <= 2; i++) {
			System.out.println(numero[i]);
		}
	}
}
