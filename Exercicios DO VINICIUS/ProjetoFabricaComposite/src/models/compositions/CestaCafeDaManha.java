package models.compositions;

import interfaces.Container;
import models.Produto;

import java.util.ArrayList;

public abstract class CestaCafeDaManha extends Produto implements Container {
    public CestaCafeDaManha(String tipo) {
        super(tipo);
        this.produtos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return tipo + "\n\t" + produtos;
    }

    @Override
    public void adicione(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void exclua(Produto produto) {
        if (!produtos.remove(produto))
            System.out.println("Produto não encontrado.");
    }

    @Override
    public Produto obtenha(int pos) {
        return produtos.get(pos);
    }

    @Override
    public String getTipo() {
        return tipo;
    }
    @Override
    public void liste() {
        System.out.println(this);
    }

    protected ArrayList<Produto> produtos;
}
