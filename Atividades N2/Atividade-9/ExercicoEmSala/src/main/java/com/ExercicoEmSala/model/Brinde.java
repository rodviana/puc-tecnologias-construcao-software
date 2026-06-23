package com.ExercicoEmSala.model;

import lombok.Getter;
import lombok.Setter;

public abstract class Brinde {

    @Getter @Setter
    protected String decorator;

    @Override
    public String toString() {
        return "Brinde - " + this.decorator;
    }


}
