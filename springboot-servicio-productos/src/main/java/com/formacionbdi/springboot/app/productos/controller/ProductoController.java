package com.formacionbdi.springboot.app.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.productos.models.Producto;
import com.formacionbdi.springboot.app.productos.service.IProductoService;


@RestController //Notacion indicamos que es un Controlador rest de spring
public class ProductoController {
    @Autowired //Inyeccion de dependencias de manera Automatica
    private IProductoService iProductoService; //la Implementacion de Nuestro Service

    @GetMapping("/listar") //Notacion para mapear end point a los metodos esperados
    public List<Producto> listar(){ //Metodo Comun y corriente para ejecutar metodos de nuestro Service
        return iProductoService.findAll();
    }
    
    @GetMapping("/ProductoById/{id}")
       public Producto detalle(@PathVariable Long id){
        return iProductoService.findByid(id);
    }

}