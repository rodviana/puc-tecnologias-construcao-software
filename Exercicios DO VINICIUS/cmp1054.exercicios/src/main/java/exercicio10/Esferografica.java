package exercicio10;

public class Esferografica implements Caneta{
    private String cor;

    public Esferografica(String cor) {
        this.cor = cor;
    }

    @Override
    public void escreva(String texto) {
        System.out.println("Usando " + texto + " à caneta esferográfica.");
    }

    @Override
    public String getCor() {
        return this.cor;
    }
}
