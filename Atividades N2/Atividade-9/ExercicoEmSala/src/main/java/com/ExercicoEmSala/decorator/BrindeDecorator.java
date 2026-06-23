package com.ExercicoEmSala.decorator;


import com.ExercicoEmSala.model.Brinde;

public abstract class BrindeDecorator extends Brinde {

    protected Brinde brinde;

    protected BrindeDecorator(Brinde brinde) {
        this.brinde = brinde;
    }
}
