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


//Importa da classe Scanner que se encontra no pacote java.util
import java.util.Scanner;

//Importa a classe JOptionPane que se encontra no pacote javax.swing
import javax.swing.JOptionPane;

public class LeituraGrafico {

	//Método principal "main"
	public static void main(String[] args){

		//Utiliza a classe JOptionPane para receber os valores digitados pelo usuário
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String endereco = JOptionPane.showInputDialog("Digite seu endereço");
		String idade = JOptionPane.showInputDialog("Digite sua idade");
		String altura = JOptionPane.showInputDialog("Digite sua altura");

		//Apresenta os valores digitados pelo usuário numa caixa estilo pop-up
		JOptionPane.showMessageDialog(null, "Seu nome é " +nome+"\nLogradouro: "+endereco+"\nIdade: "+idade+"\nAltura: "+altura);
	}//fim main
}//fim classe LeituraGrafico


