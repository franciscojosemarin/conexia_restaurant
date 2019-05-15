package com.mf.mejorcocina.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mf.mejorcocina.domain.Factura;

@Repository
public interface FacturaRepo extends CrudRepository<Factura, Long> {

	@Query("SELECT F FROM Factura F WHERE CONCAT(CONVERT(YEAR(fechaFactura),VARCHAR), CONVERT(MONTH(fechaFactura),VARCHAR)) = ?1 AND idCamarero = ?2")
	public List<Factura> getFacturasMesxCamarero(String mes, Long idCamarero);
}
