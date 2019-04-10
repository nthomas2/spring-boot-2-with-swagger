package com.nthomas.springboot2swaggerexample;

import static com.google.common.base.Predicates.equalTo;
import static com.google.common.base.Predicates.not;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Springboot2swaggerexampleApplication {

	  @Bean
	  public Docket docket() {
		  return new Docket(DocumentationType.SWAGGER_2)
				  .select()
				  	.paths(not(equalTo("/error")))
				  	.build()
				  .genericModelSubstitutes(ResponseEntity.class)
				  .enableUrlTemplating(true)
				  .tags(new Tag("Utility", "Server Utility Functions"))
				  ;
	  }
	
	public static void main(String[] args) {
		SpringApplication.run(Springboot2swaggerexampleApplication.class, args);
	}

}
