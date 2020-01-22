package br.com.erudio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		Contact contact = new Contact();
		contact.setName("Fabio M. Yamauti");
		contact.setEmail("fabiao@gmail.com");
		contact.setUrl("https://github.com/fmyamauti/");
		
		return new OpenAPI()
				.components(new Components())				
				.info(new Info()
						.title("RESTful API With Spring Boot 2.2.2 - Alterado")
						.description("API for learning purposes")
						.version("V1")
						.termsOfService("Terms Of Service URL")
						.contact(contact));
	}
}	