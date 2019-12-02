package com.osvaldo.cursojava.aula23;

public enum Calculadora {
	//Soma, Subtração, Multiplicação, Divisão;
	//atributo símbolo, ou sinal.
	SOMA('+'){
		
		double executa(double x, double y){
			return x + y;
		}
		
	},
	
	SUBTRACAO('-'){
		
		double executa(double x, double y){
			return x - y;
		}
		
	},
	
	MULTIPLICACAO('*'){
		
		double executa(double x, double y){
			return x * y;
		}
		
	},
	
	DIVISAO('/'){
		
		double executa(double x, double y){
			return x / y;
		}
		
	};
	
	private char sinal;
	
	Calculadora(char sinal){
		this.sinal = sinal;
	}
	
	abstract double executa(double x, double y);
}
