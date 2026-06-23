package models;

import factory.SalgadoIngredientesFactory;

public class Coxinha extends Salgado {
    private SalgadoIngredientesFactory ingredientes;
    public Coxinha(String massa, String molho, String recheio, SalgadoIngredientesFactory ingredientes) {
        super(massa, molho, recheio);
        this.ingredientes = ingredientes;
    }
}
