package com.mf.mejorcocina.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

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

	@GetMapping(value = "/")
	public String home() {
		return "home";
	}

	@GetMapping(value = "/home")
	public String home2() {
		return "home";
	}

	@GetMapping(value = "/report1")
	public String report1(Model mod) {
		mod.addAttribute("months", reportServs.getReport1());
		return "report1";
	}

	@GetMapping(value = "/report2")
	public String report2(Model mod) {
		mod.addAttribute("clients", reportServs.getReport2());
		return "report2";
	}

	@GetMapping(value = "/invoice")
	public String invoice(Model mod) {
		InvoiceForm invoice = new InvoiceForm();
		invoice = invoiceServs.loadCollections(invoice);
		List<DetalleForm> detalles = new ArrayList<>();
		DetalleForm e = new DetalleForm();
		e.setIdPlato("1");
		e.setPlato("Caviar");
		e.setImporte("100000");
		detalles.add(e);
		mod.addAttribute("invoiceForm", invoice);
		mod.addAttribute("detalles", detalles);
		return "invoice";
	}

	@PostMapping(value = "/invoice")
	public String invoiceForm(@Valid @ModelAttribute(name = "invoiceForm") InvoiceForm invoice, Model mod) {
		System.out.println(invoice);
		invoiceServs.save(invoice);
		invoice = invoiceServs.loadCollections(invoice);
		mod.addAttribute("invoiceForm", invoice);
		return "invoice";
	}

}
