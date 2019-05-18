package com.mf.mejorcocina.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mf.mejorcocina.domain.DetalleFactura;

@Repository
public interface DetalleFacturaRepo extends CrudRepository<DetalleFactura, Long> {

	@Query("SELECT DF FROM DetalleFactura DF WHERE idFactura IN (?1)")
	public List<DetalleFactura> getFacturasMesxCamarero(List<Long> idsFactura);
}
