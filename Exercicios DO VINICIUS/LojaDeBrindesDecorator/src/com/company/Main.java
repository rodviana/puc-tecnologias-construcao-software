package com.company;

import decorators.BrindeAdesivado;
import decorators.BrindeColorido;
import decorators.BrindeComFotografia;
import models.Brinde;
import models.Caneca;
import models.Caneta;
import models.Garrafa;

public class Main {

    public static void main(String[] args) {

          Brinde garrafaAzulTransformers = new BrindeAdesivado(
                  new BrindeColorido(new Garrafa(), "Azul"),
                  "Transformers"
          );

          Brinde canecaComFotografia = new BrindeComFotografia(
                  new Caneca(),
                  "Gatinho"
          );

          Brinde canetaAdesivadaMickeyMouse = new BrindeAdesivado(
                  new Caneta(), "Mickey Mouse"
          );

          garrafaAzulTransformers.print();
          canecaComFotografia.print();
          canetaAdesivadaMickeyMouse.print();
    }
}
