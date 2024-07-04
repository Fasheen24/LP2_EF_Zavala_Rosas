package com.example.demo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.ProductoEntity;

import com.example.demo.repository.ProductoRepository;
import com.example.demo.service.ProductoService;


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
		return productoRepository.findById((int) id.longValue()).get();
	}

	@Override
	public ProductoEntity registrarProducto(ProductoEntity productoEntity) {
		// TODO Auto-generated method stub
		return productoRepository.save(productoEntity);
	}

	@Override
	public ProductoEntity editarProducto(ProductoEntity productoEntity) {
		ProductoEntity productoBuscadoEntity = buscarProductoPorId(productoEntity.getProductoId());
		if(productoBuscadoEntity != null) {
			productoBuscadoEntity.setNombre(productoEntity.getNombre());
			productoBuscadoEntity.setPrecio(productoEntity.getPrecio());
			productoBuscadoEntity.setStock(productoEntity.getStock());
			
			return productoRepository.save(productoBuscadoEntity);
		}
		return null;
	}

	@Override
	public void eliminarProducto(Integer productoId) {
		productoRepository.deleteById(productoId);
		
	}


	
}