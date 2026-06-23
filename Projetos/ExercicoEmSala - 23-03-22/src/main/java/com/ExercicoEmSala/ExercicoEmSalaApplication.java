package com.ExercicoEmSala;

import com.ExercicoEmSala.controller.PessoaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ExercicoEmSalaApplication {

	@Autowired
	PessoaController pessoaController;

	public static void main(String[] args) {
		SpringApplication.run(ExercicoEmSalaApplication.class, args);
	}

	@PostConstruct
	public void executa()
	{
		pessoaController.test();
	}


}
