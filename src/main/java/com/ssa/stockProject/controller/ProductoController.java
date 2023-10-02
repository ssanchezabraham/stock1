package com.ssa.stockProject.controller;

import com.ssa.stockProject.model.Producto;
import com.ssa.stockProject.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/productos")
public class ProductoController {
    private final ProductoService productoService;
@Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/")
    public List<Producto> obtenerTodosLosProductos(){
        return productoService.obtenerTodosLosProductos();
    }

    @GetMapping("/{productoId}")
    public Optional<Producto> obtenerProductoPorId (@PathVariable int productoId){
        return productoService.obtenerProductoPorId(productoId);
    }

    @PostMapping("/")
    public Producto guardarProducto(@RequestBody Producto producto){
        return productoService.guardarProducto(producto);
    }

    @DeleteMapping("/{productoId}")
    public void eliminarProducto (@PathVariable int productoId){
        productoService.eliminarProducto(productoId);
    }
}
