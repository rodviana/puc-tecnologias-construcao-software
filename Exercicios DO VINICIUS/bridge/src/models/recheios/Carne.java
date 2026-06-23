package models.recheios;

import interfaces.Recheio;

public class Carne implements Recheio {
    private String recheio;

    public Carne() {
        this.recheio = "Recheio de carne";
    }

    @Override
    public String getRecheio() {
        return recheio;
    }
}
