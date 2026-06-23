package com.br.listaDeExercicios1.exercicio6.service;

import com.br.listaDeExercicios1.exercicio6.model.Conta;
import org.springframework.stereotype.Service;

@Service
public class ContaService {
    public Conta calculaValorPago(Conta conta)
    {
        Float valorPago, jurosTotal;
        try
        {
            jurosTotal= (conta.getValorConta()+conta.getValorMulta()) * conta.getValorJurosDiario()* conta.getDiasAtraso()/100;
            valorPago = (conta.getValorConta() + conta.getValorMulta() ) + jurosTotal ;
            conta.setValorPagamento(valorPago);
            System.out.println("Valor da conta:"+ conta.getValorConta());
            System.out.println("Dias em atraso:"+ conta.getDiasAtraso());
            System.out.println("Total da multa:"+ conta.getValorMulta());
            System.out.println("Total de juros:"+ (conta.getValorConta()+conta.getValorMulta()) * conta.getDiasAtraso()/100);
            System.out.println("Total a pagar:"+ conta.getValorPagamento());

        }catch(Exception e)
        {
            System.out.println("Ocorreu um erro ao calcular o valor pago :" + e.getMessage());
        }
        return conta;
    }
}
