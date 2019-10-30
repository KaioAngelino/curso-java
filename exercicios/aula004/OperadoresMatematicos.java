/**
 * Programa de apresentação do soperadores matemáticos simples.
 *
 * Versão: 1.0
 *
 * Data: 25/10/19
 * 
 * Autor: joaomcode
 *
 */

//Importa o pacote java.util
import java.util.Scanner;

public class OperadoresMatematicos {
	public static void main(String[] args){
		// Exemplos de operadores matemáticos
		// +, -, *, /
		int numero1 = 20;
		int numero2 = 10;

		//Exemplos de operações matemáticas
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		double multiplicacao = numero1 * numero2;

		//Fazer o casting para transformar as variáveis inteiras numero1 e numero2 em double
		double divisao = (double) numero1 / numero2;

		/*  Outras maneiras de fazer esse casting podem ser:

			double n1 = numero1;
			Double n1 = new Double(numero1);
			Double n2 = Double.valueOf(numero2);
		*/
		
		//Apresentação dos resultados das operações matemáticas
		System.out.println("A soma de "+numero1+" e "+numero2+" é igual a "+soma);
		System.out.println("A subtração de "+numero1+" e "+numero2+" é igual a "+subtracao);
		System.out.println("A multiplicação de "+numero1+" e "+numero2+" é igual a "+multiplicacao);
		System.out.println("A divisão de "+numero1+" por "+numero2+" é igual a "+divisao);

		//Solicita ao usuário um número para que possam ser efetuados os cálculos
		Scanner leitor = new Scanner(System.in);
		
		// Exemplos de incrementador
			//Pré-incremento
			System.out.println(++numero1);
			//Pós-incremento
			System.out.println(numero1++); 
			System.out.println(numero1+=4); 
		// Exemplo de decrementador
			//Pré-decremento
			System.out.println(--numero1);
			//Pós-decremento
			System.out.println(numero1--); 
			System.out.println(numero1-=4);
		
	}
}


