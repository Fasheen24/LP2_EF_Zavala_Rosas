package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.ToString;

@Entity
@Table(name = "tb_producto")
@ToString
public class ProductoEntity {
	
	
	
	
	public ProductoEntity() {
		super();
	}
	
	



	public ProductoEntity(Integer productoId, String nombre, Integer stock, Double precio, String urlImagen,
			CategoriaEntity categoria) {
		super();
		this.productoId = productoId;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
		this.urlImagen = urlImagen;
		this.categoria = categoria;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productoId;
	
	private String nombre;
	private Integer stock;
	private Double precio;
	private String urlImagen;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private CategoriaEntity categoria;

	public Integer getProductoId() {
		return productoId;
	}


	public void setProductoId(Integer productoId) {
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


	public CategoriaEntity getCategoria() {
		return categoria;
	}


	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
	
	
}