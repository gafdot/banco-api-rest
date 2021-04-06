package com.gafdot.bancoapirest.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.gafdot.bancoapirest.modelo.Cliente;
import com.gafdot.bancoapirest.modelo.StatusCliente;

public class ClienteDtoGeneralista {

	private String nome;
	private String numeroDeContas;
	private StatusCliente status = StatusCliente.Padrão;
	private Long id;

	public ClienteDtoGeneralista(Cliente cliente) {
		this.nome = cliente.getNome();
		this.id = cliente.getId();
		this.numeroDeContas = String.format("Este cliente possui %d conta(s).", cliente.getContas().size());
		this.status = cliente.getStatus();
	}

	public static List<ClienteDtoGeneralista> converte(List<Cliente> clientes) {
		return clientes.stream().map(ClienteDtoGeneralista::new).collect(Collectors.toList());
	}

}
