
/*
 * 2. O IMC – Indice de Massa Corporal é um critério da Organização Mundial de Saúde
 * para dar uma indicação sobre a condição de peso de uma pessoa adulta.
 * A fórmula é IMC = peso / ( altura )^2. Elabore um algoritmo que leia o peso e a
 * altura de um adulto e mostre sua condição de acordo com a tabela abaixo.
 *
 * IMC em adultos Condição
 * Abaixo de 18,5 Abaixo do peso
 * Entre 18,5 e 25 Peso normal
 * Entre 25 e 30 Acima do peso
 * Acima de 30 obeso
 *
 * Versão: 1.0
 *
 * Data: 03/11/19
 * 
 * Autor: @joaomcode
 *
 */

import java.util.Scanner;

public class Desafio02 {
	public static void main(String[] args){

		// Intância um objeto leitor
		Scanner leitor = new Scanner(System.in);

		// Solicita ao usuário sua altura
		System.out.print("Digite sua altura: ");
		double altura = leitor.nextDouble();

		// Solicita ao usuário seu peso
		System.out.print("Digite seu peso: ");
		double peso = leitor.nextDouble();

		double imc = peso / (altura*altura);
		System.out.printf("Seu IMC é %.2f ",imc);
		System.out.println();

		// verifica em qual estágio a pessoa se encontra
		// e mostra na tela o seu valor
		if (imc < 18.5){
			System.out.println("Abaixo do Peso!");
		} else if (imc < 25){
			System.out.println("Peso Normal!");
		} else if (imc < 30){
			System.out.println("Acima do Peso!");
		} else {
			System.out.println("Obeso!");
		}
		



	}
}
