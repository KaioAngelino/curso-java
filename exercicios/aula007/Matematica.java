public class Matematica{
	public static void main(String args[]){
		/*
		 * sqrt, cbrt (raiz quadrada e raiz cubica).	
		 * ceil, floor, round (arredondar para cima, arredondar para baixo, arredondar).	
                 * random(), (gera número aleatório).
		 */
		double n1 = Math.PI;
		/*	Fazer um algoritmo de menu aonde o usuário. Digite uma opção na qual
			é redirecionado para uma das opções abaixo:
			1 - round
			2 - floor
			3 - ceil
			4 - raíz quadrada
			5 - raíz cúbica
			6 - exponencial		
		*/
		
		System.out.println(n1);
		System.out.println(Math.floor(n1));
		System.out.println(Math.ceil(n1));
		System.out.println(Math.round(n1));
		System.out.println(Math.sqrt(1024));
		System.out.println(Math.cbrt(27));
		System.out.println(Math.pow(9,2));
		System.out.println((int)(Math.random()*15)+4);
		

	
	}
}
