package com.br.listaDeExercicios1.exercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private float salario;

}
