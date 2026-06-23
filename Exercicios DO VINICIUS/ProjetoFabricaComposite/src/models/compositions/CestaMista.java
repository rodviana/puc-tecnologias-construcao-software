package models.compositions;

import interfaces.Doce;
import interfaces.Salgado;
import models.Produto;

import java.util.ArrayList;

public class CestaMista extends CestaCafeDaManha {
    public CestaMista() {
        super("Cesta mista");
        this.cestaDeDoces = new CestaDeDoce();
        this.cestaDeSalgados = new CestaDeSalgado();
    }

    @Override
    public String toString() {
        return  tipo + '\n' +
                cestaDeDoces.toString() + '\n' +
                cestaDeSalgados.toString();
    }

    @Override
    public void adicione(Produto produto) {
        if (produto instanceof Salgado)
            cestaDeSalgados.adicione(produto);
        else if (produto instanceof Doce)
            cestaDeDoces.adicione(produto);
        else
            return;
        super.produtos.add(produto);
    }

    @Override
    public void exclua(Produto produto) {
        if (produto instanceof Salgado)
            cestaDeSalgados.exclua(produto);
        else if (produto instanceof Doce)
            cestaDeDoces.exclua(produto);
        else
            return;
        super.produtos.remove(produto);
    }

    @Override
    public Produto obtenha(int pos) {
        return super.obtenha(pos);
    }

    @Override
    public void liste() {
        System.out.println(this);
    }

    private CestaDeDoce cestaDeDoces;
    private CestaDeSalgado cestaDeSalgados;

}
