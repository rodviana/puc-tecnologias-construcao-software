package com.ExercicoEmSala.decorator;


import com.ExercicoEmSala.model.Brinde;

public class BrindeColoridoDecorator extends BrindeDecorator {

    public BrindeColoridoDecorator(Brinde brinde, String cor) {
        super(brinde);
        super.decorator = cor;
    }


    @Override
    public String toString() {
        return brinde.toString() + "- cor - " + super.decorator ;
    }
}
