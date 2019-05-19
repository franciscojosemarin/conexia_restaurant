package com.mf.mejorcocina.business;

import java.sql.Date;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mf.mejorcocina.dao.CamareroRepo;
import com.mf.mejorcocina.dao.ClienteRepo;
import com.mf.mejorcocina.dao.DetalleFacturaRepo;
import com.mf.mejorcocina.dao.FacturaRepo;
import com.mf.mejorcocina.dao.MesaRepo;
import com.mf.mejorcocina.dao.PlatoRepo;
import com.mf.mejorcocina.domain.DetalleFactura;
import com.mf.mejorcocina.domain.Factura;
import com.mf.mejorcocina.form.DetalleForm;
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
		try {
			Factura newInv = new Factura();
			newInv.setFechaFactura(new Date(Calendar.getInstance().getTime().getTime()));
			newInv.setIdCamarero(Integer.parseInt(invoice.getCamarero()));
			newInv.setIdCliente(Integer.parseInt(invoice.getCliente()));
			newInv.setIdMesa(Integer.parseInt(invoice.getMesa()));
			newInv = factRepo.save(newInv);
			for (DetalleForm detail : invoice.getPlatos()) {
				DetalleFactura newDetInv = new DetalleFactura();
				newDetInv.setIdFactura(newInv.getIdFactura());
				newDetInv.setIdPlato(Integer.parseInt(detail.getIdPlato()));
				newDetInv.setImporte(Double.parseDouble(detail.getImporte()));
				detFactRepo.save(newDetInv);
			}
			return 200;
		} catch (Exception e) {
			e.printStackTrace();
			return 500;
		}
	}

	@Override
	public InvoiceForm loadCollections() {
		InvoiceForm frm = new InvoiceForm();
		try {
			frm.setWaiters(camaRepo.findAll());
			frm.setClients(clientRepo.findAll());
			frm.setTables(mesaRepo.findAll());
			frm.setDishes(platoRepo.findAll());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return frm;
	}
}
