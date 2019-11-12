package joaomcode.aula015;

import java.util.Scanner;

public class ContaBancaria {

	// Criação dos atributos
	private int numero;
	private String titular;
	private String senha;
	private double saldo;
	private boolean corrente;
	private boolean poupança;
	private double saldoCorrente;
	private double saldoPoupança;

	Scanner leitor = new Scanner(System.in);

	public ContaBancaria() {
		// TODO Auto-generated constructor stub
	}

	public ContaBancaria(int numero, String titular, String senha, double saldo, boolean corrente, boolean poupanca) {
		this.numero = numero;
		this.titular = titular;
		this.senha = senha;
		if (corrente && saldo > 0) {
			this.saldoCorrente = saldo;
		} else if (poupanca && saldo > 0) {
			this.saldoPoupança = saldo;
		} else if (corrente && poupanca && saldo > 0) {
			this.saldo = saldo;
		}
		this.corrente = corrente;
		this.poupança = poupanca;
	}

	public void saque(double valor) {
		if (corrente && poupança) {
			System.out.println("Digite a opção de onde deseja retirar o dinheiro: ");
			System.out.println("1 - Corrente");
			System.out.println("2 - Poupança");
			int opcao = leitor.nextInt();
			
			switch (opcao) {
				case 1:
					if (this.saldoCorrente >= valor) {
						this.saldoCorrente -= valor;					
					} else {
						System.out.println("Valor insuficiente");
					}
					break;
				case 2:
					if (this.saldoPoupança >= valor) {
						this.saldoPoupança -= valor;					
					} else {
						System.out.println("Valor insuficiente");
					}
						break;
				default:
					break;
			}
						
		} else if (corrente){
			if (this.saldoCorrente >= valor) {
				this.saldoCorrente -= valor;					
			} else {
				System.out.println("Valor insuficiente");
			}
		} else if (poupança) {
			if (this.saldoPoupança >= valor) {
				this.saldoPoupança -= valor;					
			} else {
				System.out.println("Valor insuficiente");
			}
		}
	}

	public void deposito(double valor) {
		if (corrente && poupança) {
			System.out.println("Digite a opção de onde deseja realizar o depósito: ");
			System.out.println("1 - Corrente");
			System.out.println("2 - Poupança");
			int opcao = leitor.nextInt();
			
			switch (opcao) {
				case 1:
					this.saldoCorrente += valor;
					break;
				case 2:
					this.saldoPoupança += valor;
					break;
				default:
					break;
			}
		} else if (corrente){
			this.saldoCorrente += valor;
		} else if (poupança) {
			this.saldoPoupança += valor;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void visualizaSaldo() {
		this.saldo = saldoCorrente + saldoPoupança;
		System.out.println("Seu saldo total é: "+this.saldo);
		System.out.println("Seu saldo na CC: "+saldoCorrente);
		System.out.println("Seu saldo na CP: "+saldoPoupança);
	}

}
