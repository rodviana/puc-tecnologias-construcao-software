package models;

public class Garrafa extends Brinde {

    public Garrafa() {
        this.tipo = "Garrafa";
    }

    @Override
    public String getTipo() {
        return toString();
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.tipo;
    }
}
