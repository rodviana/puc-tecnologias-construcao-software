package models;

public abstract class Brinde {
    @Override
    public String toString() {
        return "Brinde";
    }

    public abstract String getTipo();

    public abstract void setTipo(String tipo);

    public abstract void print();

    protected String tipo; // Garrafa, Caneca, Caneta

}
