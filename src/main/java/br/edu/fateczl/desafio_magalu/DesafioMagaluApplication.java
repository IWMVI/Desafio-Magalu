package br.edu.fateczl.desafio_magalu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DesafioMagaluApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioMagaluApplication.class, args);
	}

}
