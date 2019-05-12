package com.mf.mejorcocina.form;

public class InvoiceForm {
	private String cliente;
	private String camarero;
	private String mesa;

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

	@Override
	public String toString() {
		return "InvoiceForm [cliente=" + cliente + ", camarero=" + camarero + ", mesa=" + mesa + "]";
	}
}
