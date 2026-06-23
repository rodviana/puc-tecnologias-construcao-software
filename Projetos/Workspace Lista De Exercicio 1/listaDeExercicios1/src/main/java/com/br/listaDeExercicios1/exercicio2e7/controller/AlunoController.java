package com.br.listaDeExercicios1.exercicio2e7.controller;

import com.br.listaDeExercicios1.exercicio2e7.model.Aluno;
import com.br.listaDeExercicios1.exercicio2e7.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Scanner;

@Controller
public class AlunoController {


    @Autowired
    private AlunoService service;
    private Scanner sc = new Scanner(System.in);



    public void executarExercicio2()
    {
        String nome;
        ArrayList<Double> notas = new ArrayList<>();
        Aluno aluno = new Aluno();
        try {
            System.out.println("Informe o nome do aluno: ");
            nome=sc.nextLine();
            System.out.println("Informe a nota 1 do aluno: ");
            notas.add(sc.nextDouble());
            System.out.println("Informe a nota 2 do aluno: ");
            notas.add(sc.nextDouble());

            aluno.setNome(nome);
            aluno.setNotas(notas);

            aluno = service.calcularMediaBimestral(aluno);
        }
        catch (Exception e)
        {
            System.out.print("Ocorreu um erro durante a execução do exercício 2: "+ e.getMessage());
        }
    }

    public void executarExercicio7()
    {
        Aluno aluno = new Aluno();
        ArrayList<Double> notas = new ArrayList<>();
        try
        {
            System.out.println("Informe o nome do aluno: ");
            aluno.setNome(sc.nextLine());

            System.out.println("Informe a nota 1 do aluno: ");
            notas.add(sc.nextDouble());
            System.out.println("Informe a nota 2 do aluno: ");
            notas.add(sc.nextDouble());
            System.out.println("Informe a nota 3 do aluno: ");
            notas.add(sc.nextDouble());

            aluno.setNotas(notas);

            aluno = service.calcularNotaFinal(aluno);

        }catch(Exception e)
        {
            System.out.println("Ocorreu um erro no exercício 7: "+ e.getMessage());
        }
    }
}
