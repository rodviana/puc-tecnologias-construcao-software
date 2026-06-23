package com.listaDeExercicio3.exercicio10.controller;

import com.listaDeExercicio3.exercicio10.model.Pessoa;
import com.listaDeExercicio3.exercicio10.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
public class PessoaController {

    @Autowired
    PessoaService service;

    public void executaExercicio10()
    {
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        Pessoa pessoa;
        try
        {
            for(int i=1;i<=2;i++)
                listaPessoa.add(service.obtemPessoaConsole());

            service.obtemMenorAltura(listaPessoa);
            service.obtemMediaAlturaFeminina(listaPessoa);
            service.obtemQuantidadeHomens(listaPessoa);
            service.obtemSexoDaPessoaMaisAlta(listaPessoa);
        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante a execução do exercício 10");
        }
    }
}
