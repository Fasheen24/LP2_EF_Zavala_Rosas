package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;

@Entity
@Table(name = "tb_usuario")

@ToString


public class UsuarioEntity {
	
	
	
	public UsuarioEntity() {
		super();
	}
	
	
	public UsuarioEntity(String correo, String nombre, String celular, String password, String urlImagen) {
		super();
		this.correo = correo;
		this.nombre = nombre;
		this.celular = celular;
		this.password = password;
		this.urlImagen = urlImagen;
	}


	@Id
	private String correo;
	private String nombre;
	private String celular;
	private String password;
	private String urlImagen;
	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUrlImagen() {
		return urlImagen;
	}


	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

		
	
	
	}


