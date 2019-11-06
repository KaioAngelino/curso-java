
import java.util.Random;

public class CartasBaralhoAleatoria {
	public static void main (String[] args){
		// Instancia um objeto da classe Random usando o construtor padrão
		Random gerador = new Random();
		
		// Criação dos Arrays
		String carta[] = {"Ás","2","3","4","5","6","7","8","9","10","Valete","Rainha","Rei"};
		String naipe[] = {"Ouro","Copas","Espadas","Paus"};
		
		// Apresenta os valores na tela
		// carta[gerador.nextInt(carta.length) traduzido abaixo
		// carta[indice]
		// indice = gerador.nextInt(tamanhoVetorCartas) 
		// tamanhoVetorCartas = carta.length
		// O mesmo padrão serve para naipe[gerador.nextInt(naipe.length)
		System.out.println(carta[gerador.nextInt(carta.length)]+" de "+naipe[gerador.nextInt(naipe.length)]);
	}
}
