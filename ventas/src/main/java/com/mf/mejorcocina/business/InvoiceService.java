package com.mf.mejorcocina.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mf.mejorcocina.dao.CamareroRepo;
import com.mf.mejorcocina.dao.ClienteRepo;
import com.mf.mejorcocina.dao.DetalleFacturaRepo;
import com.mf.mejorcocina.dao.FacturaRepo;
import com.mf.mejorcocina.dao.MesaRepo;
import com.mf.mejorcocina.dao.PlatoRepo;
import com.mf.mejorcocina.form.InvoiceForm;

@Service
public class InvoiceService implements InvoiceServiceFacade {
	@Autowired
	FacturaRepo factRepo;
	@Autowired
	DetalleFacturaRepo detFactRepo;
	@Autowired
	CamareroRepo camaRepo;
	@Autowired
	ClienteRepo clientRepo;
	@Autowired
	MesaRepo mesaRepo;
	@Autowired
	PlatoRepo platoRepo;

	@Override
	public int save(InvoiceForm invoice) {

		return 200;
	}

	@Override
	public InvoiceForm loadCollections(InvoiceForm frm) {
		frm.setWaiters(camaRepo.findAll());
		frm.setClients(clientRepo.findAll());
		frm.setTables(mesaRepo.findAll());
		frm.setDishes(platoRepo.findAll());
		return frm;
	}
}
