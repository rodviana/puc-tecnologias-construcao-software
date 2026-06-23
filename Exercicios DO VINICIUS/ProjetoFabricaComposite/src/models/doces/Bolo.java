package models.doces;

import interfaces.Doce;
import models.Produto;

public class Bolo extends Produto implements Doce {
    public Bolo() {
        super("Bolo");
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
