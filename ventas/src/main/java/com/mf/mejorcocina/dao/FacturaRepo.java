package com.mf.mejorcocina.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mf.mejorcocina.domain.Factura;

@Repository
public interface FacturaRepo extends CrudRepository<Factura, Long> {

}
