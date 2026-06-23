package com.ExercicoEmSala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

@SpringBootApplication
public class ExercicoEmSalaApplication {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(ExercicoEmSalaApplication.class, args);
	}

	@PostConstruct
	public void executaExercicio()
	{
		this.exercicio1();
		this.exercicio2();
	}

	private void exercicio1()
	{
		ArrayList<Integer> listaPar = new ArrayList<>();
		ArrayList<Integer> listaImpar = new ArrayList<>();
		try
		{
			Integer numero;
			for(int i=0;i<10;i++)
			{
				numero = leInteger();
				if(numero !=null)
					if(numero%2==0)
						listaPar.add(numero);
					else
						listaImpar.add(numero);
			}
			System.out.print("Lista par:");
			for (Integer numeroPar:listaPar)
				System.out.print(" "+numeroPar);
			System.out.println();
			System.out.print("Lista impar:");
			for (Integer numeroImpar:listaImpar)
				System.out.print(" "+numeroImpar);


		}catch(Exception e)
		{
			System.out.println("Ocorreu um erro no exercício 1" + e.getMessage());
		}
	}

	private void exercicio2()
	{
		ArrayList<Double> listaDouble=new ArrayList<>();
		Double media;
		try
		{
			Double numero;
			for(int i=0;i<10;i++) {
				numero = leDouble();
				if (numero != null)
					listaDouble.add(numero);
			}
			listarDouble(listaDouble);
			listaDouble.set(5,9.7);
			listarDouble(listaDouble);
			obtemMedia(listaDouble);
			obtemMenorNumero(listaDouble);
			obtemMaiorNumero(listaDouble);
			listaDouble=new ArrayList<>();
			if(listaDouble.isEmpty())
				System.out.println("a lista esta vazia");
		}catch(Exception e)
		{
			System.out.println("Ocorreu um erro no exercício 2" + e.getMessage());
		}
	}

	private Integer leInteger()
	{
		Integer numero=null;
		try
		{
			numero = sc.nextInt();
		}catch (Exception e) {
			System.out.println("Ocorreu um erro na leitura do numero inteiro" + e.getMessage());
		}
			return numero;
	}

	private Double leDouble()
	{
		Double numero=null;
		try
		{
			numero = sc.nextDouble();
		}catch (Exception e) {
			System.out.println("Ocorreu um erro na leitura do numero double" + e.getMessage());
		}

		return numero;

	}

	private void obtemMedia(ArrayList<Double> listaDouble)
	{
		Double media=0.0;
		try
		{
			for(Double numeroDobule : listaDouble)
				media+=numeroDobule;
			if (listaDouble.size()>0.0)
				media= media/listaDouble.size();
			System.out.println("A media dos números é: " + media);
		}catch (Exception e)
		{
			System.out.println("Ocorreu um erro no calculo da media dos numeros " + e.getMessage());
		}

	}

	private void listarDouble(ArrayList<Double> listaDouble)
	{
		try
		{
			Iterator<Double> doubleIterator = listaDouble.iterator();
			while (doubleIterator.hasNext())
				System.out.println(doubleIterator.next());
		}catch (Exception e)
		{
			System.out.println("Ocorreu um erro na listagem da lista de Double: "+e.getMessage());
		}
	}
	private void obtemMenorNumero(ArrayList<Double> listaDouble)
	{
		Double menor=Double.MAX_VALUE;
		try
		{
			for(Double numero:listaDouble)
				if(numero<menor)
					menor=numero;
			if(listaDouble.size()>0)
				System.out.println("O menor numero é "+menor);
			else
				System.out.println("não há menor numero pois a lista esta vazia");
		}catch (Exception e)
		{
			System.out.println("Ocorreu um erro ao buscar o menor numero da lsita "+ e.getMessage());
		}
	}

	private void obtemMaiorNumero(ArrayList<Double> listaDouble)
	{
		Double maior=Double.MIN_VALUE;
		try
		{
			for(Double numero:listaDouble)
				if(numero>maior)
					maior=numero;
			if(listaDouble.size()>0)
				System.out.println("O maior numero é "+maior);
			else
				System.out.println("não há maior numero pois a lista esta vazia");
		}catch (Exception e)
		{
			System.out.println("Ocorreu um erro ao buscar o maior numero da lsita "+ e.getMessage());
		}
	}
}
