package com.ExercicoEmSala.model;

import com.ExercicoEmSala.service.PessoaService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Gerente extends Empregado{
    @Getter @Setter
    private String nomeGerencia;

    @Override
    public String toString() {
        String toString= super.toString();
        toString+="idade: " + this.getIdade() + "\n";
        toString+="matricula: " + this.getMatricula() + "\n";
        toString+="nomeGerencia: " + nomeGerencia + "\n";
        toString+="valor inss: "+ PessoaService.valorInss(this) + "\n";

        return toString;
    }
}
