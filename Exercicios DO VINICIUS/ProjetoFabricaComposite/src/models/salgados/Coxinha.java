package models.salgados;

import interfaces.Salgado;
import models.Produto;

public class Coxinha extends Produto implements Salgado {
    public Coxinha() {
        super("Coxinha");
    }

    @Override
    public void liste() {
        System.out.println(this);
    }

    @Override
    public String getTipo() {
        return tipo;
    }

//    @Override
//    public String toString() {
//        return "|---Produto = " + tipo;
//    }
}
