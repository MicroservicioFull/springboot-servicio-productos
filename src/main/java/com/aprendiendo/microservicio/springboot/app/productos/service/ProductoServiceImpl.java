package com.aprendiendo.microservicio.springboot.app.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendiendo.microservicio.springboot.app.productos.dao.IProductoDao;
import com.aprendiendo.microservicio.springboot.app.productos.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoDao productoDao;
	
	@Override
	public List<Producto> getAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto getById(Long id) {
		return productoDao.findById(id).orElse(null);
	}

}
