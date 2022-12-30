package com.formacion.springboot.app.modclientes.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.formacion.springboot.app.modclientes.model.Cliente;

@Service("informeServiceImpl")
public class InformeServiceImpl implements IInformeService {

	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Cliente> getAllClientes() {
		return Arrays
				.asList(clienteRest.getForObject("http://localhost:8088/api/lotes/listar/clientes", Cliente[].class));
	}

	@Override
	public Cliente findCliente(Long idCliente) {
		Map<String, String> param = new HashMap<>();
		param.put("idCliente", idCliente.toString());
		return clienteRest.getForObject("http://localhost:8088/api/lotes/buscar/cliente/{idCliente}", Cliente.class,
				param);
	}

}
