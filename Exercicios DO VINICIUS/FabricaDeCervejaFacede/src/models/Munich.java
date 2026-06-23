package models;

public class Munich extends Largers {
    public Munich() {
        this.tipo = tipo;
    }

    @Override
    public void produza() {
        System.out.println(this);
    }
}
