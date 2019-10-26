/**
 * Desenvolva um algoritmo em Java que peça no valor do raio, maior que zero,
 * e calcule o diâmetro, comprimento e área da circunferencia.
 *
 * Versão: 1.0
 *
 * Data: 26/10/19
 * 
 * Autor: joaomcode
 *
 */

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args){
		//Solicita ao usuário um número
		String raioString = JOptionPane.showInputDialog("Digite o valor do raio da circunferência: ");

		//Cast variável raioString para float
		float raio = Float.parseFloat(raioString);

		//Aprensenta os valores na tela
		JOptionPane.showMessageDialog(null,"O valor digitado foi "+raio);
		JOptionPane.showMessageDialog(null,"O diâmetro da circunferência é "+ (2*raio));
		JOptionPane.showMessageDialog(null,"O comprimento da circunferência é "+ (2*raio*Math.PI));
		JOptionPane.showMessageDialog(null,"A área da circunferência é "+ (Math.pow(raio,2)*Math.PI));
		
	}
}


