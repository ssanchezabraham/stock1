package com.ssa.stockProject.service;

import com.ssa.stockProject.model.Producto;
import com.ssa.stockProject.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;
@Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> obtenerProductoPorId(int productoId) {
        return productoRepository.findById(productoId);
    }

    public Producto guardarProducto (Producto producto){
        return productoRepository.save(producto);
    }

    public void eliminarProducto (int productoId){
        productoRepository.deleteById(productoId);
    }
}
