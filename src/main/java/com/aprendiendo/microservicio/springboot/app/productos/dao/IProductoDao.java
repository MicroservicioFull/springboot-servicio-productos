package com.aprendiendo.microservicio.springboot.app.productos.dao;

import org.springframework.data.repository.CrudRepository;

import com.aprendiendo.microservicio.springboot.app.productos.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

}
