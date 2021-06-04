package com.equifax.dev.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE_PRODUCTO")
public class ClienteProducto {
	
	@Id
	private Long id;
	
	private Long idCliente;
	
	private Long idProducto;
	
	public ClienteProducto() {
		
	}	

	public ClienteProducto(Long idCliente, Long idProducto) {
		super();
		this.idCliente = idCliente;
		this.idProducto = idProducto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
}
