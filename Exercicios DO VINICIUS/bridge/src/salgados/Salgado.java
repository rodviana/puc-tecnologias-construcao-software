package salgados;

import interfaces.Produto;
import interfaces.Recheio;

public abstract class Salgado implements Produto {
    public Salgado(Recheio recheio) {
        this.recheio = recheio;
    }
    @Override
    public String produza() {
        return "Produzindo " + tipo +
                " com " + recheio.getRecheio() + ".";
    }
    protected Recheio recheio;
    protected String tipo;
}
