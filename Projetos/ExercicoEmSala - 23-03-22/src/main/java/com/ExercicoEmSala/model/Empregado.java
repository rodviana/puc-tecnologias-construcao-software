package com.ExercicoEmSala.model;

import com.ExercicoEmSala.service.PessoaService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Empregado extends Pessoa {
    @Getter @Setter
    private Double salario;
    @Getter @Setter
    private Integer matricula;

    @Override
    public String toString() {
        String toString= super.toString();
        return toString;
    }
}
