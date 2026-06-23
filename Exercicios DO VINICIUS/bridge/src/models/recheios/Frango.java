package models.recheios;

import interfaces.Recheio;

public class Frango implements Recheio {
    private String recheio;

    public Frango() {
        this.recheio = "Recheio de frango";
    }

    @Override
    public String getRecheio() {
        return recheio;
    }
}