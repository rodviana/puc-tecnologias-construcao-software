package com.ExercicoEmSala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.*;

@SpringBootApplication
public class ExercicoEmSalaApplication {
/*
exercício 01 –
Faça um programa que forneça uma fila com uma sequência aleatória de números inteiros.
Imprima a fila. Em seguida, crie duas novas filas nomeadas impar e par.
Leia a primeira fila e preencha as duas novas filas conforme a característica de cada uma.
Elimine um a um cada elemento da fila original, na medida em que cada fila esteja sendo criada.
Imprima as duas novas filas (use os métodos iterator e for (int num: <fila>)) e faça um teste de fila vazia na fila original,
emitindo uma mensagem ao usuário.

Exemplo:
Fila    : [51, 49, 70, 23, 90, 38, 71, 20]
Par     : [70, 90, 38, 20]
Impar: [51, 49, 23, 71]
Fila Original Vazia!*/

	private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		SpringApplication.run(ExercicoEmSalaApplication.class, args);
	}

	@PostConstruct
	public void executa()
	{
		Random random = new Random();
		Queue<Integer> filaFull = new LinkedList<>();
		Queue<Integer> filaImpar = new LinkedList<>();
		Queue<Integer> filaPar = new LinkedList<>();
		Integer n =0;
		Integer aux;
		try
		{
			System.out.println("Informe o tamanho da fila que deseja utilizar");
			n = sc.nextInt();
			for(int i=0;i<n;i++)
				filaFull.add(random.nextInt(n));

			for(int i=0;i<n;i++)
			{
				aux=filaFull.remove();
				System.out.println(aux);
				if(aux%2==0)
					filaPar.add(aux);
				else
					filaImpar.add(aux);
			}
			imprimeLista(filaImpar);
			imprimeLista(filaPar);

			if(filaFull.isEmpty())
				System.out.println("A primeira lista foi esvaziada");

		}catch (Exception e)
		{
			System.out.println("Ocorreu um erro durante a execução do exercício");
		}
	}

	private void imprimeLista(Queue<Integer> queue)
	{
		System.out.println();
		System.out.println("Imprimindo fila");

		try{
			Iterator<Integer> iterator = queue.iterator();
			while(iterator.hasNext())
				System.out.println(iterator.next());
		}catch(Exception e)
		{
			System.out.println("Erro ao imprimir fila");
		}
	}


}
