package com.br.listaDeExercicios1.exercicio3.controller;

import com.br.listaDeExercicios1.exercicio3.model.SistemaLinear;
import com.br.listaDeExercicios1.exercicio3.service.SistemaLinearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class SistemaLinearController {

    @Autowired
    private SistemaLinearService service;
    private Scanner sc = new Scanner(System.in);

    public void executaExercicio3()
    {
        SistemaLinear sistemaLinear = new SistemaLinear();
        try {

            System.out.println("A equação linear será no formato 'ax+by=c' e 'dx+ey=f' ");

            System.out.println("Informe o valor das constantes 'a','b','c','d','e','f'");
            sistemaLinear.setA(sc.nextFloat());
            sistemaLinear.setB(sc.nextFloat());
            sistemaLinear.setC(sc.nextFloat());
            sistemaLinear.setD(sc.nextFloat());
            sistemaLinear.setE(sc.nextFloat());
            sistemaLinear.setF(sc.nextFloat());

            sistemaLinear = service.resolverSistemaLinear(sistemaLinear);
        }catch (Exception e)
        {
            System.out.print("Ocorreu um erro durante a execução do exercício 3: "+ e.getMessage());
        }
    }
}
