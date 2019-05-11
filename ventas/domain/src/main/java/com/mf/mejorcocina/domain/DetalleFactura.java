package com.mf.mejorcocina.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetalleFactura {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idDetalleFactura;
	private long idFactura;
	private long idCocinero;
	private String plato;
	private double importe;

	public long getIdDetalleFactura() {
		return idDetalleFactura;
	}

	public void setIdDetalleFactura(long idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}

	public long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(long idFactura) {
		this.idFactura = idFactura;
	}

	public long getIdCocinero() {
		return idCocinero;
	}

	public void setIdCocinero(long idCocinero) {
		this.idCocinero = idCocinero;
	}

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "DetalleFactura [IdDetalleFactura=" + idDetalleFactura + ", IdFactura=" + idFactura + ", IdCocinero="
				+ idCocinero + ", Plato=" + plato + ", Importe=" + importe + "]";
	}
}
