package com.mf.mejorcocina.form;

import java.util.List;

public class InvoiceForm {
	private String cliente;
	private String camarero;
	private String mesa;
	private List<DetalleForm> platos;

	public InvoiceForm() {
		super();
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCamarero() {
		return camarero;
	}

	public void setCamarero(String camarero) {
		this.camarero = camarero;
	}

	public String getMesa() {
		return mesa;
	}

	public void setMesa(String mesa) {
		this.mesa = mesa;
	}

	public List<DetalleForm> getPlatos() {
		return platos;
	}

	public void setPlatos(List<DetalleForm> platos) {
		this.platos = platos;
	}

	@Override
	public String toString() {
		return "InvoiceForm [cliente=" + cliente + ", camarero=" + camarero + ", mesa=" + mesa + ", platos=" + platos
				+ "]";
	}
}
