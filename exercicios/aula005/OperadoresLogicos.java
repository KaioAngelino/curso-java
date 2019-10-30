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

public class OperadoresLogicos {
	/*
		&  -> AND, e
		&& -> AND, curto circuito!
		|  -> OR, ou
		|| -> OR, curto circuito!
		^  -> XOR, ou exclusivo
		!  -> NOT
	*/

	public static void main (String[] args) {
		boolean v1 = true;
		boolean v2 = false;
		boolean resultado;

		System.out.println("Os resultados lógicos para v1="+v1+" e v2="+v2+", são:\n");

		//Exemplo usando o AND simples
		resultado = (v1&v2);
		System.out.println("v1 & v2 = "+resultado+"\n");

		//Exemplo usando o AND curto circuitado
		resultado = (v1&&v2);
System.out.println("v1 && v2 = "+resultado+"\n");

		//Exemplo usando o OR simples
		resultado = (v1|v2);
System.out.println("v1 | v2 = "+resultado+"\n");

		//Exemplo usando o OR curto circuitado
		resultado = (v1||v2);
System.out.println("v1 || v2 = "+resultado+"\n");

		//Exemplo usando o AND simples e XOR
		resultado = (v1^v2);
System.out.println("v1 ^ v2 = "+resultado+"\n");

		//Exemplo usando o AND simples e NOT
		resultado = !(v1&v2);
System.out.println("! ( v1 & v2 ) = "+resultado+"\n");
		
	}
}
