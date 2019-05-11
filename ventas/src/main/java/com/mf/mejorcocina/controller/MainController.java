package com.mf.mejorcocina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mf.mejorcocina.business.InvoiceServiceFacade;

@Controller
public class MainController {

	@Autowired
	InvoiceServiceFacade invoiceService;
	// @Autowired
	// ClienteRepo clienteRepo;

	@GetMapping("/")
	public String home() {
		System.out.println("home");
		return "home.jsp";
	}

	@GetMapping("/report1.jsp")
	public String report1() {
		System.out.println("report1");
		return "report1.jsp";
	}
}
