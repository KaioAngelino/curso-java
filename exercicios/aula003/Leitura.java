/*
 *Programa de leitura dos dados do usuário
 *
 *Versão: 1.0
 *
 *Data: 24/10/19
 * 
 *Autor: joaomcode
 *
 */

import java.util.Scanner;

public class Leitura {
	public static void main(String[] args){

		//Criação de um Objeto (instancia do objeto)
		//para receber os valores digitados pelo usuário
		Scanner leitor = new Scanner(System.in);

		/*
		 *Escreve uma mensagem para solicitar ao usuário que digite seu nome
		 *É sempre indicado solicitar ao usuário por mensagem o dado requisitado
		 */
		System.out.print("Digite o seu nome: ");

		//Aguarda o usuário digitar sua mensagem e apertar "ENTER"
		String nome = leitor.nextLine();

		//Mostra na tela o valor digitado pelo usuário
		System.out.println("Bem vindo "+nome);
	}
}


