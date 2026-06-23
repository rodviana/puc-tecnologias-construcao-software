package com.ExercicoEmSala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ExercicoEmSalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicoEmSalaApplication.class, args);
	}

	@PostConstruct
	public void executa()
	{

	}
}

