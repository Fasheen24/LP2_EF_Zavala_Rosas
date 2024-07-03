package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ProductoEntity;

import jakarta.servlet.http.HttpSession;

public interface ProductoService {
	List<ProductoEntity>buscarTodosProductos();
	ProductoEntity buscarProductoPorId(Integer id);
	void editarProductoEnCarrito(HttpSession session, Integer productoId, int nuevaCantidad);
    void eliminarProductoDelCarrito(HttpSession session, Integer productoId);
}
