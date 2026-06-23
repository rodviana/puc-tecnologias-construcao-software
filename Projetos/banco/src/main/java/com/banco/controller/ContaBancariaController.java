package com.banco.controller;

import com.banco.model.ContaBancaria;
import com.banco.service.ContaBancariaSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ContaBancariaController {

    @Autowired
    private ContaBancariaSerivce serivce;

    public void depositar()
    {
        ContaBancaria contaBancaria;
        Double valorDeposito = 0.0;
        try
        {
            System.out.println("Efetuando um deposito");
            contaBancaria = serivce.obtemContaBancaria();
            valorDeposito=serivce.obtemValorTransacao();
            serivce.depositar(valorDeposito,contaBancaria);
            System.out.println("Saldo final da conta bancaria: "+contaBancaria.getSaldo());
        }catch (Exception e)
        {
            System.out.println("Ocorreu um erro no controlador de execução do depósito: "+e.getMessage());
        }
    }

    public void retirar() {
        ContaBancaria contaBancaria;
        Double valorDeposito = 0.0;
        try {
            System.out.println("Efetuando um saque");
            contaBancaria = serivce.obtemContaBancaria();
            valorDeposito=serivce.obtemValorTransacao();
            serivce.retirar(valorDeposito, contaBancaria);
            System.out.println("Saldo final da conta bancaria: "+contaBancaria.getSaldo());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no controlador de execução do processo de retirar dinheiro da conta: " + e.getMessage());
        }
    }
}
