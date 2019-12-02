package com.osvaldo.cursojava.aula23;

public class Pessoa {
	private TipoDeDocumento nomeDocumento;
	private TipoDeDocumento tipoDocumento;
	public String documento;
	
	Pessoa(TipoDeDocumento tipodedocumento){
		this.tipoDocumento = tipodedocumento;
		documento = tipodedocumento.geraCpfCnpj();
	}
}
