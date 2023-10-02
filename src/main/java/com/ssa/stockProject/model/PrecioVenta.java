package com.ssa.stockProject.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table (name = "Precios_Venta")
public class PrecioVenta {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "precio_id")
    private int precioId;

    @ManyToOne
    @JoinColumn (name = "producto_id")
    private Producto producto;

    @Column (name = "precio_unitario_venta")
    private BigDecimal precioUnitarioVenta;

    @Column (name = "fecha_inicio")
    private Date fechaInicio;

    public PrecioVenta(Producto producto, BigDecimal precioUnitarioVenta, Date fechaInicio) {
        this.producto = producto;
        this.precioUnitarioVenta = precioUnitarioVenta;
        this.fechaInicio = fechaInicio;
    }

    public PrecioVenta() {
    }

    public int getPrecioId() {
        return precioId;
    }

    public void setPrecioId(int precioId) {
        this.precioId = precioId;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public BigDecimal getPrecioUnitarioVenta() {
        return precioUnitarioVenta;
    }

    public void setPrecioUnitarioVenta(BigDecimal precioUnitarioVenta) {
        this.precioUnitarioVenta = precioUnitarioVenta;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}