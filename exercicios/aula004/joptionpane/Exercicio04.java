/**
 * Desenvolva um algoritmo em Java que calcule descontos em uma determinada compra
 * após pedir o valor do produto e a porcentagem do desconto
 *
 * Versão: 1.0
 *
 * Data: 26/10/19
 * 
 * Autor: joaomcode
 *
 */

import javax.swing.JOptionPane;

public class Exercicio04 {
	public static void main(String[] args){
		//Solicita ao usuário o valor do preço e desconto
		String precoString = JOptionPane.showInputDialog("Digite o valor do preço do produto: ");
		String descontoString = JOptionPane.showInputDialog("Digite o valor da porcentagem do desconto a ser aplicado no produto: ");

		//Cast das variáveis descontoString para int e precoString para float
		int desconto = Integer.parseInt(descontoString);
		float preco = Float.parseFloat(precoString);

		//Cálculo do desconto
		float precoFinal = preco * (100 - (float) desconto)/100;

		//Aprensenta os valores na tela
		JOptionPane.showMessageDialog(null,"O valor digitado foi "+preco+" e o desconto é de "+desconto+"%");
		JOptionPane.showMessageDialog(null,"O valor final é "+ precoFinal);
	}
}


