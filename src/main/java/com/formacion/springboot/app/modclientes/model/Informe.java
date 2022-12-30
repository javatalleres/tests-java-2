package com.formacion.springboot.app.modclientes.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Informe {

	private Date fecha;
	private BigDecimal valorcompra;
	private List<Cliente> clientes;

	public Informe() {

	}
	
	public Informe(Date fecha) {
		this.fecha = fecha;
		valorcompra = new BigDecimal(0);
		clientes = new ArrayList<>();
	}

	public Informe(Date fecha, BigDecimal valorcompra, List<Cliente> clientes) {
		this.fecha = fecha;
		this.valorcompra = valorcompra;
		this.clientes = clientes;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getValorcompra() {
		return valorcompra;
	}

	public void setValorcompra(BigDecimal valorcompra) {
		this.valorcompra = valorcompra;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
