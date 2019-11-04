
/*
 * 8. Desenvolva um programa que gere aleatoriamente os seis números da mega sena.
 *
 * Versão: 1.0
 *
 * Data: 04/11/19
 * 
 * Autor: @joaomcode
 *
 */

public class Desafio08 {
	public static void main(String[] args){

		System.out.println("Os numeros da mega sena são: ");
		for (int i=0; i<=5; i++) {
			System.out.print((int) (100*Math.random()));
			System.out.print(" ");
		}
		System.out.println();
	}
}
