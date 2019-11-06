import java.util.Random;
import java.util.Scanner;

public class Dado{

	public static void main(String args[]){
		Scanner leitor = new Scanner(System.in);
		Random aleatorio = new Random();

		System.out.println("Digite o seu palpite.");
		int palpite = leitor.nextInt();

		int resultado  = aleatorio.nextInt(6)+1;
		
		if(palpite == resultado){
			System.out.println(palpite);
			System.out.println(resultado);
			System.out.println("Parabéns acertou!");	
		}else{
			System.out.println(palpite);
			System.out.println(resultado);
			System.out.println("Mais sorte na próxima. Tente novamente");
		}
	}

}
