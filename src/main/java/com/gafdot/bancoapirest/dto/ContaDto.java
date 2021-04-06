package com.gafdot.bancoapirest.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.gafdot.bancoapirest.modelo.Conta;
import com.gafdot.bancoapirest.modelo.TipoDeConta;

public class ContaDto {

	private Long id;
	private int numero;
	private int agencia;
	private BigDecimal saldo;
	private TipoDeConta tipo;
	private String numeroDeInvestimentos;
	private String numeroDeEmprestimos;

	public ContaDto(Conta conta) {
		this.id = conta.getId();
		this.numero = conta.getNumero();
		this.agencia = conta.getAgencia();
		this.saldo = conta.getSaldo();
		this.tipo = conta.getTipo();
		this.numeroDeInvestimentos = String.format("Esta conta possui %d investimento(s).",
				conta.getInvestimentos().size());
		this.numeroDeEmprestimos = String.format("Esta conta possui %d emprestimos(s).", conta.getEmprestimos().size());
	}

	public static List<ContaDto> converte(List<Conta> contas) {
		return contas.stream().map(ContaDto::new).collect(Collectors.toList());
	}

}
