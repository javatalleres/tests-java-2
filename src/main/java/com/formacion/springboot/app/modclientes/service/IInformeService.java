package com.formacion.springboot.app.modclientes.service;

import java.util.List;

import com.formacion.springboot.app.modclientes.model.Cliente;

public interface IInformeService {

	public List<Cliente> getAllClientes();

	public Cliente findCliente(Long idCliente);
}
