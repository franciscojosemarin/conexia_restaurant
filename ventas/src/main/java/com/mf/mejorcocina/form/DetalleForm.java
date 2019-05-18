package com.mf.mejorcocina.form;

public class DetalleForm {
	private String idPlato;
	private String plato;
	private String importe;

	public DetalleForm() {
	}

	public String getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(String idPlato) {
		this.idPlato = idPlato;
	}

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}

	public String getImporte() {
		return importe;
	}

	public void setImporte(String importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "DetalleForm [idPlato=" + idPlato + ", plato=" + plato + ", importe=" + importe + "]";
	}
}
