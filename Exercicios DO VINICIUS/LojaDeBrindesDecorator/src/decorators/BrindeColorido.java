package decorators;

import models.Brinde;

public class BrindeColorido extends DecoradorDeBrinde {

    public BrindeColorido(Brinde brinde, String cor) {
        super(brinde);
        this.cor = cor;
    }

    @Override
    public String getTipo() {
        return toString();
    }

    @Override
    public void setTipo(String tipo) {
//        this.tipo = brinde.toString() + ' ' + tipo + ' ' + cor;
        brinde.setTipo(tipo + ' ' + cor);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return brinde.getTipo()  + ' ' + cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    private String cor ;
}
