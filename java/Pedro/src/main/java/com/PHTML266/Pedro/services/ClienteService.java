package com.PHTML266.Pedro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PHTML266.Pedro.entityes.Cliente;
import com.PHTML266.Pedro.repository.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}

	public Cliente getClienteById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
}
