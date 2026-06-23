package models;

public class Porter extends Ales {
    public Porter() {
        this.tipo = "Porter";
    }

    @Override
    public void produza() {
        System.out.println(this);
    }
}
