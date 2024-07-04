package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_Categoria")
public class CategoriaEntity {
	
	
	public CategoriaEntity() {
		super();
	}
	
	
	public CategoriaEntity(Integer idcate, String nomcate) {
		super();
		this.idcate = idcate;
		this.nomcate = nomcate;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcate;
	@Column(name = "Nombre Categria")
	private String nomcate;
	public Integer getIdcate() {
		return idcate;
	}


	public void setIdcate(Integer idcate) {
		this.idcate = idcate;
	}


	public String getNomcate() {
		return nomcate;
	}


	public void setNomcate(String nomcate) {
		this.nomcate = nomcate;
	}
	
	

}
