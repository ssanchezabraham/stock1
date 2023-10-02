package com.ssa.stockProject.service;

import com.ssa.stockProject.model.Venta;
import com.ssa.stockProject.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;

    @Autowired
    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public List<Venta> obtenerTodasLasVentas(){
        return ventaRepository.findAll();
    }

    public Optional<Venta> obtenerVentaPorId (int ventaId){
        return ventaRepository.findById(ventaId);
    }

    public Venta guardarVenta(Venta venta){
        return ventaRepository.save(venta);
    }

    public void eliminarVenta (int ventaId){
        ventaRepository.deleteById(ventaId);
    }
}
