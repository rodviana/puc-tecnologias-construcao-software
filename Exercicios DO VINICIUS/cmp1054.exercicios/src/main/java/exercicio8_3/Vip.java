package exercicio8_3;

public class Vip extends Ingresso {
    private double adicional;

    public Vip(double valor, double adicional) {
        super(valor);
        setAdicional(adicional);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public double getValor() {
        return this.getValor() + getAdicional();
    }
}
