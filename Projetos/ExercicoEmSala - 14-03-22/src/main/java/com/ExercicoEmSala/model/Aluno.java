package com.ExercicoEmSala.model;

import lombok.Getter;
import lombok.Setter;

public class Aluno implements Comparable<Aluno>{
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private Double nota;

    @Override
    public int compareTo(Aluno o) {
        if(this.nota == o.getNota())
            return 0;
        if(this.nota > o.getNota())
            return 1;
        else
            return -1;
    }
}
