package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

	

	
	public Pedido() {
		super();
	}


	public Pedido(Integer cantidad, Integer productoId) {
		super();
		this.cantidad = cantidad;
		this.productoId = productoId;
	}


	private Integer cantidad;
	private Integer productoId;
	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	public Integer getProductoId() {
		return productoId;
	}


	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}
	
	
	
}
