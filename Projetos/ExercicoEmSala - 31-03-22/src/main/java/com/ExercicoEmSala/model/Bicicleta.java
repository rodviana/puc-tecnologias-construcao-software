package com.ExercicoEmSala.model;

public class Bicicleta extends Veiculo implements EmissaoCO2{
    public Bicicleta(String tipo, String motor, Double quilometragem, Double indice) {
        super(tipo, motor, quilometragem, indice);
    }

    @Override
    public Double calculaC02() {return this.getQuilometragem()*this.getIndice();}
}
