package com.aprendiendo.microservicio.springboot.app.productos.service;

import java.util.List;

import com.aprendiendo.microservicio.springboot.app.productos.entity.Producto;

public interface IProductoService {

	public List<Producto> getAll();
	
	public Producto getById(Long id);
}
