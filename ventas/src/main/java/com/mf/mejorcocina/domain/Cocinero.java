package com.mf.mejorcocina.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cocinero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCocinero;
	private String nombre;
	private String apellido1;
	private String apellido2;

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

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Override
	public String toString() {
		return "Cocinero [IdCocinero=" + idCocinero + ", Nombre=" + nombre + ", Apellido1=" + apellido1 + ", Apellido2="
				+ apellido2 + "]";
	}
}
