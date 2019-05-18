package com.mf.mejorcocina.controller;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mf.mejorcocina.business.InvoiceServiceFacade;
import com.mf.mejorcocina.business.ReportsServiceFacade;
import com.mf.mejorcocina.dao.CamareroRepo;
import com.mf.mejorcocina.dao.ClienteRepo;
import com.mf.mejorcocina.dao.MesaRepo;
import com.mf.mejorcocina.dao.PlatoRepo;
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
		mod.addAttribute("invoiceForm", invoice);
		return "invoice";
	}

//	@PostMapping(value = "/invoice") // @ModelAttribute(name = "invoiceForm"), consumes = MediaType.APPLICATION_JSON_VALUE  @RequestBody
	@PostMapping(value = "/invoice")
	public ResponseEntity<String> invoiceForm(@Valid InvoiceForm invoiceForm, Errors errs, Model mod) {
		System.out.println(invoiceForm);
		System.out.println(errs);
		String response = "";
		if (!errs.hasErrors()) {
			invoiceServs.save(invoiceForm);
			mod.addAttribute("message", "Factura Guardada Satifactoriamente...");
		} else {
			Set<String> resp2 = new HashSet<>();

			for (ObjectError err : errs.getAllErrors()) {
				FieldError fe = (FieldError) err;
				resp2.add("{\"" + fe.getField() + "\":\"" + fe.getDefaultMessage() + "\"}");
			}

			response += "[";
			boolean ini = true;
			for (String str : resp2) {
				response += (ini ? "" : ",") + str;
				if (ini)
					ini = false;
			}
			response += "]";

			return new ResponseEntity<String>(response, HttpStatus.NOT_ACCEPTABLE);
		}
		invoiceForm = invoiceServs.loadCollections(invoiceForm);
		mod.addAttribute("invoiceForm", invoiceForm);
		return new ResponseEntity<String>(response, HttpStatus.OK);
//		return "invoice";
	}

}
