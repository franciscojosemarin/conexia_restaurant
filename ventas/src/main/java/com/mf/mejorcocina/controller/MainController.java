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
import org.springframework.web.bind.annotation.RequestBody;

import com.mf.mejorcocina.business.InvoiceServiceFacade;
import com.mf.mejorcocina.business.ReportsServiceFacade;
import com.mf.mejorcocina.form.InvoiceForm;

@Controller
public class MainController {

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
		mod.addAttribute("invoiceForm", invoiceServs.loadCollections());
		return "invoice";
	}

	@PostMapping(value = "/invoice")
	public ResponseEntity<String> invoiceForm(@Valid @RequestBody InvoiceForm invoiceForm, Errors errs, Model mod) {
//		System.out.println(invoiceForm);
//		System.out.println(errs);
		String response = "";
		if (!errs.hasErrors()) {
			int result = invoiceServs.save(invoiceForm);

			response = "{\"error\":\"Ha ocurrido un error, por favor consulte con el administrador del sistema...\"}";
			if (result == 200)
				response = "{\"message\":\"Factura Guardada Satifactoriamente...\"}";
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
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

}
