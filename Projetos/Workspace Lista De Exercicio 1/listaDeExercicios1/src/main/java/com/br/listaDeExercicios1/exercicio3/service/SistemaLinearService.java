package com.br.listaDeExercicios1.exercicio3.service;

import com.br.listaDeExercicios1.exercicio3.model.SistemaLinear;
import org.springframework.stereotype.Service;

@Service
public class SistemaLinearService {

    public SistemaLinear resolverSistemaLinear(SistemaLinear sistemaLinear)
    {
        Float x,y;
        try
        {
            x = (sistemaLinear.getC()* sistemaLinear.getE() - sistemaLinear.getB()* sistemaLinear.getF())
                    / (sistemaLinear.getA()* sistemaLinear.getE() - sistemaLinear.getB()* sistemaLinear.getD());

            y = (sistemaLinear.getA()* sistemaLinear.getF() - sistemaLinear.getC()* sistemaLinear.getD())
                    / (sistemaLinear.getA()* sistemaLinear.getE() - sistemaLinear.getB()* sistemaLinear.getD());

            sistemaLinear.setX(x);
            sistemaLinear.setY(y);
            System.out.println("Valor de X: "+sistemaLinear.getX());
            System.out.println("Valor de Y: "+sistemaLinear.getY());

        }catch(Exception e)
        {
            System.out.println("Não foi possível resolver o sistema linear: " + e.getMessage());
        }
        return sistemaLinear;

    }
}
