package com.listaDeExercicio3.exercicio10.service;

import com.listaDeExercicio3.exercicio10.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Scanner;

@Service
public class PessoaService {

    Scanner sc = new Scanner(System.in);

    public Pessoa obtemPessoaConsole()
    {
        try
        {
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe a altura da pessoa");
            pessoa.setAltura(Float.valueOf(sc.nextFloat()));
            System.out.println("Informe o sexo da pessoa");
            sc.nextLine();
            pessoa.setSexo(sc.nextLine().charAt(0));

            return pessoa;
        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante a leitura da pessoa");
            sc.nextLine();
            return null;
        }

    }


    public void obtemMenorAltura(ArrayList<Pessoa> listaPessoa)
    {
        Float menorAltura= Float.MAX_VALUE;
        try
        {
            if(!this.listaPessoaIsValida(listaPessoa))
                return;

            for (Pessoa pessoa : listaPessoa)
                if(pessoa.getAltura() != null && menorAltura<pessoa.getAltura())
                    menorAltura=pessoa.getAltura();
            System.out.print("A menor altura é:" + menorAltura);
        }catch (Exception e)
        {
            System.out.print("Ocorreu um erro durante o cálculo da menor altura da lista de pessoas: "+e.getMessage());
        }
    }


    public void obtemMediaAlturaFeminina(ArrayList<Pessoa> listaPessoa)
    {
        Float mediaAlturaFemina= Float.valueOf(0);
        try
        {
            if(!this.listaPessoaIsValida(listaPessoa))
                return;

            for (Pessoa pessoa : listaPessoa)
                if(pessoa.getSexo()!= null && pessoa.getSexo().equals('F') && pessoa.getAltura() != null)
                    mediaAlturaFemina+=pessoa.getAltura();
            mediaAlturaFemina=mediaAlturaFemina/listaPessoa.size();
            System.out.println("A media de altura feminina é "+mediaAlturaFemina);
        }catch (Exception e)
        {
            System.out.print("Ocorreu um erro durante o cálculo da menor altura da lista de pessoas: "+e.getMessage());
        }
    }

    public void obtemQuantidadeHomens(ArrayList<Pessoa> listaPessoa)
    {
        try
        {
            Integer quantidadeHomens=0;
            if(!this.listaPessoaIsValida(listaPessoa))
                return;
            for(Pessoa pessoa:listaPessoa)
                if(pessoa.getSexo()!=null && pessoa.getSexo().equals('M'))
                    quantidadeHomens++;
            System.out.println("A quantidade de homens é "+ quantidadeHomens);

        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante o cálculo da quantidade de homens :" + e.getMessage());
        }
    }

    public void obtemSexoDaPessoaMaisAlta(ArrayList<Pessoa> listaPessoa)
    {
        try
        {
            Character sexoMaisAlto=null;
            Float maiorAltura = Float.MIN_VALUE;
            if(!this.listaPessoaIsValida(listaPessoa))
                return;

            for (Pessoa pessoa : listaPessoa)
                if(pessoa.getSexo()!=null && pessoa.getAltura() != null && pessoa.getAltura()>maiorAltura)
                    sexoMaisAlto=pessoa.getSexo();
            System.out.println("O sexo da pessoa mais alta é: " + sexoMaisAlto);

        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro durante o calculo da pessoa mais alta: "+e.getMessage());
        }
    }

    public boolean listaPessoaIsValida(ArrayList<Pessoa> listaPessoa)
    {
        try {
            if(listaPessoa==null || listaPessoa.isEmpty())
            {
                System.out.println("A lista de pessoas para obter a media de altura feminina está vazia");
                return false;
            }
            return true;
        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro ao validar se a lista de pessoas é válida: " + e.getMessage());
            return false;
        }
    }
}
