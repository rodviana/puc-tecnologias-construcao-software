package com.ExercicoEmSala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.*;

@SpringBootApplication
public class ExercicoEmSalaApplication {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(ExercicoEmSalaApplication.class, args);
	}


	@PostConstruct
	public void executa()
	{
		ArrayList<Stack<Character>>	listaPilha;
		boolean palindromo = false;
		try
		{
			listaPilha=getCadeiaCaracter();
			palindromo=xCy(listaPilha);
			if (palindromo)
				System.out.println("É inverso");
			else
				System.out.println("Não é inverso");


		}catch (Exception e)
		{
			System.out.println("Ocorreu um erro durante a execução do exercicio");
		}
	}
	//método que verifica se a cadeia de caracteres é um palíndromo
	private boolean xCy(ArrayList<Stack<Character>> listaPilha)
	{
		Iterator<Character> iterator0;
		Iterator<Character> iterator1;
		try
		{
			if(listaPilha==null || listaPilha.size()!=2 || listaPilha.get(0).size()!=listaPilha.get(1).size())
				return false;
			iterator0 = listaPilha.get(0).iterator();
			iterator1 = listaPilha.get(1).iterator();

			while (iterator0.hasNext())
				if(!iterator0.next().equals(iterator1.next()))
					return false;
			return true;
		}catch (Exception e)
		{
			System.out.println("Ocorreu um erro durante a verificação xCy da cadeia de caracteres");
		}
		return true;
	}

	private ArrayList<Stack<Character>> getCadeiaCaracter()
	{
		String cadeia="";
		boolean contemC=false;
		ArrayList<Stack<Character>> listaDePilha = new ArrayList<>();
		Stack<Character> pilha = new Stack<>();
		try
		{
			System.out.println("Informe a cadeia de caracteres");
				cadeia = sc.nextLine().toUpperCase(Locale.ROOT);
			for(Character caracter:cadeia.toCharArray())
				if (caracter.equals('A') || caracter.equals('B'))
					pilha.add(caracter);
				else if(caracter.equals('C') && !contemC)
				{
					contemC=true;
					listaDePilha.add(pilha);
					pilha=new Stack<>();
				}
				else
				{
					System.out.println("Caracter fora do domínio: " + caracter);
					listaDePilha = null;
					break;
				}
			listaDePilha.add(pilha);
		}catch (Exception e)
		{
			System.out.println("Ocorreu um erro durante a leitura da cadeia de caracteres");
			listaDePilha=null;
		}
		return listaDePilha;
	}
}
