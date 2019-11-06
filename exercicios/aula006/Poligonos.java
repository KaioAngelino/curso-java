/*
 * Programa que solicita ao usuário um número 
 * e verifica se o mesmo é par
 *
 *Versão: 1.0
 *
 *Data: 30/10/19
 * 
 *Autor: joaomcode
 *
 */

import java.util.Scanner;

public class Poligonos {
	public static void main(String[] args){
		
		// Instanciar um objeto
		Scanner leitor = new Scanner(System.in);

		// Solicita ao usuário que digite o número de lados do polígono
		System.out.print("Digite a qtde de lados do polígono: ");
		
		// Aguarda o usuário digitar a quantidade de lados (número inteiro)
		// e armazena esse valor na variável lados
		int lados = leitor.nextInt();

		if ( lados < 3 ) {
			System.out.print("Não existem polígonos com menos que 3 lados");
		} else if (lados == 3 ) {
			System.out.print("O polígono que possui 3 lados é um triângulo!");
		} else if ( lados == 4 ) {
			System.out.print("O polígono que possui 4 lados é um quadrilátero!");		
		} else if ( lados == 5 ) {
			System.out.print("O polígono que possui 5 lados é um pentágono!");
		}
			System.out.print("\n\n");
	}
}


