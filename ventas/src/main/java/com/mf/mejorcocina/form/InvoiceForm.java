package com.mf.mejorcocina.form;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.mf.mejorcocina.domain.Camarero;
import com.mf.mejorcocina.domain.Cliente;
import com.mf.mejorcocina.domain.Mesa;
import com.mf.mejorcocina.domain.Plato;

public class InvoiceForm {
	@NotNull(message = "Debe seleccionar un Cliente")
	@NotEmpty(message = "Debe seleccionar un Cliente")
	private String cliente;
	@NotNull(message = "Debe seleccionar un Camarero")
	@NotEmpty(message = "Debe seleccionar un Camarero")
	private String camarero;
	@NotNull(message = "Debe seleccionar una Mesa")
	@NotEmpty(message = "Debe seleccionar una Mesa")
	private String mesa;
	@NotEmpty(message = "Debe agregar por lo menos un plato")
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
		return "InvoiceForm [cliente=" + cliente + ", camarero=" + camarero + ", mesa=" + mesa + ", platos=" + platos
				+ ", waiters=" + waiters + ", clients=" + clients + ", tables=" + tables + ", dishes=" + dishes + "]";
	}
}
