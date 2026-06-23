package com.br.listaDeExercicios1.exercicio1.service;

import org.springframework.stereotype.Service;

import com.br.listaDeExercicios1.exercicio1.model.Funcionario;

@Service
public class FuncionarioService {
	
	public static Funcionario aumentoSalarial(Funcionario funcionario, float aumentoPercentual) 
	{
		float aumento=0;
		try 
		{
			if(aumentoPercentual>=0)
			{
				aumento += funcionario.getSalario() * aumentoPercentual / 100;
				funcionario.setSalario(funcionario.getSalario() + aumento);
				System.out.println("O funcionário "+funcionario.getNome()+"teve um aumento de R$ "+aumento+" e passará a receber um salário de R$ "+ funcionario.getSalario() +".");
			}
		}catch(Exception e) {
			System.out.println("Ocorreu um erro durante o cálculo do aumento salárial: " + e.getMessage());
		}
		return funcionario;
	}

}
