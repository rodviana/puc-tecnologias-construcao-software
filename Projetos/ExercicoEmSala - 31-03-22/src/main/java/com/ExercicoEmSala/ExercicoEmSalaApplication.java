package com.ExercicoEmSala;

import com.ExercicoEmSala.controller.VeiculoController;
import com.ExercicoEmSala.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class ExercicoEmSalaApplication {

	@Autowired
	VeiculoController veiculoController;
	Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		SpringApplication.run(ExercicoEmSalaApplication.class, args);
	}

	@PostConstruct
	public void executa()
	{
		Integer quantidade=0;
		ArrayList<Veiculo> veiculoList;
		System.out.print("Informe a quantidade de veículos que deseja cadastrar: ");
		quantidade = sc.nextInt();;

		veiculoList=veiculoController.readVeiculos(quantidade);
		Veiculo.printVeiculo(veiculoList);
	}

}
