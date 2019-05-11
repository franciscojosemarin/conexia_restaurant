package com.mf.mejorcocina.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DetalleFactura {
	@Id
	@GeneratedValue
	private long idDetalleFactura;
	private long idFactura;
	private long idPlato;
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

	public long getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(long idPlato) {
		this.idPlato = idPlato;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "DetalleFactura [IdDetalleFactura=" + idDetalleFactura + ", IdFactura=" + idFactura + ", IdPlato="
				+ idPlato + ", Importe=" + importe + "]";
	}
}
