package com.ExercicoEmSala.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


public abstract class Veiculo implements EmissaoCO2 {
    @Getter
    private String tipo;
    @Getter
    private String motor;
    @Getter
    private Double quilometragem;
    @Getter
    private Double  indice;

    Veiculo(String tipo, String motor, Double quilometragem, Double indice)
    {
        this.tipo = tipo;
        this.motor= motor;
        this.quilometragem=quilometragem;
        this.indice=indice;

    }
    public static void printVeiculo(ArrayList<Veiculo> veiculoList)
    {
        int count = 0;
        if(veiculoList==null || veiculoList.isEmpty())
        {
            System.out.println("Não existem veículos cadastrados.");
            return;
        }
        for(Veiculo veiculo : veiculoList)
        {
            count++;
            System.out.println(count + " - " + veiculo.toString());
        }
    }

    @Override
    public String toString()
    {
        String toString="";
        toString+=this.getClass().getName() + "\n";
        toString+="Tipo: " + this.tipo + "\n";
        toString+="Motor : " +this.motor + "\n";
        toString+="KM: " +this.quilometragem + "\n";
        toString+="Emissão de CO2: "+this.calculaC02() + " KG/mes \n";
        return toString;
    }
}
