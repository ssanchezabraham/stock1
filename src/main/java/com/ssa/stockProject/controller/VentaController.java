package com.ssa.stockProject.controller;

import com.ssa.stockProject.model.Venta;
import com.ssa.stockProject.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ventas")
public class VentaController {
    private final VentaService ventaService;

    @Autowired
    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping("/")
    public List<Venta> obtenerTodasLasVentas() {
        return ventaService.obtenerTodasLasVentas();
    }

    @GetMapping("/{ventaId}")
    public Optional<Venta> obtenerVentaPorId(@PathVariable int ventaId){
        return ventaService.obtenerVentaPorId(ventaId);
    }

    @PostMapping("/")
    public Venta guardarVenta(@RequestBody Venta venta) {
        return ventaService.guardarVenta(venta);
    }

    @DeleteMapping("/")
    public void eliminarVenta (@PathVariable int ventaId){
        ventaService.eliminarVenta(ventaId);
    }
}