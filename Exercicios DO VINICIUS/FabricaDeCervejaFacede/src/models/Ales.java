package models;

import interfaces.Cerveja;

public abstract class Ales implements Cerveja {
    protected String tipo;

    @Override
    public String toString() {
        return "Ales " + tipo;
    }
}
