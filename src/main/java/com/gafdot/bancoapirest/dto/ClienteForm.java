package com.gafdot.bancoapirest.dto;

import com.gafdot.bancoapirest.modelo.Cliente;

public class ClienteForm {

	private String nome;
	private String endereco;
	private String cpf;

	public Cliente converte() {
		return new Cliente(nome, endereco, cpf);
	}

}
