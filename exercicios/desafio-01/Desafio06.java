
/*
 * 6) Faça um programa que some todos os seguintes números: 1+1/2+1/3+...+1/100
 *
 * Versão: 1.0
 *
 * Data: 04/11/19
 * 
 * Autor: @joaomcode
 *
 */


public class Desafio06 {
	public static void main(String[] args){

		double resultado = 1;

		// Repetição de 1 a 100
		for (float i = 2; i <= 100; i++ ) {
			//System.out.println("1/"+i);
			resultado = resultado + (1/i);
		}

		System.out.println(resultado);
	}
}
