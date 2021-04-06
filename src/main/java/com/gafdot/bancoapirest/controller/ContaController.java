package com.gafdot.bancoapirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gafdot.bancoapirest.dto.ContaDto;
import com.gafdot.bancoapirest.repository.ContaRepository;

@RestController
public class ContaController {

	@Autowired
	private ContaRepository contaRepository;

	@RequestMapping("clientes/{id}/contas")
	public List<ContaDto> exibeContas(@PathVariable Long id) {
		return ContaDto.converte(contaRepository.findByClienteId(id));
	}
}
