package models;

public class Stout extends Ales {
    public Stout() {
        this.tipo = "Sout";
    }

    @Override
    public void produza() {
        System.out.println(this);
    }
}
