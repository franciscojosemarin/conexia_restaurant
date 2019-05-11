package com.mf.mejorcocina.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idFactura;
	private long idCliente;
	private long idCamarero;
	private long idMesa;
	private Date fechaFactura;

	public long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(long idFactura) {
		this.idFactura = idFactura;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getIdCamarero() {
		return idCamarero;
	}

	public void setIdCamarero(long idCamarero) {
		this.idCamarero = idCamarero;
	}

	public long getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(long idMesa) {
		this.idMesa = idMesa;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	@Override
	public String toString() {
		return "Factura [IdFactura=" + idFactura + ", IdCliente=" + idCliente + ", IdCamarero=" + idCamarero
				+ ", IdMesa=" + idMesa + ", FechaFactura=" + fechaFactura + "]";
	}
}
