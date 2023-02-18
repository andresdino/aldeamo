package com.pruebaaldeamo.prueba_Aldeamo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PruebaAldeamoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaAldeamoApplication.class, args);
	}

}
