package com.mf.mejorcocina.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mf.mejorcocina.domain.DetalleFactura;

@Repository
public interface DetalleFacturaRepo extends CrudRepository<DetalleFactura, Long> {

}
