package joaomcode.aula017;

public class TestaRecursividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Recursividade.fatorialNR(5));
		
		System.out.println(Recursividade.fatorialR(5));
		
		System.out.println(Recursividade.soma(3));
		
		int numeros[] = {0,1,2,3,4,5};
		
		Recursividade.inverte(numeros, 0, 5);
		
		for (int n : numeros) {
			System.out.print(n+" ");
		}
		
	}

}
