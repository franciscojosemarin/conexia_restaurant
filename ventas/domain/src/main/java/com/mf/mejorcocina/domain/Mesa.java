package com.mf.mejorcocina.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mesa {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idMesa;
	private int numeroMaxComensales;
	private String ubicacion;

	public long getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(long idMesa) {
		this.idMesa = idMesa;
	}

	public int getNumeroMaxComensales() {
		return numeroMaxComensales;
	}

	public void setNumeroMaxComensales(int numeroMaxComensales) {
		this.numeroMaxComensales = numeroMaxComensales;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Mesa [IdMesa=" + idMesa + ", NumeroMaxComensales=" + numeroMaxComensales + ", Ubicacion=" + ubicacion
				+ "]";
	}

}
