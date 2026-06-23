package com.company;

import enums.EnumRegiao;
import enums.EnumSalgado;
import factory.SalgadosFactory;
import models.Empada;
import models.Salgado;

public class Main {

    public static void main(String[] args) {
          SalgadosFactory salgadoFactory = new SalgadosFactory();


        salgadoFactory.assarSalgado(EnumSalgado.EMPADA.name(), EnumRegiao.GOIAS.name());
        Salgado empadaGoias = salgadoFactory.getSalgadinho();


        salgadoFactory.assarSalgado(EnumSalgado.COXINHA.name(), EnumRegiao.GOIAS.name());
        Salgado coxinhaGoias = salgadoFactory.getSalgadinho();


        salgadoFactory.assarSalgado(EnumSalgado.EMPADA.name(), EnumRegiao.CEARA.name());
        Salgado empadaCeara = salgadoFactory.getSalgadinho();

        salgadoFactory.assarSalgado(EnumSalgado.COXINHA.name(), EnumRegiao.CEARA.name());
        Salgado coxinhaCeara = salgadoFactory.getSalgadinho();


        System.out.println(empadaCeara);
        System.out.println(empadaGoias);
        System.out.println(coxinhaGoias);
        System.out.println(coxinhaCeara);



    }
}
