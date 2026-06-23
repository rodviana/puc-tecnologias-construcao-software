package com.ExercicoEmSala.service;

import com.ExercicoEmSala.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class AlunoService {
    Scanner sc = new Scanner(System.in);
    public HashMap<Integer, ArrayList<Aluno>> inserirAluno (HashMap<Integer, ArrayList<Aluno>> mapAluno, Aluno aluno)
    {
        Random random = new Random();
        Integer key;
        try {
            key = random.nextInt(5);

            if (mapAluno == null || aluno==null)
                throw new NullPointerException();
            if (mapAluno.containsKey(key))
                mapAluno.get(key).add(aluno);
            else
            {
                ArrayList<Aluno> novaListaAluno = new ArrayList<>();
                novaListaAluno.add(aluno);
                mapAluno.put(key, novaListaAluno);
            }
            return mapAluno;
        }
        catch (NullPointerException e)
        {
            System.out.println("Todos os elementos da inserção precisam ter valores");
            if(mapAluno == null)
                System.out.println("map de aluno é null");
            if(aluno==null)
                System.out.println("o aluno é null");
        }
        catch (Exception e) {
            System.out.println("Ocorreu um erro ao inserir o aluno");
        }
        return null;
    }

    public HashMap<Integer, ArrayList<Aluno>> excluirAluno (HashMap<Integer, ArrayList<Aluno>> mapAlunoOriginal, String nomeAluno)
    {
        Predicate<Aluno> p = aluno ->
                aluno.getNome().equals(nomeAluno);
        HashMap<Integer, ArrayList<Aluno>> mapAluno = new HashMap<>();
        mapAluno.putAll(mapAlunoOriginal);
        try
        {
            mapAluno.forEach((key, alunos) -> alunos.removeAll(alunos.stream().filter(p::test).collect(Collectors.toList())));
            return mapAluno;
        }
        catch (Exception e)
        {
            System.out.println("Erro ao excluir aluno");
            return mapAlunoOriginal;

        }
    }

    public void listarAlunos (HashMap<Integer, ArrayList<Aluno>> mapAluno)
    {
        try
        {
            if(mapAluno == null)
                throw new NullPointerException();
            mapAluno.forEach((key, alunos) -> alunos.forEach(aluno -> System.out.println(aluno.getNome())));
        }
        catch (Exception e)
        {
            System.out.println("Ocorreu um erro na listagem dos alunos");
        }
    }

    public Aluno obtemAluno()
    {
        Integer matricula;
        String nome;
        Aluno aluno = new Aluno();
        try
        {
            System.out.println("Digite a matríula do aluno");
            matricula = sc.nextInt();
            System.out.println("Digite o nome do aluno");
            sc.nextLine();
            nome=sc.nextLine();

            aluno.setMatricula(matricula);
            aluno.setNome(nome);
        }catch (Exception e) {
            aluno = null;
            System.out.println("Ocorreu um erro ao obter os dados do aluno");
        }
            return aluno;
    }

}

