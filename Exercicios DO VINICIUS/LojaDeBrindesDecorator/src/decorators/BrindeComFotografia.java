package decorators;

import models.Brinde;

public class BrindeComFotografia extends DecoradorDeBrinde {

    public BrindeComFotografia(Brinde brinde, String fotografia) {
        super(brinde);
        this.fotografia = fotografia;
    }

    @Override
    public String getTipo() {
        return toString();
    }

    @Override
    public void setTipo(String tipo) {
//        this.tipo = brinde.toString() + ' ' + tipo + ' ' + cor;
        brinde.setTipo(tipo + ' ' + fotografia);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return brinde.getTipo()  + ' ' + fotografia;
    }


    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    private String fotografia ;
}
