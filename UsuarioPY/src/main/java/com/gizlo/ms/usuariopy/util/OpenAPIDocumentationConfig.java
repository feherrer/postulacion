package com.gizlo.ms.usuariopy.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
@OpenAPIDefinition

public class OpenAPIDocumentationConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
            .title("API REST UsuarioMS")
            .description("Microservicio Usuario")
            .version("1.0").termsOfService("http://www.gizlo.com")
            .contact(new Contact().name("RIGHTTEK S.A.").email("api@gizlo.com").url("https://www.gizlo.com"))
            .license(new License().name("Apache 2.0").url("https://www.gnu.org/licenses/gpl-3.0.html")));
    }

  

}
