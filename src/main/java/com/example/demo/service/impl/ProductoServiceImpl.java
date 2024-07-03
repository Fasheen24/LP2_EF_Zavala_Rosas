package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProductoEntity;
import com.example.demo.model.Pedido;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.service.ProductoService;

import jakarta.servlet.http.HttpSession;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<ProductoEntity> buscarTodosProductos() {
		
		return productoRepository.findAll();
		
	}

	@Override
	public ProductoEntity buscarProductoPorId(Integer id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id.longValue()).get();
	}
	
	 @Override
	    public void editarProductoEnCarrito(HttpSession session, Integer productoId, int nuevaCantidad) {
	        List<Pedido> productoSession = (List<Pedido>) session.getAttribute("carrito");
	        if (productoSession != null) {
	            for (Pedido pedido : productoSession) {
	                if (pedido.getProductoId().equals(productoId)) {
	                    pedido.setCantidad(nuevaCantidad);
	                    break;
	                }
	            }
	            session.setAttribute("carrito", productoSession);
	        }
	    }
	    @Override
	    public void eliminarProductoDelCarrito(HttpSession session, Integer productoId) {
	        List<Pedido> productoSession = (List<Pedido>) session.getAttribute("carrito");
	        if (productoSession != null) {
	            productoSession.removeIf(pedido -> pedido.getProductoId().equals(productoId));
	            session.setAttribute("carrito", productoSession);
	        }
	    }
}