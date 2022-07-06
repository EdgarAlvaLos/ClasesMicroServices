package com.formacionbdi.springboot.app.productos.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.productos.models.Producto;
//crud repository generic requiere de un generic T del tipo Entidad (Producto) y del Tipo de lo que utilizamos como ID(Long)
//DAO = Data Access Object
public interface ProductoDAO extends CrudRepository<Producto, Long> {
    
}
