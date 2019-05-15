package com.mf.mejorcocina.form;

public class Report1DetalleForm {
	private Long idCamarero;
	private String nombre;
	private String apellidos;
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

	public Double getFacturado() {
		return facturado;
	}

	public void setFacturado(Double facturado) {
		this.facturado = facturado;
	}

	@Override
	public String toString() {
		return "Report1Form [idCamarero=" + idCamarero + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", facturado=" + facturado + "]";
	}
}
