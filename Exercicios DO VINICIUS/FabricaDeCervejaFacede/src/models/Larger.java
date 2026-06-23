package models;

public class Larger extends Largers {
    public Larger() {
        this.tipo = "Larger";
    }

    @Override
    public void produza() {
        System.out.println(this);
    }
}
