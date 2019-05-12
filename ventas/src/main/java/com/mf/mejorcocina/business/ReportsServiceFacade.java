package com.mf.mejorcocina.business;

import java.util.List;

import com.mf.mejorcocina.domain.Cliente;
import com.mf.mejorcocina.form.Report1Form;

public interface ReportsServiceFacade {

	List<Report1Form> getReport1();

	List<Cliente> getReport2();

}
