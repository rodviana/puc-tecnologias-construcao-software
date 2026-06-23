package com.br.listaDeExercicios1.exercicio6.controller;

import com.br.listaDeExercicios1.exercicio6.model.Conta;
import com.br.listaDeExercicios1.exercicio6.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class ContaController {
    @Autowired
    private ContaService service;
    Scanner sc = new Scanner(System.in);

    public void executaExercicio6()
    {
        Conta conta = new Conta();
        try
        {
            System.out.println("Informe o valor da conta");
            conta.setValorConta(sc.nextFloat());
            System.out.println("Informe o número de dias em atraso");
            conta.setDiasAtraso(sc.nextInt());
            System.out.println("Informe o valor da multa");
            conta.setValorMulta(sc.nextFloat());
            System.out.println("Informe o juros percentual por dia de atraso");
            conta.setValorJurosDiario(sc.nextFloat());

            service.calculaValorPago(conta);
        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro no exercício 6: "+e.getMessage());
        }
    }

}
