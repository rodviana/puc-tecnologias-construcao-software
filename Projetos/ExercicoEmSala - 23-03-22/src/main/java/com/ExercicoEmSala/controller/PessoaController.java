package com.ExercicoEmSala.controller;

import com.ExercicoEmSala.model.Cliente;
import com.ExercicoEmSala.model.Gerente;
import com.ExercicoEmSala.model.Pessoa;
import com.ExercicoEmSala.model.Vendedor;
import org.springframework.stereotype.Controller;

@Controller
public class PessoaController {

    public void test()
    {
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Cliente cliente = new Cliente();

        gerente.setNome("Tania");
        gerente.setIdade(30);
        gerente.setSalario(15000.00);
        gerente.setMatricula(1300);
        gerente.setNomeGerencia("Atendimento");

        vendedor.setNome("Igor");
        vendedor.setSalario(7000.00);
        vendedor.setValorVendas(14000.00);
        vendedor.setQtdeVendas(120);

        cliente.setNome("Almir");
        cliente.setSexo("Masculino");
        cliente.setIdade(40);
        cliente.setValorDivida(2000.00);
        cliente.setAnoNascim(1976);

        System.out.println("Dados do cliente: \n" + cliente.toString());
        System.out.println("Dados do vendedor: \n" + vendedor.toString());
        System.out.println("Dados do gerente: \n" + gerente.toString());

    }
}

