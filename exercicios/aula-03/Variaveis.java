/*
 *Class: Class OiMundo
 *
 *Versão: 1.0
 *
 *Data: 23/10/19
 * 
 *Autor: joaomcode
 *
 */

public class Variaveis {
	public static void main(String[] args){
		//Mensagem Inicial do programa
		System.out.println("\nPrimeiro programa para criação de variáveis\n");

		//Criação de Variáveis
		String nome = "João";
		int idade = 28;
		float altura = 1.85f;

		//Mensagens que apresentam os valores armazenados nas variáveis
		System.out.println("Olá "+nome+" seja bem vindo!!!");
		System.out.println("Você tem "+idade+" anos e "+altura+" de altura.\n");

		//Mensagem utilizando a função printf do C
		System.out.printf("Olá %s sua altura é %.2f, e sua idade é %d\n\n",nome,altura,idade);
	}
}
