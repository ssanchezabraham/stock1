package com.ssa.stockProject.controller;

import com.ssa.stockProject.model.DetalleVenta;
import com.ssa.stockProject.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detallesventa")
public class DetalleVentaController {
    private final DetalleVentaService detalleVentaService;
@Autowired
    public DetalleVentaController(DetalleVentaService detalleVentaService) {
        this.detalleVentaService = detalleVentaService;
    }

    @GetMapping("/")
    public List<DetalleVenta> obtenerTodosLosDetallesVenta(){
        return detalleVentaService.obtenerTodoslosDetallesVenta();
    }

    @GetMapping("/{detalleId}")
    public Optional<DetalleVenta> obtenerDetalleVentaPorId(@PathVariable int detalleId){
        return detalleVentaService.obtenerDetalleVentaPorId(detalleId);
    }

    @PostMapping("/")
    public DetalleVenta guardarDetalleVenta (@RequestBody DetalleVenta detalleVenta){
        return detalleVentaService.guardarDetalleVenta(detalleVenta);
    }

    @DeleteMapping("/{detalleId}")
    public void eliminarDetalleVenta (@PathVariable int detalleId){
        detalleVentaService.eliminarDetalleVenta(detalleId);
    }

    @GetMapping("/porventa/{ventaId}")
    public List<DetalleVenta> obtenerDetalleVentaPorVentaId (@PathVariable int ventaId){
        return detalleVentaService.obtenerTodoslosDetallesPorVentaId(ventaId);
    }

}