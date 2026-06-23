package com.company;

import factories.FabricaDeDoce;
import factories.FabricaDeSalgado;
import interfaces.FabricaAbstrata;
import models.Produto;
import models.compositions.CestaCafeDaManha;
import models.compositions.CestaDeDoce;
import models.compositions.CestaDeSalgado;
import models.compositions.CestaMista;

public class Main {

    public static void main(String[] args) {
        FabricaAbstrata fabricaDoce = new FabricaDeDoce();
        FabricaAbstrata fabricaSalgado = new FabricaDeSalgado();
        CestaCafeDaManha cestaMista = new CestaMista();

        cestaMista.adicione(fabricaDoce.crieProduto("Bolo"));
        cestaMista.adicione(fabricaDoce.crieProduto("Brigadeiro"));
        cestaMista.adicione(fabricaDoce.crieProduto("Sorvete"));

        Produto coxinha = fabricaSalgado.crieProduto("Coxinha");
        Produto esfirra = fabricaSalgado.crieProduto("Esfirra");

        cestaMista.adicione(coxinha);
        cestaMista.adicione(esfirra);
        cestaMista.adicione(fabricaSalgado.crieProduto("Quibe"));

        System.out.println(cestaMista.obtenha(2));

        cestaMista.exclua(esfirra);
        cestaMista.exclua(coxinha);

        cestaMista.liste();
    }
}
