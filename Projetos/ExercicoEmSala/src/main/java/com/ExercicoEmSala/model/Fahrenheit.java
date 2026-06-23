package com.ExercicoEmSala.model;

public class Fahrenheit implements Termometro{

    Double temperatura;

    public Fahrenheit(Double temperatura)
    {
        this.temperatura = temperatura;
    }

    @Override
    public Double temperatura() {
        return temperatura;
    }

    @Override
    public String toString()
    {
        return "Temperatura Fahrenheit: " + this.temperatura();
    }
}
