package com.ExercicoEmSala.service;

import com.ExercicoEmSala.model.Aluno;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.CollectionEndEvent;

import java.util.*;
import java.util.stream.Stream;

@Service
public class AlunoService {

    Scanner sc =  new Scanner(System.in);
    public ArrayDeque<Aluno> getAlunoList()
    {
        Deque alunos = new ArrayDeque();
        Aluno aluno;
        String nome;
        Double nota;
        try
        {
            for(int i=0;i<10;i++)
            {
                aluno=new Aluno();
                System.out.println("Informe a nota do aluno");
                nota=sc.nextDouble();
                System.out.println("Informe o nome do aluno");
                sc.nextLine();
                nome=sc.nextLine();


                aluno.setNome(nome);
                aluno.setNota(nota);
                alunos.add(aluno);
            }


        }
        catch(Exception e)
        {
            System.out.println("Ocorreu um erro ao ler a lista de alunos");
            alunos = null;
        }
        return (ArrayDeque<Aluno>) alunos;
    }

    // Informe true para ordernar crescente e false para ordernar decrescente
    public void imprimirAlunosOrdenado(ArrayDeque<Aluno> dequeAluno, boolean ordemCresecente)
    {
        Stream<Aluno> stremAluno;
        Iterator<Aluno> iterator;
        ArrayDeque<Aluno> dequeAlunoOrdenado = new ArrayDeque<>();
        Aluno aluno;
        if(dequeAluno == null || dequeAluno.isEmpty())
        {
            System.out.println("O deque de aluno está vazio");
            return;
        }
        stremAluno = dequeAluno.stream().sorted();
        iterator = stremAluno.iterator();
        while (iterator.hasNext())
        {
            dequeAlunoOrdenado.add(iterator.next());
        }

        if (ordemCresecente)
            while (!dequeAlunoOrdenado.isEmpty())
            {
                aluno = dequeAlunoOrdenado.removeFirst();
                System.out.println(aluno.getNome() +" - "+ aluno.getNota());
            }
        else
            while (!dequeAlunoOrdenado.isEmpty())
            {
                aluno = dequeAlunoOrdenado.removeLast();
                System.out.println(aluno.getNome() +" - "+ aluno.getNota());
            }
    }
}
