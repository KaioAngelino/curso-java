import java.util.Scanner;
public class EstruturasDeRepeticao{
	
	public static void main(String args[]){
		
		Scanner leitor = new Scanner(System.in);		
			
		int contador=1,numero = 0,resultado = 0;
		
		System.out.println("Qual número deseja gerar a tabuada?");
		
		numero = leitor.nextInt();
			

		while(contador<=10){
			

			resultado = numero*contador;
			
			System.out.println(numero+"*"+contador+"="+resultado);
		
			contador++;	
		
		}		
	
	}

}
