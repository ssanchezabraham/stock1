package com.ssa.stockProject.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "venta_id")
    private int ventaId;

    @Column (name = "fecha_venta")
    private Date fechaVenta;

    public Venta() {
    }

    public Venta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
}