package com.ssa.stockProject.controller;

import com.ssa.stockProject.model.PrecioVenta;
import com.ssa.stockProject.service.PrecioVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/preciosventa")
public class PrecioVentaController {

    private final PrecioVentaService precioVentaService;
@Autowired
    public PrecioVentaController(PrecioVentaService precioVentaService) {
        this.precioVentaService = precioVentaService;
    }

    @GetMapping("/")
    public List<PrecioVenta> obtenerTodosLosPreciosVenta (){
        return precioVentaService.obtenerTodosLosPreciosVenta();
    }

    @GetMapping("/{precioId}")
    public Optional<PrecioVenta> obtenerPrecioVentaPorId (@PathVariable int precioId){
        return precioVentaService.obtenerPrecioVentaPorId(precioId);
    }

    @PostMapping("/")
    public PrecioVenta guardarPrecioVenta (@RequestBody PrecioVenta precioVenta){
        return precioVentaService.guardarPrecioVenta(precioVenta);
    }

    @DeleteMapping("/{precioId}")
    public void eliminarPrecioVenta (@PathVariable int precioId){
        precioVentaService.eliminarPrecioVenta(precioId);
    }
}