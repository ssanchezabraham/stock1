package com.ssa.stockProject.repository;

import com.ssa.stockProject.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository <Venta, Integer> {

}
