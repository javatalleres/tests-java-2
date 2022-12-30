package com.formacion.springboot.app.modclientes.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.formacion.springboot.app.modclientes.model.Cliente;

@FeignClient(name = "servicio-lotes", url = "localhost:8088/api/lotes")
public interface ILotesClienteRest {

	@GetMapping("/listar/clientes")
	public List<Cliente> getAllClientes();

	@GetMapping("/buscar/cliente/{idCliente}")
	public Cliente findCliente(@PathVariable("idCliente") Long idCliente);

}
