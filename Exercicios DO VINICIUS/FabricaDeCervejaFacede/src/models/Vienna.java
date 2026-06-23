package models;

public class Vienna extends Largers {
    public Vienna() {
        this.tipo = "Viena";
    }

    @Override
    public void produza() {
        System.out.println(this);
    }
}
