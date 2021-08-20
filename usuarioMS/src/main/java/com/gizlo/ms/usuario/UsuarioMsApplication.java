package com.gizlo.ms.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.gizlo.ms.usuario","com.gizlo.ms.usuario.controller.impl"})
public class UsuarioMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioMsApplication.class, args);
		
		
		
	}

}
