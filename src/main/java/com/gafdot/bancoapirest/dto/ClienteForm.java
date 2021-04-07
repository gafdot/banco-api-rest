package com.gafdot.bancoapirest.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.gafdot.bancoapirest.modelo.Cliente;

public class ClienteForm {

	@NotEmpty
	@Size(min = 5)
	private String nome;
	@NotEmpty
	@Size(min = 10)
	private String endereco;
	@NotEmpty
	@Size(min = 11, max = 11)
	private String cpf;

	public Cliente converte() {
		return new Cliente(nome, endereco, cpf);
	}

	public ClienteForm() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ClienteDtoDetalhado alterar(Cliente cliente) {
		cliente.setNome(this.nome);
		cliente.setCpf(this.cpf);
		cliente.setEndereco(this.endereco);
		return new ClienteDtoDetalhado(cliente);
	}

}
