package joaomcode.aula017;

public class Recursividade {

	public static double fatorialNR(int num) {
		double resultado = 1;

		while (num > 0) {
			resultado *= num;
			num--;
		}

		return resultado;
	}

	public static double fibonacci(int num) {
		if (num < 1)
			return 1;

		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	public static double fatorialR(int num) {
		if (num < 1)
			return 1;

		return num * fatorialR(num - 1);
	}

	public static double soma(int num) {
		if (num < 1)
			return 0;

		return num + soma(num - 1);
	}

	public static void inverte(int vetor[], int esq, int dir) {
		if (esq > dir)
			return;

		int temp = vetor[esq];
		vetor[esq] = vetor[dir];
		vetor[dir] = temp;

		inverte(vetor, esq + 1, dir - 1);
	}

}
