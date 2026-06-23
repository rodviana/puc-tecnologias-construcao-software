package models;

public abstract class Produto {
    public Produto(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "|---Produto = " + tipo;
    }

    protected abstract void liste();
    protected abstract String getTipo();

    protected String tipo;
}
