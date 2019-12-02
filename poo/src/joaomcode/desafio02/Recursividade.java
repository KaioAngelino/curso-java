package joaomcode.desafio02;

public abstract class Recursividade {
	
	private int numDiv = 0;

	public static int expoente(int numero, int exp) {
		if (exp == 0) {
			return 1;
		} else if (exp > 0) {
			return numero * expoente(numero, exp - 1);
		} else {
			return numero * expoente(numero, exp + 1);
		}
	}

	public static int fatorial(int numero) {
		if (numero == 0) {
			return 1;
		}
		return numero * fatorial(numero - 1);
	}
	
	public static float numeroDeDivisores(int numero) {
		if (numero%2==0) {
			return numero/2;
		} else {

		}
		return numero;
	}

}
