/*
 *Class: Class Exercicio-01
 *
 *Versão: 1.0
 *
 *Data: 24/10/19
 * 
 *Autor: joaomcode
 *
 */

public class Exercicio01 {
	public static void main(String[] args){
		//Mensagem Inicial do programa
		System.out.println("\nPrograma para criação de variáveis\n");

		//Criação de Variáveis
		String nome = "João";
		int idade = 28;
		char genero = 'M';
		String email = "joaom@email.com";
		String telefone = "3215.1234";
		String cpf = "123.234.345-45";
		String rg = "1231231231231";
		String endereco = "Av. Parangaba - 1304";

		//Mensagens que apresentam os valores armazenados nas variáveis
		System.out.println("Olá "+nome+" seja bem vindo!!!");
		System.out.println("Você tem "+idade+" anos.\n");
		System.out.println("Morador da "+endereco);
		System.out.println("Você é do gênero "+genero);
		System.out.println("Seu e-mail é: "+email);
		System.out.println("Seu telefone: "+telefone);
		System.out.println("CPF: "+cpf);
		System.out.println("RG: "+rg+"\n");
	}
}
