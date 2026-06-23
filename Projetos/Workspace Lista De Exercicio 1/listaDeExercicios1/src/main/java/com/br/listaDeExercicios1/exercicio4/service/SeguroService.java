package com.br.listaDeExercicios1.exercicio4.service;

import com.br.listaDeExercicios1.exercicio4.model.Plantacao;
import com.br.listaDeExercicios1.exercicio4.model.Seguro;
import org.springframework.stereotype.Service;

@Service
public class SeguroService {

    public Seguro calcularPrecoSeguro(Seguro seguro)
    {
        Double custo=0.0;
        try
        {
            for(Plantacao plantacao : seguro.getPlantacao())
                custo+=plantacao.getCobertura()*plantacao.getAcrePlantado() * 3.5 /100;
            seguro.setCusto(custo);
            System.out.println("O custo do seguro é:"+ seguro.getCusto());
        }catch(Exception e)
        {
            System.out.println("Ocorreu um erro durante o calculo do preço de seguro"+e.getMessage());
        }
        return seguro;
    }
}
