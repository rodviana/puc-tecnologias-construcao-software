package com.ExercicoEmSala.controller;

import com.ExercicoEmSala.model.Aluno;
import com.ExercicoEmSala.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

@Controller
public class AlunoController {
    @Autowired
    AlunoService service;
    public void menuOpcoes()
    {
        Scanner sc = new Scanner(System.in);
        Integer opcao;
        boolean encerra = false;
        HashMap<Integer, ArrayList<Aluno>> mapAluno = new HashMap<>();
        try
        {
            while (!encerra)
            {
                System.out.println("#####################\n" +
                        "# 1 - Inserir aluno #\n" +
                        "# 2 - Excluir aluno #\n" +
                        "# 3 - Listar        #\n" +
                        "# 7 - Sair          #\n" +
                        "#####################");
                opcao=sc.nextInt();
                switch (opcao)
                {
                    case 1:
                        mapAluno=service.inserirAluno(mapAluno,service.obtemAluno());
                        break;
                    case 2:
                        System.out.println("Digite o nome do aluno que deseja remover");
                        sc.nextLine();
                        mapAluno=service.excluirAluno(mapAluno,sc.nextLine());
                        break;
                    case 3:
                        service.listarAlunos(mapAluno);
                        break;
                    case 7:
                        encerra=true;
                        break;
            }
        }

        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro no menu de opções");
        }
    }


}
