package com.formacion.springboot.app.modclientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacion.springboot.app.modclientes.feign.ILotesClienteRest;
import com.formacion.springboot.app.modclientes.model.Cliente;

@Service("informeServiceFeign")
public class InformeServiceFeign implements IInformeService {
	
	@Autowired
	private ILotesClienteRest ILotesClienteRest;

	@Override
	public List<Cliente> getAllClientes() {
		return ILotesClienteRest.getAllClientes();
	}

	@Override
	public Cliente findCliente(Long idCliente) {
		return ILotesClienteRest.findCliente(idCliente);
	}

}
