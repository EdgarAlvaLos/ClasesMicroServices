package com.formacionbdi.springboot.app.productos.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity //Declaramos que es una Entidad 
@Table(name = "productos")//nombre de nuestra tabla en DB
public class Producto implements Serializable{

    @Id //declaramos que nuestro Long id como ID 
    @GeneratedValue(strategy = GenerationType.IDENTITY)//fk de nuestro ID autogenerado
    private Long id;
    private String name;
    private Double price;

    @Column(name = "created_at") //notacion, identifica el row en la db y lo esta mapeando a variable en java
    @Temporal(TemporalType.DATE) //declarado para la persistencia de objectosdel tipo DATE y Calendar
    private Date createdAt;

    public Producto() {
    }

    public Producto(Long id, String name, Double price, Date createdAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Producto id(Long id) {
        setId(id);
        return this;
    }

    public Producto name(String name) {
        setName(name);
        return this;
    }

    public Producto price(Double price) {
        setPrice(price);
        return this;
    }

    public Producto createdAt(Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id) && Objects.equals(name, producto.name) && Objects.equals(price, producto.price) && Objects.equals(createdAt, producto.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, createdAt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            "}";
    }

}