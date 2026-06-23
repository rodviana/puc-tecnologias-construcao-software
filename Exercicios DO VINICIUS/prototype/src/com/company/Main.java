package com.company;

import models.pneus.Firestone;
import models.pneus.Michelin;
import models.pneus.Pneu;
import models.veiculos.Caminhao;
import models.veiculos.Carro;

import java.net.CacheRequest;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Pneu pneuCarro = new Firestone(16);
        Pneu pneuCaminhao = new Michelin(26);

        Carro carro = new Carro();
        carro.inserirPneus(pneuCarro);
        Caminhao caminhao = new Caminhao();
        caminhao.inserirPneus(pneuCaminhao);

        System.out.println(caminhao);
        System.out.println(carro);


    }
}
