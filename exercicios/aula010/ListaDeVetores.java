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

import java.util.Arrays;
import java.util.ArrayList;

public class ListaDeVetores {
	public static void main(String[] args){
		
		ArrayList<String> cadastro = new ArrayList<>();
		
		// Adiciona o valor dentro da lista
		cadastro.add("João");
		
		// Remove o valor da posição indicada
		cadastro.remove(0);
		
		cadastro.add("Zé");
		cadastro.add("Luiz");
		
		// Adiciona o valor dentro da lista na posição indicada
		cadastro.add(1,"Paulo");
		cadastro.add(0,"Karine");
		
		// Mostra na tela a lista
		System.out.println(cadastro);
		
		// Limpa a lista
		cadastro.clear();
		
		
		cadastro.add("Luiz");
		cadastro.add("Paulo");
		
		// Mostra na tela a lista
		System.out.println(cadastro);
		
		// Faz uma busca na lista o nome digitado (Luiz)
		System.out.println(cadastro.contains("Luiz"));		
		System.out.println(cadastro.contains("João"));		
		// Retorna a posição na lista o nome digitado (Luiz)
		System.out.println(cadastro.indexOf("Luiz"));
		// Mostra na tela o tamanho da lista
		System.out.println(cadastro.size());		
		
		
	}
}


