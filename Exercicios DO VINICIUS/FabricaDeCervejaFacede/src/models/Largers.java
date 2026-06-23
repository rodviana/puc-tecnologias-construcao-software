package models;

import interfaces.Cerveja;

public abstract class Largers implements Cerveja {
    protected String tipo;
    @Override
    public String toString() {
        return "Larger " + tipo;
    }
}
