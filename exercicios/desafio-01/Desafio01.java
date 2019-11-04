	
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

		// Laço para fazer a varredura do vetor
		for (int i = 0; i < 2; i++) {
			// Verifica valor armazenado no vetor numero[i] é maior que o conteúdo do vetor numero[(i+1)]
			if ( numero[i] > numero[++i] ){ // Devido ao pre-incremento o indice do vetor está (i+1)
				// Armazena o conteúdo do vetor numero[(i+1)] na variável aux
				aux = numero[i];
				// Armazena o conteúdo do vetor numero[i] na variável max
				max = numero[--i]; // Correção do indice do vetor utilizando um pré-decremento
				System.out.println(aux+"\n"+max+" "+i);
			} else {
				max = numero[i];
				aux = numero[--i];
				System.out.println(aux+"\n"+max+" "+i);
			}
			numero[i] = aux;
			numero[++i] = max;
			i--;
		}

		for (int i = 0; i <= 2; i++) {
			System.out.println("O "+(++i)+"º número foi "+numero[--i]);
		}

	}
}
