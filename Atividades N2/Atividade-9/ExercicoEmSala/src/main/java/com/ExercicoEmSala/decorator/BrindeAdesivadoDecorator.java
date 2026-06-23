package com.ExercicoEmSala.decorator;


import com.ExercicoEmSala.model.Brinde;

public class BrindeAdesivadoDecorator extends BrindeDecorator {

    public BrindeAdesivadoDecorator(Brinde brinde, String adesivo) {
        super(brinde);
        super.decorator = adesivo;
    }

    @Override
    public String toString() {
        return brinde.toString() + "- com adesivo - " + super.decorator;
    }
}
