package com.osvaldo.cursojava.aula23;

public class EnumTeste {

	public static void main(String[] args) {
		
		MesesDoAno m1 = MesesDoAno.JANEIRO;
		MesesDoAno m3 = MesesDoAno.MARCO;
		
		double x = 7, y = 3;
		
		//double resultado = Calculadora.SOMA.executa(x, y);
		
		//System.out.println(resultado);
		
		//resultado = Calculadora.SUBTRACAO.executa(x, y);
		
		//System.out.println(resultado);
		
		//resultado = Calculadora.MULTIPLICACAO.executa(x, y);
		
		//System.out.println(resultado);
		
		//resultado = Calculadora.DIVISAO.executa(x, y);
		
		//System.out.println(resultado);
			
		//System.out.println(m1+" "+m1.getNum());
		//System.out.println(m3+" "+m3.getNum());
		
		//mostraMes(m1);
		//==
		//for(MesesDoAno meses: MesesDoAno.values()){
		//	mostraMes(meses);
		//}
		
		Pessoa pf = new Pessoa(TipoDeDocumento.CPF);
		
		System.out.println(pf.documento);
		
		Pessoa pj = new Pessoa(TipoDeDocumento.CNPJ);
		
		System.out.println(pj.documento);
		
	}

	public static void mostraMes(MesesDoAno mes){
		switch(mes){
			case JANEIRO:System.out.println("Janeiro");
			break;
			case FEVEREIRO:System.out.println("Fevereiro");
			break;
			case MARCO:System.out.println("Março");
			break;
			case ABRIL:System.out.println("Abril");
			break;
			case MAIO:System.out.println("Maio");
			break;
			case JUNHO:System.out.println("Junho");
			break;
			case JULHO:System.out.println("Julho");
			break;
			case AGOSTO:System.out.println("Agosto");
			break;
			case SETEMBRO:System.out.println("Setembro");
			break;
			case OUTUBRO:System.out.println("Outubro");
			break;
			case NOVEMBRO:System.out.println("Novembro");
			break;
			case DEZEMBRO:System.out.println("Dezembro");
			break;
		}
	}
}
