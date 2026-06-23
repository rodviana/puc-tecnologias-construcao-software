package models.recheios;

import interfaces.Recheio;

public class Queijo implements Recheio {
    private String recheio;

    public Queijo() {
        this.recheio = "Recheio de queijo";
    }

    @Override
    public String getRecheio() {
        return recheio;
    }
}
