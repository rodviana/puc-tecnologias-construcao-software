package com.br.listaDeExercicios1;

import com.br.listaDeExercicios1.exercicio1.controller.FuncionarioController;
import com.br.listaDeExercicios1.exercicio2e7.controller.AlunoController;
import com.br.listaDeExercicios1.exercicio3.controller.SistemaLinearController;
import com.br.listaDeExercicios1.exercicio4.controller.SeguroController;
import com.br.listaDeExercicios1.exercicio5.SwapController;
import com.br.listaDeExercicios1.exercicio6.controller.ContaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@SpringBootApplication
public class ListaDeExercicios1Application {

	Scanner sc = new Scanner(System.in);
	@Autowired
	private FuncionarioController funcionarioController;
	@Autowired
	private AlunoController alunoController;
	@Autowired
	private SistemaLinearController sistemaLinearController;
	@Autowired
	private SeguroController seguroController;
	@Autowired
	private SwapController swapController;
	@Autowired
	private ContaController contaController;



	public static void main(String[] args) {
		SpringApplication.run(ListaDeExercicios1Application.class, args);
	}

	@PostConstruct
	public void executaListaDeExercicio()
	{
		System.out.print("Digite o número do exercício que deseja executar(1-9): ");
		Integer opcao = sc.nextInt();
		switch (opcao)
		{
			case 1: funcionarioController.executarExercicio1();break;
			case 2: alunoController.executarExercicio2();break;
			case 3: sistemaLinearController.executaExercicio3();break;
			case 4: seguroController.executarExercicio4();break;
			case 5: swapController.executaExercicio5();break;
			case 6: contaController.executaExercicio6();break;
			case 7: alunoController.executarExercicio7();break;
			case 8: break;
			case 9: break;
		}

	}

}
