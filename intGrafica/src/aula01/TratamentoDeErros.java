package aula01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeErros {

	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);

		boolean continuar = true;

		do {
			try {
				System.out.print("Digite o dividendo: ");
				int num1 = leitor.nextInt();

				System.out.print("Digite o divisor: ");
				int num2 = leitor.nextInt();

				double resultado = num1 / num2;
				System.out.println(resultado);

				continuar = false;

			} catch (InputMismatchException e1) {
				System.err.println("Digite um número");
				leitor.nextLine();
			} catch (ArithmeticException e1) {
				System.err.println("O divisor não pode ser 0");
				leitor.nextLine();
			} finally {
				System.out.println("end");

			}
		} while (continuar);
	}

}
