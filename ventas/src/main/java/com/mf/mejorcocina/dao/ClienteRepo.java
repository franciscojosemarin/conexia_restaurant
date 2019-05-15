package com.mf.mejorcocina.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mf.mejorcocina.domain.Cliente;

@Repository
public interface ClienteRepo extends CrudRepository<Cliente, Long> {

	@Query("SELECT C FROM Cliente C WHERE C.idCliente IN (SELECT F.idCliente FROM Factura F "
			+ "INNER JOIN DetalleFactura df ON df.idFactura = F.idFactura "
			+ " GROUP BY F.idCliente HAVING SUM(df.importe) > ?1)")
	public List<Cliente> getClientesDerrochadores(Double monto);
}
