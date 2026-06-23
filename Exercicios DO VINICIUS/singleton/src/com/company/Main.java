package com.company;

import factory.PilotoFactory;
import factory.PistaFactory;
import model.Piloto;
import model.Pista;

import java.util.ArrayList;

public class Main {
    private static Pista pista = null;
    private static final int qdePilotos = 10;
    private static ArrayList<Piloto> pilotos;
    public static void main(String[] args) {
        pista = PistaFactory
                .get()
                .create("Autodromo Internacional de Goiania");

        pilotos = new ArrayList<>();
        init(pista);
    }

    public static void init(Pista pista) {
        while (Pista.getQdePilotos() < Pista.getMax()) {
            Piloto piloto = PilotoFactory
                    .get()
                    .create("Piloto " + Pista.getQdePilotos(), pista);

            pilotos.add(piloto);
            System.out.println(piloto);
        }
    }
}

