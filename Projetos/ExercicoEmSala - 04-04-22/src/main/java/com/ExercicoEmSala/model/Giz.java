package com.ExercicoEmSala.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Giz implements Caneta{

    @Getter
    private String cor;

    @Override
    public void escrever(String texto) {
        System.out.println("Usando " + texto + " o giz");
    }
}
