package br.univille.spring.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApiRestApplication {

	public static void main(String[] args) {
		System.out.println("Olá mundo");
		SpringApplication.run(SpringApiRestApplication.class, args);
	}
}
