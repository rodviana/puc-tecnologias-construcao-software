package exercicio10;

public class Giz implements Caneta{
    private String cor;

    public Giz(String cor) {
        this.cor = cor;
    }

    @Override
    public void escreva(String texto) {
        System.out.println("Usando " + texto + " com giz.");
    }

    @Override
    public String getCor() {
        return this.cor;
    }
}
