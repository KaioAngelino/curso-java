/*
 *Programa para realizar um cadastro básico
 *
 *Versão: 11
 *
 *Data: 24/10/2019
 * 
 *Autor: joaomcode
 *
 */

import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args){

		Scanner leitor = new Scanner(System.in);

		System.out.println("-------- CADASTRO CLIENTES --------\n");

		//Recebe o nome do usuário
		System.out.print("Digite o seu nome: ");
		String nome = leitor.nextLine();

		//Recebe o endereço do usuário
		System.out.print("Digite o seu endereço: ");
		String endereco = leitor.nextLine();

		//Recebe a idade do usuário
		System.out.print("Digite a sua idade: ");
		int idade = leitor.nextInt();
		
		//Recebe a altura do usuário
		System.out.print("Digite a sua altura: ");
		double altura = leitor.nextDouble();

		//Imprime na tela os valores digitados pelo usuário
		System.out.println("\nBem vindo "+nome+" morador da "+endereco);
		System.out.println("Você tem "+idade+" e mede "+altura+"m\n");
	}
}
