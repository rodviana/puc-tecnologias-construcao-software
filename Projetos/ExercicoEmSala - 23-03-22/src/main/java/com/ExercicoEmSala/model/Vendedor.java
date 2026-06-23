package com.ExercicoEmSala.model;

import com.ExercicoEmSala.service.PessoaService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Vendedor extends Empregado {
    @Getter @Setter
    private Double valorVendas;

    @Getter @Setter
    private Integer qtdeVendas;

    @Override
    public String toString() {
        String toString= super.toString();
        toString+="salario: " + this.getSalario() + "\n";
        toString+="valorVendas: " + valorVendas + "\n";
        toString+="qtdeVendas: " + qtdeVendas + "\n";

        return toString;
    }
}


