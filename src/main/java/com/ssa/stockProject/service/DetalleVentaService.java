package com.ssa.stockProject.service;

import com.ssa.stockProject.model.DetalleVenta;
import com.ssa.stockProject.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaService {

    private final DetalleVentaRepository detalleVentaRepository;
@Autowired
    public DetalleVentaService(DetalleVentaRepository detalleVentaRepository) {
        this.detalleVentaRepository = detalleVentaRepository;
    }

    public List<DetalleVenta> obtenerTodoslosDetallesVenta(){
        return detalleVentaRepository.findAll();
    }

    public Optional<DetalleVenta> obtenerDetalleVentaPorId(int detalleId){
        return detalleVentaRepository.findById(detalleId);
    }

    public DetalleVenta guardarDetalleVenta (DetalleVenta detalleVenta){
        return detalleVentaRepository.save(detalleVenta);
    }

    public void eliminarDetalleVenta (int detalleId){
        detalleVentaRepository.deleteById(detalleId);
    }

    public List<DetalleVenta> obtenerTodoslosDetallesPorVentaId(int ventaId){
        return detalleVentaRepository.findByVentaId(ventaId);
    }

}