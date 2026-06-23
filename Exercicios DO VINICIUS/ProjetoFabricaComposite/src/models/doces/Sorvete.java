package models.doces;

import interfaces.Doce;
import models.Produto;

public class Sorvete extends Produto implements Doce {
    public Sorvete() {
        super("Sorvete");
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
