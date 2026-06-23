package com.br.listaDeExercicios1.exercicio4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Plantacao {
    @Getter @Setter
    private String planta;
    @Getter @Setter
    private Float acrePlantado;
    @Getter @Setter
    private Float cobertura;
}
