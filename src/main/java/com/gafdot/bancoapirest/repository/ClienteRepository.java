package com.gafdot.bancoapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gafdot.bancoapirest.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
