package com.formacionbdi.springboot.app.productos.service;

import java.util.List;

import com.formacionbdi.springboot.app.productos.models.Producto;

public interface IProductoService {
    
    public List<Producto> findAll(); 
    public Producto findByid(Long id);
}
