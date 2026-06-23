package com.ExercicoEmSala.decorator;

import com.ExercicoEmSala.model.Brinde;

public class BrindeFotografiaDecorator extends BrindeDecorator {

    public BrindeFotografiaDecorator(Brinde brinde, String fotografia) {
        super(brinde);
        super.decorator = fotografia;
    }

    @Override
    public String toString() {
        return brinde.toString() + "- com fotografia - " + super.decorator ;
    }
}
