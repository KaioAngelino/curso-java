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

public class EstruturaCondicionalAninhada {
	public static void main(String[] args){
		
		// Instanciar um objeto
		Scanner leitor = new Scanner(System.in);

		// Solicita ao usuário que digite o tipo de pagamento
		System.out.print("Digite ao tipo de pagamento: ");
		
		// Aguarda o usuário digitar o tipo de pagamento (String)
		// e armazena esse valor na variável tipoDePagamento
		String tipoDePagamento = leitor.nextLine();

		// Estrutura de decisão em caso de pagamento realizado com dinheiro
		if ( tipoDePagamento.equals("dinheiro") ) {

			// Informa que a compra foi realizada com sucesso
			System.out.print("Compra realizada com sucesso!");

		// Estrutura de decisão em caso de pagamento realizado com cartão
		} else if (tipoDePagamento.equals("cartao") ) {

			// Pergunta ao usuário se vai ser no débito ou crédito
			System.out.print("Deseja pagar no débito, ou crédito? ");

			// Aguarda o usuário digitar o tipo de pagamento (String)
			// e armazena esse valor na variável tipoCartao
			String tipoCartao = leitor.nextLine();

			// Estrutura de decisão em caso de pagamento a ser realizado no débito
			if ( tipoCartao.equals("debito") ) {

				// Informa que a compra no débito foi realizada com sucesso
				System.out.println("Compra no débito realizada com sucesso");

			// Estrutura de decisão em caso de pagamento a ser realizado no débito
			} else if ( tipoCartao.equals("credito") ) {
				
				// Informa que a compra foi realizada com sucesso
				System.out.println("Bola de neve, esperar chegar fatura!");
				
			} else {
				
				// Forma de pagamento inválida
				System.out.println("Forma de pagamento inválida");
			}

		// Estrutura de decisão em caso de pagamento inválida
		} else {

			// Forma de pagamento inválida
			System.out.println("Forma de pagamento inválida");
		}
	System.out.print("\n\n");
	}
}


