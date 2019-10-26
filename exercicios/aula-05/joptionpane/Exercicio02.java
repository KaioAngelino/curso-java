/**
 * Desenvolva um algoritmo em Java que leia a idade de uma pessoa expressa em anos,
 * meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias
 * e o mês com 30. (EX.: 3 anos, 2 meses e 15 dias = 1170 dias.)
 * 
 *
 * Versão: 1.0
 *
 * Data: 25/10/19
 * 
 * Autor: joaomcode
 *
 */

import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args){

		//Solicita ao usuário a idade dele
		String anoString = JOptionPane.showInputDialog("Qual sua idade?");
		//Solicita ao usuário a quantos meses ele tem
		String mesesString = JOptionPane.showInputDialog("Quantos meses?");
		//Solicita ao usuário quantos dias ele tem
		String diasString = JOptionPane.showInputDialog("E dias?");

		//Cast das variáveis do sistema
		int anos = Integer.parseInt(anoString);
		int meses = Integer.parseInt(mesesString);
		int dias = Integer.parseInt(diasString);


		//Cálculo de quantos dias o cliente possui de vida
		int diasDeVida =  anos*365 + meses*30 + dias;


		//Aprensenta os valores na tela
		JOptionPane.showMessageDialog(null,"Você tem "+anos+" anos "+meses+" meses e "+dias+" dias de vida.");
		JOptionPane.showMessageDialog(null,"Sua idade em dias é: "+diasDeVida);
	}
}


