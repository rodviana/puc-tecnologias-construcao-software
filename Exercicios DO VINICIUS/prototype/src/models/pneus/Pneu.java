package models.pneus;

public abstract class Pneu implements Cloneable {
    private String tipo;

    public Pneu(String tipo, int aro) {
        this.tipo = tipo;
        this.aro = aro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    private int aro;

    @Override
    public Pneu clone() throws CloneNotSupportedException {
        return (Pneu) super.clone();
    }

    @Override
    public String toString() {
        return "Pneu{" +
                "tipo='" + tipo + '\'' +
                ", aro=" + aro +
                ", ID=" + this.hashCode() +
                '}';
    }
}
