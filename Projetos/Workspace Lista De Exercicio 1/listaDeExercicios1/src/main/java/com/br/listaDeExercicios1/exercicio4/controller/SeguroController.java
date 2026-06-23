package com.br.listaDeExercicios1.exercicio4.controller;

import com.br.listaDeExercicios1.exercicio4.model.Plantacao;
import com.br.listaDeExercicios1.exercicio4.model.Seguro;
import com.br.listaDeExercicios1.exercicio4.service.SeguroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Array;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Scanner;

@Controller
public class SeguroController {

    @Autowired
    SeguroService service;
    Scanner sc = new Scanner(System.in);
    public void executarExercicio4()
    {
        Seguro seguro = new Seguro();
        seguro.setPlantacao(new ArrayList<>());
        Plantacao plantacao;

        try {
            System.out.println("Informe a cobertura e numero de acres plantados do milho");
            plantacao = new Plantacao();
            plantacao.setPlanta("milho");
                plantacao.setCobertura(sc.nextFloat());
            plantacao.setAcrePlantado(sc.nextFloat());
            seguro.getPlantacao().add(plantacao);

            System.out.println("Informe a cobertura e numero de acres plantados do feijão");
            plantacao = new Plantacao();
            plantacao.setPlanta("feijão");
            plantacao.setCobertura(sc.nextFloat());
            plantacao.setAcrePlantado(sc.nextFloat());
            seguro.getPlantacao().add(plantacao);

            System.out.println("Informe a cobertura e numero de acres plantados do café");
            plantacao = new Plantacao();
            plantacao.setPlanta("café");
            plantacao.setCobertura(sc.nextFloat());
            plantacao.setAcrePlantado(sc.nextFloat());
            seguro.getPlantacao().add(plantacao);

            service.calcularPrecoSeguro(seguro);
        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante a execução do exercício 4:"+ e.getMessage());
        }
    }
}
