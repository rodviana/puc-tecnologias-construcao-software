package models.salgados;

import interfaces.Salgado;
import models.Produto;

public class Quibe extends Produto implements Salgado {
    public Quibe() {
        super("Quibe");
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

