package com.mf.mejorcocina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mf.mejorcocina.dao.CamareroRepo;
import com.mf.mejorcocina.dao.ClienteRepo;
import com.mf.mejorcocina.domain.Camarero;
import com.mf.mejorcocina.domain.Cliente;
import com.mf.mejorcocina.form.InvoiceForm;

@Controller
public class MainController {

	@Autowired
	CamareroRepo camaRepo;
	@Autowired
	ClienteRepo clientRepo;
//	InvoiceServiceFacade invoiceService;
	// @Autowired
	// ClienteRepo clienteRepo;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("home");
		// model.addAttribute("camareros", camaRepo.findAll());
		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home2(Model model) {
		System.out.println("home2");
		// model.addAttribute("camareros", camaRepo.findAll());
		return "home";
	}

	@RequestMapping(value = "/report1", method = RequestMethod.GET)
	public String report1() {
		System.out.println("report1");
		return "report1";
	}

	@RequestMapping(value = "/report2", method = RequestMethod.GET)
	public String report2(Model model) {
		System.out.println("report2");
		List<Cliente> clients = clientRepo.getClientesDerrochadores(100000.0);

		return "report2";
	}

	@RequestMapping(value = "/invoice", method = RequestMethod.GET)
	public String invoice() {
		System.out.println("invoice");
		return "invoice";
	}

	@RequestMapping(value = "/invoice", method = RequestMethod.POST)
	public String invoiceForm(@ModelAttribute(name = "invoiceForm") InvoiceForm invoice, Model mod) {
		System.out.println("invoice");
		System.out.println(invoice);
		Camarero nuevo = new Camarero();
		nuevo.setNombre(invoice.getCliente());
		nuevo.setApellido1(invoice.getCamarero());
		nuevo.setApellido2(invoice.getMesa());
		camaRepo.save(nuevo);
		mod.addAttribute("joda", "aqui");
		return "invoice";
	}
}
