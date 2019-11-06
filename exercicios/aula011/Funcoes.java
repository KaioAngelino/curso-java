/*
 * Programa explanação funções
 *
 * Versão: 1.0
 *
 * Data: 06/11/19
 * 
 * Autor: @joaomcode
 *
 */

public class Funcoes {

	// Função que recebe dois valores e retorna o valor da soma deles
	public static int soma(int a, int b) {
		int resultado = a + b;
		return resultado;
	}

	// Função que recebe o raio e retorna o valor do comprimento do circulo
	public static double ComprimentoDoCirculo(double raio) {
		double comprimento = 2*Math.PI*raio;
		return comprimento;
	}

	// Função sem retorno (void) e sem parâmetros
	public static void OlaMundo() {
		System.out.println("Olá Mundo!!!");
	}

	// Função sem retorno (void) com parâmetros
	public static void OlaNome(String nome) {
		System.out.println("Olá "+nome);
	}

	public static double ComprimentoQuadrado(double base, double altura) {
		double comprimento = base*2 + altura*2;
		return comprimento;
	}

	public static double AreaQuadrado(double base, double altura) {
		double area = base * altura;
		return area;
	}

	public static void ComprimentoAreaQuadrado(double base, double altura) {
		double comprimento = base*2 + altura*2;
		double area = base * altura;
		System.out.println(comprimento);
		System.out.println(area);
	}



	// Função principal (main)
	public static void main(String[] args){
		// Imprime na tela o valor da soma entre 25 e 15
		System.out.println(soma(25,15));

		// Chama a função OlaMundo
		OlaMundo();

		// Chama a função OlaNome
		OlaNome("joaomcode");

		// Chama a função ComprimentoDoCirculo
		System.out.println(ComprimentoDoCirculo(5));

		System.out.println(ComprimentoQuadrado(3,4));
		System.out.println(AreaQuadrado(3,4));

		ComprimentoAreaQuadrado(4,5);
	}
}


