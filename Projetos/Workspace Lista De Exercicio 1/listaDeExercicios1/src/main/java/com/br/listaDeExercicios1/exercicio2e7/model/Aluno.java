package com.br.listaDeExercicios1.exercicio2e7.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Aluno {
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private ArrayList<Double> notas;
    @Getter @Setter
    private Double mediaBimestral;
    @Getter @Setter
    private Double notaFinal;
}
