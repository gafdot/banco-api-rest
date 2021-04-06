package com.gafdot.bancoapirest.dto;

import java.time.LocalDateTime;

import com.gafdot.bancoapirest.modelo.Cliente;
import com.gafdot.bancoapirest.modelo.StatusCliente;

public class ClienteDtoDetalhado {

	private Long id;
	private String nome;
	private String contas;
	private String endereco;
	private String cpf;
	private StatusCliente status;
	private LocalDateTime dataDeCriacao;

	public ClienteDtoDetalhado(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.contas = String.format("Este cliente possui %d conta(s).", cliente.getContas().size());
		this.endereco = cliente.getEndereco();
		this.cpf = cliente.getCpf();
		this.status = cliente.getStatus();
		this.dataDeCriacao = cliente.getDataDeCriacao();
	}

}
