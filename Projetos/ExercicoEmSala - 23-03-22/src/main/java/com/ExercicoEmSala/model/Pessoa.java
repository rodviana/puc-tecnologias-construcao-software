package com.ExercicoEmSala.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Pessoa {
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private Integer idade;
    @Getter @Setter
    private String sexo;

    @Override
    public String toString() {
        String toString="";
        toString+="Nome: " + nome + "\n";
        return toString;
    }
}
