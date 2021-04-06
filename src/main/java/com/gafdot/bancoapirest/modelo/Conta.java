package com.gafdot.bancoapirest.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Cliente cliente;
	private int numero;
	private int agencia;
	private BigDecimal saldo = new BigDecimal("0.0");
	@Enumerated(EnumType.STRING)
	private TipoDeConta tipo;
	private ArrayList<String> investimentos = new ArrayList<String>();
	private ArrayList<String> emprestimos = new ArrayList<String>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public TipoDeConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeConta tipo) {
		this.tipo = tipo;
	}

	public ArrayList<String> getInvestimentos() {
		return investimentos;
	}

	public void setInvestimentos(ArrayList<String> investimentos) {
		this.investimentos = investimentos;
	}

	public ArrayList<String> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(ArrayList<String> emprestimos) {
		this.emprestimos = emprestimos;
	}

}
