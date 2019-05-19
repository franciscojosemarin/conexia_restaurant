package com.mf.mejorcocina.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPlato;
	private long idCocinero;
	private String nombre;
	private double importe;

	public long getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(long idPlato) {
		this.idPlato = idPlato;
	}

	public long getIdCocinero() {
		return idCocinero;
	}

	public void setIdCocinero(long idCocinero) {
		this.idCocinero = idCocinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Plato [IdPlato=" + idPlato + ", IdCocinero=" + idCocinero + ", Nombre=" + nombre + ", Importe="
				+ importe + "]";
	}
}
