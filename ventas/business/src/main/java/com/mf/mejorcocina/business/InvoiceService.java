package com.mf.mejorcocina.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mf.mejorcocina.dao.DetalleFacturaRepo;
import com.mf.mejorcocina.dao.FacturaRepo;

@Service
public class InvoiceService implements InvoiceServiceFacade {
	@Autowired
	FacturaRepo factRepo;
	@Autowired
	DetalleFacturaRepo detFactRepo;
}
