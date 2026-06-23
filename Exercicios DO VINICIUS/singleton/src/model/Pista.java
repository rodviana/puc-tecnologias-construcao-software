package model;

import factory.PistaFactory;

public class Pista {
    private static Pista pista;
    private static int max = 5;

    public static int getMax() {
        return max;
    }

    private static int qdePilotos;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pista() {
        qdePilotos = 0;
    }

    public static void increase() {
        if (qdePilotos < max)
            qdePilotos++;
    }


    public static int getQdePilotos() {
        return qdePilotos;
    }

    public static Pista get() {
        if (pista == null) {
            pista = new Pista();
            return pista;
        }
        else if (qdePilotos < max) {
            increase();
            return pista;
        }

        return null;
    }
}
