package br.edu.pucgo.n2Atividade3.model;

import lombok.Getter;
import lombok.Setter;

public class Carro {
    @Getter @Setter
    private String modelo;
    @Getter @Setter
    private String tipo;
    @Getter @Setter
    private String transmissao;
    @Getter @Setter
    private String banco;
    @Getter @Setter
    private String acessorio;
    @Getter @Setter
    private String sensor;

    @Override
    public String toString() {
        return "Vendendo um " + this.modelo + "\n" +
                "Carro = [Tipo="+this.tipo+", transmissao="+this.transmissao+", bancos="+this.banco +", acessorio="+this.acessorio+", sensor="+this.sensor+"]"+"\n ";
    }
}
