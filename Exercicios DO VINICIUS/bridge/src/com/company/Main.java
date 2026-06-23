package com.company;

import interfaces.Produto;
import interfaces.Recheio;
import models.recheios.Carne;
import models.recheios.Frango;
import models.recheios.Queijo;
import salgados.Coxinha;
import salgados.Esfirra;
import salgados.Pastel;
import salgados.Salgado;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Salgado> salgados;
    private static ArrayList<Recheio> recheios;

    public static void main(String[] args) {
        prepareRecheios();
        prepareSalgados();
        produzaSalgados();
    }

    public static void prepareRecheios() {
        recheios = new ArrayList<>();
        recheios.add(new Frango());
        recheios.add(new Carne());
        recheios.add(new Queijo());
    }

    public static void prepareSalgados() {
        if (recheios.isEmpty())
            prepareRecheios();

        salgados = new ArrayList<>();
        for (Recheio recheio : recheios) {
            salgados.add(new Pastel(recheio));
            salgados.add(new Esfirra(recheio));
            salgados.add(new Coxinha(recheio));
        }
    }

    public static void produzaSalgados() {
        if (salgados.isEmpty())
            prepareSalgados();

        for(Salgado salgado : salgados)
            System.out.println(salgado.produza());
    }
}
