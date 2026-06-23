package com.ExercicoEmSala.controller;

import com.ExercicoEmSala.model.Aluno;
import com.ExercicoEmSala.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayDeque;
import java.util.Deque;

@Controller
public class AlunoController {

    @Autowired
    private AlunoService service;

    public void exercicio2()
    {
        Deque<Aluno> dequeAluno = new ArrayDeque<>();
        Aluno aluno = new Aluno();
        try
        {
            dequeAluno=service.getAlunoList();
            if(dequeAluno == null)
                throw new NullPointerException();
            service.imprimirAlunosOrdenado((ArrayDeque<Aluno>) dequeAluno, true);
            service.imprimirAlunosOrdenado((ArrayDeque<Aluno>) dequeAluno, false);

        }catch(Exception e)
        {
            System.out.println("Ocooreu um erro no exercicio 2");
        }
    }
}

