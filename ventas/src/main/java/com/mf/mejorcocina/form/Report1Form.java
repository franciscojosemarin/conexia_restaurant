package com.mf.mejorcocina.form;

public class Report1Form {
	private Long idCamarero;
	private String nombre;
	private String apellidos;
	private String mes;
	private Double facturado;

	public Long getIdCamarero() {
		return idCamarero;
	}

	public void setIdCamarero(Long idCamarero) {
		this.idCamarero = idCamarero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Double getFacturado() {
		return facturado;
	}

	public void setFacturado(Double facturado) {
		this.facturado = facturado;
	}

	@Override
	public String toString() {
		return "Report1Form [idCamarero=" + idCamarero + ", nombre=" + nombre + ", apellidos=" + apellidos + ", mes="
				+ mes + ", facturado=" + facturado + "]";
	}
}
