package com.formacion.springboot.app.modclientes.model;

import java.util.Date;
import java.util.List;

public class Cliente {

	private Long idCliente;
	private String nombre;
	private String apellidos;
	private Date fecAlta;
	private List<Lote> lotes;

	public Cliente() {
		
	}

	public Cliente(Long idCliente, String nombre, String apellidos, Date fecAlta, List<Lote> lotes) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecAlta = fecAlta;
		this.lotes = lotes;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
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

	public Date getFecAlta() {
		return fecAlta;
	}

	public void setFecAlta(Date fecAlta) {
		this.fecAlta = fecAlta;
	}

	public List<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

}
