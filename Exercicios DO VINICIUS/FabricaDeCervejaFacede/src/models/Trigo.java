package models;

public class Trigo extends Ales {
    public Trigo() {
        this.tipo = "Trigo";
    }

    @Override
    public void produza() {
        System.out.println(this);
    }
}
