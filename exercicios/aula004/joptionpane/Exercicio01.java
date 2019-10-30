/**
 * Desenvolva um algoritmo em Java que leia um número inteiro
 * e imprima o seu antecessor e seu sucessor
 *
 * Versão: 1.0
 *
 * Data: 26/10/19
 * 
 * Autor: joaomcode
 *
 */

//Importa a classe JOptionPane do pacote java.swing
import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args){


		//Solicita ao usuário um número
		String valor = JOptionPane.showInputDialog("Digite um número: ");

		//Cast da variável valor de String -> int
		int numero = Integer.parseInt(valor);

		//Aprensenta os valores na tela
		JOptionPane.showMessageDialog(null, "Você digitou o número "+numero+"\nSeu antecessor é: "+--numero+"\nE seu sucessor é: "+(numero+2));


	}
}


