package projeto.algoritmo;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleDeSala {

	public static int id;
	public static int opcao;
	public static double soma[] = new double[50];
	public static double media[] = new double[50];
	public static boolean controle;
	public static String notas[][] = new String[50][4];
	public static ArrayList<String> cadastro = new ArrayList<String>();

	// Intanciar um objeto
	public static Scanner leitor = new Scanner(System.in);

	public static void limpaTela() {
		System.out.printf("\n");
	}

	public static int telaPrincipal() {
		System.out.println("-----------------------------");
		System.out.println("     Sistema de Controle     ");
		System.out.println("-----------------------------");
		System.out.println("1 - Cadastrar aluno");
		System.out.println("2 - Lançar notas");
		System.out.println("3 - Resultado final");
		System.out.println("4 - Sair");
		return opcao = leitor.nextInt();
	}

	public static void cadastrar() {
		System.out.println("-----------------------------");
		System.out.println("     Cadastro de Alunos      ");
		System.out.println("-----------------------------");
		System.out.print("Digite o nome do aluno: ");
		cadastro.add(leitor.next());
	}

	public static void mostrarCadastrados() {
		int i = 0;
		for (String s : cadastro) {
			System.out.print(++i + " - " + s + " ");
			i--;
			// Laço para imprimir as notas
			for (int j = 0; j < 4; j++) {
				// Confere se as notas foram lançadas
				if (notas[i][j] != null) {
					// Imprime as notas
					System.out.print(notas[i][j] + " ");
				}
			}
			i++;
			System.out.println(" ");
		}
	}

	public static void lancarNotas() {
		mostrarCadastrados();
		limpaTela();
		System.out.println("Digite o código do aluno:");
		id = leitor.nextInt();
		limpaTela();
		System.out.println("Lançar as notas de " + cadastro.get(--id));
		// Lanço para lançar notas
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite a " + ++i + "ª nota: ");
			notas[id][--i] = leitor.next();
		}
	}

	public static void continuarLancandoNotas() {
		while (opcao != 0) {
			limpaTela();
			System.out.println("Deseja lançar nota de outro aluno?");
			System.out.println("1 - Sim:");
			System.out.println("0 - Não");
			opcao = leitor.nextInt();
			if (opcao == 0) {
				break;
			} else if (opcao == 1) {
				limpaTela();
				lancarNotas();
			} else {
				System.out.println("Opção inválida! Digite Novamente");
			}
		}
	}

	public static void resultadoFinal() {
		int i = 0;
		for (String s : cadastro) {
			System.out.print(++i + " - " + s + " ");
			i--;
			for (int j = 0; j < 4; j++) {
				if (notas[i][j] != null) {
					soma[j] = Double.valueOf(notas[i][j]);
				}
			}
			media[i] = (soma[0] + soma[1] + soma[2] + soma[3]) / 4;
			if (notas[i][3] != null) {
				System.out.print(media[i] + " ");
				if (media[i] >= 7) {
					System.out.print("Aprovado");
				} else if (media[i] > 3) {
					System.out.print("Recuperação");
				} else {
					System.out.print("Reprovado");
				}
			}
			System.out.println("");
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (!controle) {
			switch (telaPrincipal()) {
			case 1:
				limpaTela();
				cadastrar();
				break;
			case 2:
				limpaTela();
				lancarNotas();
				continuarLancandoNotas();
				break;
			case 3:
				limpaTela();
				mostrarCadastrados();
				limpaTela();
				resultadoFinal();
				break;
			case 4:
				controle = true;
				break;
			default:
				break;
			}
			limpaTela();
		}

	}

}
