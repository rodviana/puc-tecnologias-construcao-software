package com.ExercicoEmSala;

import com.ExercicoEmSala.controller.AlunoController;
import com.ExercicoEmSala.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;
import java.util.*;

@SpringBootApplication
public class ExercicoEmSalaApplication {

/*
Exercício 01 - Dada a seguinte string:
• Imprima os números em ordem crescente e as letras em ordem decrescente do deque que deve ser inicializado da seguinte forma:
• j 9 i 8 h 7 g 6 f 5 e 4 d 3 c 2 b 1 a 0
Utilize a 'facilidade' da estrutura para realizar as impressões.
Exercício 02 - Implementar uma classe Aluno como nome (String) e nota (double).
Cadastrar 10 alunos em um Deque. Imprima na ordem crescente de notas e na ordem decrescente de notas.
Utilize a 'facilidade' da estrutura para realizar as impressões.
*/
	@Autowired
	private AlunoController alunoController;
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(ExercicoEmSalaApplication.class, args);
	}
	@PostConstruct
	public void executa()
	{
		Integer exercicio;
		try
		{
			System.out.println("Exercicio 1 ou 2?");
			exercicio = sc.nextInt();
			if(exercicio==1)
				this.exercicio1();
			else if(exercicio == 2)
				alunoController.exercicio2();

		}catch (Exception e)
		{
			System.out.println("O programa foi finalizado, pois ocorreu um erro durante a execução dos exercícios.");
		}
	}

	private void exercicio1()
	{
		Deque<Character> dequeLetra = new ArrayDeque<>();
		Deque<Character> dequeNumero= new ArrayDeque<>();
		for(Character character:"j9i8h7g6f5e4d3c2b1a0".toCharArray())
			if (isNumber(character))
				dequeNumero.addFirst(character);
			else
				dequeLetra.addLast(character);
		imprimeDeque(dequeNumero);
		imprimeDeque(dequeLetra);

	}

	public boolean isNumber(Character character)
	{
		return character >47 && character<58;
	}
	public void imprimeDeque(Deque<Character> deque)
	{
		if (deque == null || deque.isEmpty())
			System.out.println("O deque está vazio");
		System.out.print(Arrays.asList(deque.toArray()));
	}

}
