package decorators;

import models.Brinde;

public class BrindeAdesivado extends DecoradorDeBrinde {

    public BrindeAdesivado(Brinde brinde, String adesivo) {
        super(brinde);
        this.adesivo = adesivo;
    }

    @Override
    public String getTipo() {
        return toString();
    }

    @Override
    public void setTipo(String tipo) {
//        this.tipo = brinde.toString() + ' ' + tipo + ' ' + cor;
        brinde.setTipo(tipo + ' ' + adesivo);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return brinde.getTipo()  + ' ' + adesivo;
    }

    private String adesivo;
}
