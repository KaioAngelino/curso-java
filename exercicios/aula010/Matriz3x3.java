/*
 *Class: Class modelo
 *
 *Versão: 1.0
 *
 *Data: 05/11/19
 * 
 *Autor: joaomcode
 *
 */

import java.util.Random;

public class Matriz3x3 {
	public static void main(String[] args){
		// Instancia um objeto da classe Random usando o construtor padrão
		Random gerador = new Random();
		
		// Intancia um objeto do tipo Array de 3x3 posições
		int numeros[][] = new int[3][3];
		
		
		// Criação de um vetor 3x3 para mostrar na tela suas posições
		// Varredura das linhas
		for(int i = 0; i < numeros.length; i++){
			// Varredura das colunas
			for (int j = 0; j < numeros[i].length;j++){
				// Imprime na tela a posição do vetor
				System.out.print((i+1)+"x"+(j+1)+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		// Varredura das linhas
		for(int i = 0; i < numeros.length; i++){
			// Varredura das colunas
			for (int j = 0; j < numeros[i].length;j++){
				// Geração de números aleatórios
				numeros[i][j] = gerador.nextInt(60);
				// Apresenta na tela os números gerados
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println("");
		}
	}
}


