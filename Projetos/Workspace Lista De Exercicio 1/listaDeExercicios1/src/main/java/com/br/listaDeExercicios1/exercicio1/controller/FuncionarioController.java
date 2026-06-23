package com.br.listaDeExercicios1.exercicio1.controller;

import com.br.listaDeExercicios1.exercicio1.model.Funcionario;
import com.br.listaDeExercicios1.exercicio1.service.FuncionarioService;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class FuncionarioController {

    private Scanner sc = new Scanner(System.in);
    private FuncionarioService service;


    public void executarExercicio1()
    {
        String nome;
        float salario,aumentoPercentual;
        Funcionario funcionario = new Funcionario();
        try {

            System.out.println("Informe o nome do funcionario: ");
            nome=sc.nextLine();
            System.out.println("Informe o salario do funcionario: ");
            salario = sc.nextFloat();
            System.out.println("Informe o aumento percentual que o "+nome+" receberá em seu salário: ");
            aumentoPercentual=sc.nextFloat();

            funcionario.setNome(nome);
            funcionario.setSalario(salario);

            funcionario = service.aumentoSalarial(funcionario,aumentoPercentual);
        }catch (Exception e)
        {
            System.out.print("Ocorreu um erro durante a execução do exercício 3: "+ e.getMessage());
        }
    }

}
