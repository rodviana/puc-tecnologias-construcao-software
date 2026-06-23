package com.listaDeExercicio3.exercicio6.controller;

import com.listaDeExercicio3.exercicio6.service.AgenciaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class AgenciaBancariaController {

    @Autowired
    AgenciaBancariaService service;
    Scanner sc= new Scanner(System.in);

    public void executaExercicio6()
    {
        try
        {
            Double valorInvestido;

            System.out.println("Informe o valor a ser investido");
            valorInvestido = sc.nextDouble();

            while(valorInvestido>0)
            {
                service.calculaRentabilidadeInvestimento(valorInvestido);
                System.out.println("Informe o valor a ser investido");
                valorInvestido = sc.nextDouble();
            }
        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante a execução do exercício 6: "+e.getMessage());
        }

    }
}
