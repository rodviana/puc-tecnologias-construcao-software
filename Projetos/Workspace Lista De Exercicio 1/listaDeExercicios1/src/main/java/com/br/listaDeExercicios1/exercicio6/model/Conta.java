package com.br.listaDeExercicios1.exercicio6.model;

import lombok.Getter;
import lombok.Setter;

public class Conta {
    @Getter @Setter
    private Float valorConta;
    @Getter @Setter
    private Integer diasAtraso;
    @Getter @Setter
    private Float valorMulta;
    @Getter @Setter
    private Float valorJurosDiario;
    @Getter @Setter
    private Float valorPagamento;
}
