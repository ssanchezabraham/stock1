package com.ssa.stockProject.repository;

import com.ssa.stockProject.model.PrecioVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecioVentaRepository extends JpaRepository<PrecioVenta, Integer> {
}
