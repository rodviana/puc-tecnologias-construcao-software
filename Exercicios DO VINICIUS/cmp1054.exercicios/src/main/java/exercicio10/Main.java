package exercicio10;

public class Main {
    public static void main(String[] args) {
        Esferografica esferografica = new Esferografica("azul");
        Giz giz = new Giz("verde");
        Lapis lapis = new Lapis("preto");
        escrevaTexto(esferografica, "Teste de escrita");
        escrevaTexto(giz, "Teste de escrita");
        escrevaTexto(lapis, "Teste de escrita");
    }

    public static void escrevaTexto(Caneta c, String texto) {
        c.escreva(texto);
        c.escreva("Cor = " + c.getCor());
    }
}
