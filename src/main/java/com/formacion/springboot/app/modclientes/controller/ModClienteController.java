package com.formacion.springboot.app.modclientes.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.springboot.app.modclientes.model.Cliente;
import com.formacion.springboot.app.modclientes.model.Informe;
import com.formacion.springboot.app.modclientes.service.IInformeService;

@RestController
@RequestMapping("/api/informes")
public class ModClienteController {

	@Autowired
	@Qualifier("informeServiceFeign")
//	@Qualifier("informeServiceImpl")
	private IInformeService informeService;

	@GetMapping("/ver/informe/total")
	public Informe verInforme() {
		Informe informe = new Informe(new Date());
		List<Cliente> clientes = informeService.getAllClientes();
		
		if (!clientes.isEmpty()) {
			informe.setClientes(clientes);
			
			clientes.stream().forEach(c -> {
				if (!c.getLotes().isEmpty()) {
					c.getLotes().forEach(l -> {
						informe.setValorcompra(informe.getValorcompra().add(l.getValor()));
					});
				}
			});
		}
		return informe;
	}
	
	@GetMapping("/ver/informe/cliente/{idCliente}")
	public Informe verInformeCliente(@PathVariable Long idCliente) {
		Informe informe = new Informe(new Date());
		Cliente cliente = informeService.findCliente(idCliente);
		
		if (cliente != null) {
			informe.setClientes(Arrays.asList(cliente));
			
			if (!cliente.getLotes().isEmpty() ) {
				cliente.getLotes().forEach(l -> {
					informe.setValorcompra(informe.getValorcompra().add(l.getValor()));
				});
			}
		}
		return informe;
	}
}
