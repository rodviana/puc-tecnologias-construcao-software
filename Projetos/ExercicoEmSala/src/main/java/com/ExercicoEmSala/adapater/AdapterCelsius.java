package com.ExercicoEmSala.adapater;

import com.ExercicoEmSala.model.Celsius;
import com.ExercicoEmSala.model.Termometro;

public class AdapterCelsius implements Celsius {

    private Termometro fahrenheit;

    public AdapterCelsius(Termometro fahrenheit)
    {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public Double temperatura() {
        return  (fahrenheit.temperatura() - 32) * 5/9 ;
    }

    @Override
        public String toString()
        {
            return "Temperatura Celsius: "+ this.temperatura();
        }
}
