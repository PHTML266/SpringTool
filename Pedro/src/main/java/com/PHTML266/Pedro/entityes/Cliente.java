package com.PHTML266.Pedro.entityes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Clientela")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "Cliente")
	private String ncliente;
	
	@Column(name = "telefone")
	private String fone;
	
	public Long getId() {
		return idcCliente;
	}
	public void setId(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	
	public String getName() {
		return ncliente;
	}
	public void setName(String ncliente) {
		this.ncliente = ncliente;
	}
	
	public String getTelefone() {
		return fone;
	}
	public void setTelefone(String fone) {
		this.fone = fone;
	}
	
}
