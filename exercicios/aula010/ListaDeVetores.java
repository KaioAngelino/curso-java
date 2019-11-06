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
		
		cadastro.add("João");
		cadastro.remove(0);
		cadastro.add("Zé");
		cadastro.add("Capetinha");
		cadastro.add("1 2 3");
		cadastro.add("até");
		
		System.out.println(cadastro);
	}
}


