package com.gafdot.bancoapirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gafdot.bancoapirest.modelo.Conta;
import com.gafdot.bancoapirest.repository.ContaRepository;

@RestController
public class ContaController {

	@Autowired
	private ContaRepository contaRepository;

	@RequestMapping("clientes/{id}/contas")
	public List<Conta> exibeContas(@PathVariable Long id) {
		return contaRepository.findByClienteId(id);
	}
}
