package com.listaDeExercicio3;

import com.listaDeExercicio3.exercicio10.controller.PessoaController;
import com.listaDeExercicio3.exercicio6.controller.AgenciaBancariaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@SpringBootApplication
public class ListaDeExercicio3Application {
	@Autowired
	AgenciaBancariaController agenciaBancariaController;
	@Autowired
	PessoaController pessoaController;

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(ListaDeExercicio3Application.class, args);
	}

	@PostConstruct
	public void executaListaExercicio()
	{
		Integer exercicio;
		System.out.print("Deseja executar o exercício 6 ou 10? ");
		exercicio = sc.nextInt();

		switch (exercicio)
		{
			case 6: agenciaBancariaController.executaExercicio6(); break;
			case 10: pessoaController.executaExercicio10();; break;
		}
	}

}
