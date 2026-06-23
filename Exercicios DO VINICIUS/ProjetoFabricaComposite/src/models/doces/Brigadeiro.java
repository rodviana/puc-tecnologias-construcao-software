package models.doces;

import interfaces.Doce;
import models.Produto;

public class Brigadeiro extends Produto implements Doce {
    public Brigadeiro() {
        super("Brigadeiro");
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
