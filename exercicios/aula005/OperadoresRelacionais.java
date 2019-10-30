/**
 * Programa para estudar os conceitos dos Operadores Lógicos
 * 
 * Versão: 1.0
 * 
 * Data: 29/10/19
 * 
 * Author: @joaomcode
 * 
 */

public class OperadoresRelacionais {

	public static void main (String[] args) {

		int n1 = 7;
		int n2 = 3;

		System.out.println(n1>n2);
		System.out.println(n1>=n2);
		System.out.println(n1<n2);
		System.out.println(n1<=n2);
		System.out.println(n1==n2);
		System.out.println(n1!=n2);

		//Operador ternário (condição)?(true):(false)
		String resultado = n1<n2?"n1 é maior que n2":"n2 é menor que n1";
		System.out.println(resultado);
		

		
	}
}
