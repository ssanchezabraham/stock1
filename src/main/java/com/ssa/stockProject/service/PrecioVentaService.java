package com.ssa.stockProject.service;

import com.ssa.stockProject.model.PrecioVenta;
import com.ssa.stockProject.repository.PrecioVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PrecioVentaService {

    private final PrecioVentaRepository precioVentaRepository;
@Autowired
    public PrecioVentaService(PrecioVentaRepository precioVentaRepository) {
        this.precioVentaRepository = precioVentaRepository;
    }

    public List<PrecioVenta> obtenerTodosLosPreciosVenta (){
        return precioVentaRepository.findAll();
    }

    public Optional<PrecioVenta> obtenerPrecioVentaPorId (int precioId){
        return precioVentaRepository.findById(precioId);
    }

    public PrecioVenta guardarPrecioVenta (PrecioVenta precioVenta) {
        return precioVentaRepository.save(precioVenta);
    }

    public void eliminarPrecioVenta (int precioId){
        precioVentaRepository.deleteById(precioId);
    }
}