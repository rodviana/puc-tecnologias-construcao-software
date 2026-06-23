package models.salgados;

import interfaces.Salgado;
import models.Produto;

public class Esfirra extends Produto implements Salgado {
    public Esfirra() {
        super("Esfirra");
    }

    @Override
    public void liste() {
        System.out.println(this);
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}


