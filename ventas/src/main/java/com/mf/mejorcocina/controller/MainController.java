package com.mf.mejorcocina.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mf.mejorcocina.business.InvoiceServiceFacade;
import com.mf.mejorcocina.business.ReportsService;
import com.mf.mejorcocina.business.ReportsServiceFacade;
import com.mf.mejorcocina.dao.CamareroRepo;
import com.mf.mejorcocina.dao.ClienteRepo;
import com.mf.mejorcocina.dao.MesaRepo;
import com.mf.mejorcocina.dao.PlatoRepo;
import com.mf.mejorcocina.domain.Camarero;
import com.mf.mejorcocina.domain.Cliente;
import com.mf.mejorcocina.form.DetalleForm;
import com.mf.mejorcocina.form.InvoiceForm;

@Controller
public class MainController {

	@Autowired
	CamareroRepo camaRepo;
	@Autowired
	ClienteRepo clientRepo;
	@Autowired
	MesaRepo mesaRepo;
	@Autowired
	PlatoRepo platoRepo;
	@Autowired
	ReportsServiceFacade reportServs;
	@Autowired
	InvoiceServiceFacade invoiceServs;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home2() {
		return "home";
	}

	@RequestMapping(value = "/report1", method = RequestMethod.GET)
	public String report1(Model mod) {
		mod.addAttribute("waiters", reportServs.getReport1());
		return "report1";
	}

	@RequestMapping(value = "/report2", method = RequestMethod.GET)
	public String report2(Model mod) {
		mod.addAttribute("clients", reportServs.getReport2());
		return "report2";
	}

	@RequestMapping(value = "/invoice", method = RequestMethod.GET)
	public String invoice(Model mod) {
		List<DetalleForm> detalles = new ArrayList<>();
		DetalleForm e = new DetalleForm();
		e.setIdPlato("1");
		e.setPlato("Caviar");
		e.setImporte("100000");
		detalles.add(e);
		mod.addAttribute("waiters", camaRepo.findAll());
		mod.addAttribute("clients", clientRepo.findAll());
		mod.addAttribute("tables", mesaRepo.findAll());
		mod.addAttribute("dishes", platoRepo.findAll());
		mod.addAttribute("detalles", detalles);
		return "invoice";
	}

	@RequestMapping(value = "/invoice", method = RequestMethod.POST)
	public String invoiceForm(@ModelAttribute(name = "invoiceForm") InvoiceForm invoice, Model mod) {
		System.out.println(invoice);
//		Camarero nuevo = new Camarero();
//		nuevo.setNombre(invoice.getCliente());
//		nuevo.setApellido1(invoice.getCamarero());
//		nuevo.setApellido2(invoice.getMesa());
//		camaRepo.save(nuevo);
		invoiceServs.save(invoice);
		return "invoice";
	}
}
