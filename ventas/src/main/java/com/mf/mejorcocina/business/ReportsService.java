package com.mf.mejorcocina.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mf.mejorcocina.dao.ClienteRepo;
import com.mf.mejorcocina.domain.Cliente;
import com.mf.mejorcocina.form.Report1Form;

@Service
public class ReportsService implements ReportsServiceFacade {

	@Autowired
	ClienteRepo clientRepo;

	@Override
	public List<Report1Form> getReport1() {
		try {
			return new ArrayList<Report1Form>();
		} catch (Exception e) {
			return new ArrayList<Report1Form>();
		}
	}

	@Override
	public List<Cliente> getReport2() {
		try {
			return clientRepo.getClientesDerrochadores(100000.0);
		} catch (Exception e) {
			return new ArrayList<Cliente>();
		}
	}

}
