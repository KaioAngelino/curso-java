/*
 *Programa de leitura dos dados do usuário
 *
 *Versão: 1.0
 *
 *Data: 24/10/2019
 * 
 *Autor: joaomcode
 *
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LeituraGrafico {
	public static void main(String[] args){

		//Utilizando JOptionPane para receber os valores digitados pelo usuário
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String endereco = JOptionPane.showInputDialog("Digite seu endereço");
		String idade = JOptionPane.showInputDialog("Digite sua idade");
		String altura = JOptionPane.showInputDialog("Digite sua altura");

		//System.out.println("Bem vindo "+nome+"\nIdade: "+idade+"\nEndereço: "+endereco+"\nAltura: "+altura);

		//JOptionPane.showMessageDialog(null, "Seu nome é " +nome);

		if(JOptionPane.showConfirmDialog(null, "O seu nome é " +nome)==0){
			JOptionPane.showMessageDialog(null, "YEAH!!!");
		}
	}
}


