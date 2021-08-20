package com.gizlo.ms.usuariopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.gizlo.ms.usuario.repository.contract"})
public class UsuariopyMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariopyMsApplication.class, args);
		
		
		
	}

}
