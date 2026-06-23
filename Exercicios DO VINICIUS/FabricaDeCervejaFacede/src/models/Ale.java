package models;

public class Ale extends Ales {
    public Ale() {
        this.tipo = "Ale";
    }

    @Override
    public void produza() {
        System.out.println(this);
    }
}
