package com.formacion.springboot.app.modclientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ModuloClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuloClienteApplication.class, args);
	}

}
