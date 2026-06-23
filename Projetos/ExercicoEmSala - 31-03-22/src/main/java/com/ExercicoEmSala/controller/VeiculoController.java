package com.ExercicoEmSala.controller;

import com.ExercicoEmSala.model.Barco;
import com.ExercicoEmSala.model.Bicicleta;
import com.ExercicoEmSala.model.Carro;
import com.ExercicoEmSala.model.Veiculo;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Scanner;

@Controller
public class VeiculoController {

    Scanner sc = new Scanner(System.in);
    public ArrayList<Veiculo> readVeiculos(Integer quantidade)
    {
        Integer modeloVeiculo;
        Veiculo veiculo;
        String tipo, motor;
        Double quilometragem;

        ArrayList<Veiculo> veiculoList = new ArrayList<>();

        for(int i=0;i<quantidade;i++)
        {
            System.out.println("Informe o número do veículo que deseja cadastrar:\n" +
                    "1- carro \n" +
                    "2- barco \n" +
                    "3- bicicleta \n");
            modeloVeiculo=sc.nextInt();
            System.out.println("Informe o tipo de veículo: ");
            sc.nextLine();
            tipo=sc.nextLine();
            System.out.println("Informe o motor do veículo: ");
            motor=sc.nextLine();
            System.out.println("Informe o quilometragem do veículo: ");
            quilometragem=sc.nextDouble();

            switch (modeloVeiculo) {
                case 1:
                    veiculo = new Carro(tipo, motor, quilometragem, 1.24);
                    veiculoList.add(veiculo);
                    break;
                case 2:
                    veiculo = new Barco(tipo, motor, quilometragem, 0.23);
                    veiculoList.add(veiculo);
                    break;
                case 3:
                    veiculo = new Bicicleta(tipo, motor, quilometragem, 0.0);
                    veiculoList.add(veiculo);
                    break;
            }
        }

        return veiculoList;
    };

}
