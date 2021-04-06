package com.gafdot.bancoapirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gafdot.bancoapirest.modelo.Cliente;
import com.gafdot.bancoapirest.repository.ClienteRepository;

@Controller
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@RequestMapping("/clientes")
	@ResponseBody
	public List<Cliente> listaClientes() {
		return clienteRepository.findAll();
	}
}
