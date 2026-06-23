package models;

import factory.SalgadoIngredientesFactory;

public class Empada extends Salgado {
    private SalgadoIngredientesFactory ingredientes;
    public Empada(String massa, String molho, String recheio, SalgadoIngredientesFactory ingredientes) {
        super(massa, molho, recheio);
        this.ingredientes = ingredientes;
    }
}
