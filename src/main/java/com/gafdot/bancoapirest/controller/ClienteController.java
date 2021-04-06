package com.gafdot.bancoapirest.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.gafdot.bancoapirest.dto.ClienteDtoDetalhado;
import com.gafdot.bancoapirest.dto.ClienteDtoGeneralista;
import com.gafdot.bancoapirest.dto.ClienteForm;
import com.gafdot.bancoapirest.modelo.Cliente;
import com.gafdot.bancoapirest.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping
	public List<ClienteDtoGeneralista> listaClientes() {
		return ClienteDtoGeneralista.converte(clienteRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<ClienteDtoDetalhado> exibe(@PathVariable Long id) {
		Optional<Cliente> optional = clienteRepository.findById(id);
		if (optional.isPresent()) {
			return ResponseEntity.ok(new ClienteDtoDetalhado(optional.get()));
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	public ResponseEntity<ClienteDtoDetalhado> cadastrar(@RequestBody @Valid ClienteForm form,
			UriComponentsBuilder uriBuilder) {
		Cliente cliente = form.converte();
		clienteRepository.save(cliente);
		URI uri = uriBuilder.path("/clientes/{id}").buildAndExpand(cliente.getId()).toUri();
		return ResponseEntity.created(uri).body(new ClienteDtoDetalhado(cliente));
	}
}
