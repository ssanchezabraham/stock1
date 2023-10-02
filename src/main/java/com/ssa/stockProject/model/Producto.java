package com.ssa.stockProject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Productos")
public class Producto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    @Column (name = "producto_id")
    private int productoId;

    @Column (name = "nombre_producto")
    private String nombreProducto;

    @Column (name = "descripcion_producto")

    private String descripcion;

    public Producto(String nombreProducto, String descripcion) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
    }

    public Producto() {
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}