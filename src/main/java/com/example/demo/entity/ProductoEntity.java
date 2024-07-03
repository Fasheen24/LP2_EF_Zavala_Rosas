package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;

@Entity
@Table(name = "tb_producto")
@ToString
public class ProductoEntity {
	
	
	
	
	public ProductoEntity() {
		super();
	}
	
	
	public ProductoEntity(Long productoId, String nombre, Integer stock, Double precio, String urlImagen) {
		super();
		this.productoId = productoId;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
		this.urlImagen = urlImagen;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productoId;
	
	private String nombre;
	private Integer stock;
	private Double precio;
	private String urlImagen;
	
	public Long getProductoId() {
		return productoId;
	}


	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public String getUrlImagen() {
		return urlImagen;
	}


	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	
	
	
	
}