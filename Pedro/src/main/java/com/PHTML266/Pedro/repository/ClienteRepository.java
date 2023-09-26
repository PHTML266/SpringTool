package com.PHTML266.Pedro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PHTML266.Pedro.entityes.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	// Nenhuma implementação é necessária ...
}
