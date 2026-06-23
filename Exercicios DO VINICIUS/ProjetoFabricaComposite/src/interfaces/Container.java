package interfaces;

import models.Produto;

public interface Container {
    void adicione(Produto produto);
    void exclua(Produto produto);
    Produto obtenha(int pos);
    void liste();
}
