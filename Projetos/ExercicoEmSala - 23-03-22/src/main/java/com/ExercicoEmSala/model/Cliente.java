package com.ExercicoEmSala.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Pessoa{
    @Getter @Setter
    private Double valorDivida;
    @Getter @Setter
    private Integer anoNascim;

    @Override
    public String toString() {
        String toString=super.toString();
        toString+="idade: " + this.getIdade() + "\n";
        toString+="sexo: " + this.getSexo() + "\n";
        toString+="valorDivida: " + valorDivida + "\n";
        toString+="anoNascim: " + anoNascim + "\n";
        return toString;
    }
}
