package com.ssa.stockProject.model;

import jakarta.persistence.*;

@Entity
@Table (name = "Detalles_Venta")
public class DetalleVenta {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "detalle_id")
    private int detalleId;

    @ManyToOne
    @JoinColumn (name = "venta_id")
    private Venta venta;

    @ManyToOne
    @JoinColumn (name = "producto_id")
    private Producto producto;

    @Column (name = "cantidad_vendida")
    private int cantidadVendida;

    @ManyToOne
    @JoinColumn (name = "precio_unitario_venta_id")
    private PrecioVenta precioUnitarioVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(Venta venta, Producto producto, int cantidadVendida, PrecioVenta precioUnitarioVenta) {
        this.venta = venta;
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.precioUnitarioVenta = precioUnitarioVenta;
    }

    public int getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(int detalleId) {
        this.detalleId = detalleId;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public PrecioVenta getPrecioUnitarioVenta() {
        return precioUnitarioVenta;
    }

    public void setPrecioUnitarioVenta(PrecioVenta precioUnitarioVenta) {
        this.precioUnitarioVenta = precioUnitarioVenta;
    }
}
