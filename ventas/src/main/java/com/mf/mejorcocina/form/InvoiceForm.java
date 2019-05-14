package com.mf.mejorcocina.form;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.mf.mejorcocina.domain.Camarero;
import com.mf.mejorcocina.domain.Cliente;
import com.mf.mejorcocina.domain.Mesa;
import com.mf.mejorcocina.domain.Plato;

public class InvoiceForm {
	@NotNull
	private String cliente;
	@NotNull
	private String camarero;
	@NotNull
	private String mesa;

	private String dishs;
	private String importe;
	private List<DetalleForm> platos;

	private Iterable<Camarero> waiters;
	private Iterable<Cliente> clients;
	private Iterable<Mesa> tables;
	private Iterable<Plato> dishes;

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

	public String getDishs() {
		return dishs;
	}

	public void setDishs(String dishs) {
		this.dishs = dishs;
	}

	public String getImporte() {
		return importe;
	}

	public void setImporte(String importe) {
		this.importe = importe;
	}

	public List<DetalleForm> getPlatos() {
		return platos;
	}

	public void setPlatos(List<DetalleForm> platos) {
		this.platos = platos;
	}

	public Iterable<Camarero> getWaiters() {
		return waiters;
	}

	public void setWaiters(Iterable<Camarero> waiters) {
		this.waiters = waiters;
	}

	public Iterable<Cliente> getClients() {
		return clients;
	}

	public void setClients(Iterable<Cliente> clients) {
		this.clients = clients;
	}

	public Iterable<Mesa> getTables() {
		return tables;
	}

	public void setTables(Iterable<Mesa> tables) {
		this.tables = tables;
	}

	public Iterable<Plato> getDishes() {
		return dishes;
	}

	public void setDishes(Iterable<Plato> dishes) {
		this.dishes = dishes;
	}

	@Override
	public String toString() {
		return "InvoiceForm [cliente=" + cliente + ", camarero=" + camarero + ", mesa=" + mesa + ", dishs=" + dishs
				+ ", importe=" + importe + ", platos=" + platos + "]";
	}

}
