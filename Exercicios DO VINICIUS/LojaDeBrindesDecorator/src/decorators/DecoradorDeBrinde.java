package decorators;

import models.Brinde;

public abstract class DecoradorDeBrinde extends Brinde {
    protected Brinde brinde;

    protected DecoradorDeBrinde(Brinde brinde) {
        this.brinde = brinde;
    }
}
