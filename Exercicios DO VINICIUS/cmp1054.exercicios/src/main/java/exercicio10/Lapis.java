package exercicio10;

public class Lapis implements Caneta{
    private String cor;

    public Lapis(String cor) {
        this.cor = cor;
    }

    @Override
    public void escreva(String texto) {
        System.out.println("Usando " + texto + "à caneta esferográfica.");
    }

    @Override
    public String getCor() {
        return this.cor;
    }
}
