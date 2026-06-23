package interfaces;

public interface Container {
    void adicione(Produto produto);
    void remova(Produto produto);
    void imprima();
    boolean estaVazia();
}
