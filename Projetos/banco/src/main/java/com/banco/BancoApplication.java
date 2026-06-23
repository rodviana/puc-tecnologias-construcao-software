package com.banco;

import com.banco.controller.ContaBancariaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BancoApplication {

	@Autowired
	private ContaBancariaController contaBancariaController;

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@PostConstruct
	public void start()
	{
		contaBancariaController.depositar();
		contaBancariaController.retirar();
	}

}
