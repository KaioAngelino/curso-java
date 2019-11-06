/*
 * Programa que solicita ao usuário que forma deseja 
 * realizar o pagamento dinheiro, cartão (débito ou crédito)
 *
 *Versão: 1.0
 *
 *Data: 30/10/19
 * 
 *Autor: joaomcode
 *
 */

import java.util.Scanner;

public class SituacaoAcademica {
	public static void main(String[] args){
		
		// Instanciar um objeto
		Scanner leitor = new Scanner(System.in);

		// Solicita ao usuário que digite o tipo de pagamento
		System.out.print("Digite seu nome: ");
		
		// Aguarda o usuário digitar seu nome (String)
		// e armazena esse valor na variável nome
		String nome = leitor.nextLine();

		// Solicita ao usuário que digite sua primeira nota
		System.out.print("Digite sua primeira nota: ");
		
		// Aguarda o usuário digitar sua nota (double)
		// e armazena esse valor na variável nota1
		double nota1 = leitor.nextDouble();

		// Solicita ao usuário que digite sua segunda nota
		System.out.print("Digite sua segunda nota: ");
		
		// Aguarda o usuário digitar sua nota (double)
		// e armazena esse valor na variável nota2
		double nota2 = leitor.nextDouble();

		// Solicita ao usuário que digite sua terceira nota
		System.out.print("Digite sua terceira nota: ");
		
		// Aguarda o usuário digitar sua nota (double)
		// e armazena esse valor na variável nota3
		double nota3 = leitor.nextDouble();

		// Solicita ao usuário que digite sua quarta nota
		System.out.print("Digite sua quarta nota: ");
		
		// Aguarda o usuário digitar sua nota (double)
		// e armazena esse valor na variável nota4
		double nota4 = leitor.nextDouble();

		// Cálculo da média
		double media = ( nota1 + nota2 + nota3 + nota4) / 4;

		// Solicita ao usuário que digite sua presença
		System.out.print("Digite o valor da frequência: ");

		// Aguarda o usuário digitar a frenquecia (double)
		// e armazena esse valor na variável frequencia
		double frequencia = leitor.nextDouble();


		// Condição que a frequencia seja superior a 75%
		if ( frequencia > 75 ){

			System.out.println("\nSua média foi: "+media+"\n");

			// Codição que a nota seja maior ou igual a 7
			if ( media >= 7 ) {
				// Condição de Aprovação tanto por média quanto por frequência
				System.out.println("Aprovado");
			} else {

				// 
				System.out.println("Você precisa fazer a recuperação!\n");

				// Solicita ao usuário que digite a nota da recuperação
				System.out.print("Digite o valor da nota de recuperação: ");

				// Aguarda o usuário digitar o valor da recuperação (double)
				// e armazena esse valor na variável recuperacao
				double recuperacao = leitor.nextDouble();

				// 
				if ( recuperacao >= 5 ) {
					// 
					System.out.println("Aprovado");
				} else {
					// 
					System.out.println("RPN - Reprovado por nota!");						
				}
			} 
		}else {
			System.out.println("RPF - Reprovado por falta");
		}

	System.out.print("\n");
	}
}


