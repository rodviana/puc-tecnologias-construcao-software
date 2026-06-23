package com.br.listaDeExercicios1.exercicio4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

/**
* Classe representativa de um seguro para a plantação de fazendeiros
* */
@AllArgsConstructor
@NoArgsConstructor
public class Seguro {

/*
* Atributo para representar a área de acres plantados para cata plantação
* Ex: <café,10>
* */
    @Getter @Setter
    private ArrayList<Plantacao> plantacao;

    @Getter @Setter
    private Double custo;
}
