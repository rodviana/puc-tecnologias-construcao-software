package models;

public abstract class Salgado {
    protected String  massa;
    protected String molho;
    protected String recheio;

    public Salgado(String massa, String molho, String recheio) {
        this.massa = massa;
        this.molho = molho;
        this.recheio = recheio;
    }

    @Override
    public String toString() {
        return "Massa = " + massa +
                "\nMolho='" + molho +
                "\nRecheio='" + recheio;
    }
}
