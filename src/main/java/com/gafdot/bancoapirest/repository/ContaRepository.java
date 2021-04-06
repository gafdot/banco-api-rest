package com.gafdot.bancoapirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gafdot.bancoapirest.modelo.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

	public List<Conta> findByClienteId(Long id);
}
