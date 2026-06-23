package com.banco.service;

import com.banco.model.ContaBancaria;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ContaBancariaSerivce {

    Scanner sc = new Scanner(System.in);

    public ContaBancaria depositar(Double valorDeposito, ContaBancaria contaBancaria)
    {
        try {
            if(!this.contaBancariaIsValida(contaBancaria))
            {
                System.out.println("Não foi possível depositar o valor, pois a conta bancária é invalida.");
            }
            else
                contaBancaria.setSaldo(contaBancaria.getSaldo()+valorDeposito);
        }catch (Exception e)
        {
            System.out.println("Não foi possível depositar o valor: "+e.getMessage());
        }
        return contaBancaria;
    }

    public ContaBancaria retirar(Double valorSaque, ContaBancaria contaBancaria)
    {
        try {
            if(!this.contaBancariaIsValida(contaBancaria))
            {
                System.out.println("Não foi possível retirar o saldo, pois a conta bancária é invalida.");
            }
            else if(contaBancaria.getSaldo()>=valorSaque)
                contaBancaria.setSaldo(contaBancaria.getSaldo()-valorSaque);
                else
                    System.out.println("A transação não foi realizada, pois o valor solicitado é maior do que o saldo da conta.");
        }catch (Exception e)
        {
            System.out.println("Não foi possível retirar o saldo: "+e.getMessage());
        }
        return contaBancaria;
    }

    public boolean contaBancariaIsValida(ContaBancaria contaBancaria) {
        try {

            if (contaBancaria == null)
                return false;
            if (contaBancaria.getSaldo() == null)
                contaBancaria.setSaldo(0.0);
            return true;
        } catch (Exception e) {
            System.out.println("Não foi validar a conta bancaria: " + e.getMessage());
            return false;
        }
    }

    public ContaBancaria obtemContaBancaria()
    {
        ContaBancaria contaBancaria = new ContaBancaria();
        try
        {
            System.out.println("Informe o saldo que sua conta bancaria possui");
            contaBancaria.setSaldo(sc.nextDouble());
            return contaBancaria;
        }catch(Exception e)
        {
            System.out.println("Ocorreu um erro ao obter os dados informados da conta bancária");
            return null;
        }
    }

    public Double obtemValorTransacao()
    {
        Double valorTransacao;
        try
        {
            do {
                System.out.println("Informe o valor da transação");
                valorTransacao=sc.nextDouble();
            }while (!this.valorTransacaoIsValido(valorTransacao));
            return valorTransacao;
        }catch(Exception e)
        {
            System.out.println("Ocorreu um erro ao obter os dados informados da conta bancária");
            return null;
        }
    }

    private boolean valorTransacaoIsValido(Double valorTransacao)
    {
        boolean isValido=true;
        try
        {
            if(valorTransacao<=0)
            {
                isValido=false;
                System.out.println("O valor da trasação deve ser maior do que zero");
            }

        }catch (Exception e)
        {
            isValido=false;
        }
        return isValido;
    }
}
