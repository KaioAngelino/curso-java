/*
 * Programa explanação funções (continuação)
 * Usando switch para pedir ao usuário parfa escolher entre as opções abaixo:
 * soma de dois números, exponencial, raizQuadrada, raizCúbica, EPar, Concatena, geraRandomico
 *
 * Versão: 1.0
 *
 * Data: 07/11/19
 * 
 * Autor: @joaomcode
 *
 */

import java.util.Scanner;

public class Funcoes {

	// Função que recebe dois valores e retorna o valor da soma deles
	public static double soma(double a, double b) {
		double resultado = a + b;
		return resultado;
	}

	// Função que recebe dois valores e retorna o valor de a^b
	public static double exponencial(double a, double b) {
		double resultado = Math.pow(a,b);
		return resultado;
	}

	// Função principal (main)
	public static void main(String[] args){
		// Instacia um objeto
		Scanner leitor = new Scanner(System.in);
		double numero1 = 0;
		double numero2 = 0;
		boolean sair = false;

		while(!sair){
			System.out.println("Selecione a opção abaixo:  ");
			System.out.println("1 - Soma");
			System.out.println("2 - Exponcial");
			System.out.println("3 - Raiz Quadrada");
			System.out.println("4 - Raiz Cúbica");
			System.out.println("5 - Par");
			System.out.println("6 - Concatena");
			System.out.println("7 - Randomico");
			System.out.println("8 - Sair");

			int opcao = leitor.nextInt();
			

			switch (opcao) {
				case 1:
					System.out.println("Você solicitou a opção soma.");
					System.out.println("Para isso precisamos que você digite 2 números.");
					System.out.print("Digite o primeiro número: ");
					numero1 = leitor.nextDouble();
					System.out.print("Digite o segundo número: ");
					numero2 = leitor.nextDouble();

					System.out.printf("%.2f", soma(numero1,numero2));
					System.out.println("");
					break;

				case 2:
					System.out.println("Você solicitou a opção exponencial.");
					System.out.println("Para isso precisamos que você digite 2 números.");
					System.out.print("Digite o número da base");
					numero1 = leitor.nextDouble();
					System.out.print("Digite o expoente: ");
					numero2 = leitor.nextDouble();

					System.out.printf("%.2f", exponencial(numero1,numero2));
					System.out.println("");
					break;

				case 8:
					sair = true;
					break;
				default:
					break;
			}
		}

	}
}


