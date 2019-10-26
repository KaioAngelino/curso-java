/**
 * Desenvolva um algoritmo em Java que imprima a média aritmética dos números 8,9 e 7.
 * A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
 *
 * Versão: 1.0
 *
 * Data: 26/10/19
 * 
 * Autor: joaomcode
 *
 */

import javax.swing.JOptionPane;

public class Exercicio05 {
	public static void main(String[] args){
		// Criação das variáveis media1 e media2 que calculam as médias de
		// 8, 9, 7 e 4, 5, 6 respectivamente
		float media1 = (8 + 9 + 7 ) / 3;
		float media2 = (4 + 5 + 6 ) / 3;

		// Imprime a média aritmética media1 e media2
		JOptionPane.showMessageDialog(null,"A média aritmética de 8, 9 e 7 é: "+media1);
		JOptionPane.showMessageDialog(null,"A média aritmética de 4, 5 e 6 é: "+media2);

		//Cálculo da soma das duas médias
		float soma = media1 + media2;

		//Cálculo da média das médias media1 e media2
		float mediaDasMedias = soma/2;
		
		//Aprensenta os valores da soma e média aritmética das médias
		JOptionPane.showMessageDialog(null,"A soma das médias aritiméticas é: "+soma);
		JOptionPane.showMessageDialog(null,"A média aritmética das médias é: "+mediaDasMedias);
	}
}


