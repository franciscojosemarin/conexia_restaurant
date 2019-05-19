package com.mf.mejorcocina.business;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mf.mejorcocina.dao.CamareroRepo;
import com.mf.mejorcocina.dao.ClienteRepo;
import com.mf.mejorcocina.dao.DetalleFacturaRepo;
import com.mf.mejorcocina.dao.FacturaRepo;
import com.mf.mejorcocina.domain.Camarero;
import com.mf.mejorcocina.domain.Cliente;
import com.mf.mejorcocina.domain.DetalleFactura;
import com.mf.mejorcocina.domain.Factura;
import com.mf.mejorcocina.form.Report1DetalleForm;
import com.mf.mejorcocina.form.Report1Form;

@Service
public class ReportsService implements ReportsServiceFacade {

	@Autowired
	ClienteRepo clientRepo;
	@Autowired
	FacturaRepo factRepo;
	@Autowired
	DetalleFacturaRepo detFactRepo;
	@Autowired
	CamareroRepo camaRepo;

	@Override
	public List<Report1Form> getReport1() {
		try {
			List<Report1Form> response = new ArrayList<>();
			Iterable<Camarero> waiters = camaRepo.findAll();
			Supplier<Stream<Factura>> invoices = () -> StreamSupport.stream(factRepo.findAll().spliterator(), false);
			Supplier<Stream<DetalleFactura>> details = () -> StreamSupport.stream(detFactRepo.findAll().spliterator(),
					false);

			List<String> months = invoices.get().map(inv -> {
				Date date = inv.getFechaFactura();
				Calendar cal = Calendar.getInstance();
				cal.setTime(date);
				return cal.get(Calendar.YEAR) + "" + (cal.get(Calendar.MONTH) + 1);
			}).distinct().collect(Collectors.toList());

			for (String month : months) {
				Report1Form m = new Report1Form();
				m.setMonth(month.substring(0, 4) + " " + getMonth(Integer.parseInt(month.substring(4))));
				m.setWaiters(new ArrayList<>());
				for (Camarero waiter : waiters) {
					Report1DetalleForm c = new Report1DetalleForm();
					c.setIdCamarero(waiter.getIdCamarero());
					c.setNombre(waiter.getNombre());
					c.setApellidos(waiter.getApellido1() + " " + waiter.getApellido2());
					List<Long> idInvs = invoices.get().filter(inv -> {
						Date date = inv.getFechaFactura();
						Calendar cal = Calendar.getInstance();
						cal.setTime(date);
						String iMonth = cal.get(Calendar.YEAR) + "" + (cal.get(Calendar.MONTH) + 1);
						return (inv.getIdCamarero() == waiter.getIdCamarero() && month.equals(iMonth));
					}).map(inv -> inv.getIdFactura()).collect(Collectors.toList());
					c.setFacturado(
							details.get().filter(df -> idInvs.stream().anyMatch(id -> id.equals(df.getIdFactura())))
									.mapToDouble(df -> df.getImporte()).sum());
					m.getWaiters().add(c);
				}
				response.add(m);
			}

			return response;
		} catch (Exception e) {
			e.printStackTrace();
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

	private String getMonth(int num) {
		String[] months = { "ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC" };
		return months[num - 1];
	}

}
