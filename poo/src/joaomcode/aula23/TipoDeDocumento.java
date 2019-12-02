package com.osvaldo.cursojava.aula23;

public enum TipoDeDocumento {

	CPF{
		
		String geraCpfCnpj() {
			// TODO Auto-generated method stub
			GeraCpfCnpj gerador = new GeraCpfCnpj();
			String cpf = gerador.cpf(true);
			return cpf;
		}
	},CNPJ{
		
		String geraCpfCnpj() {
			// TODO Auto-generated method stub
			GeraCpfCnpj gerador = new GeraCpfCnpj();
			gerador.cnpj(true);
			String cnpj = gerador.cnpj(true);
			return cnpj;
		}
	};
	
	
	
	abstract String geraCpfCnpj();
	
}
