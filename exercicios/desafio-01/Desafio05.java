
/*
 * 5. Construa um algoritmo que imprima todos os números ímpares até o 100
 *
 * Versão: 1.0
 *
 * Data: 04/11/19
 * 
 * Autor: @joaomcode
 *
 */

public class Desafio05 {
	public static void main(String[] args){

		// Repetição de 1 a 100
		for (int i = 1; i <= 100; i++ ) {
			if ((i%2) != 0) {
				System.out.println(i);
			}
		}
	}
}
