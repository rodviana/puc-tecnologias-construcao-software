package models;

import interfaces.Container;
import interfaces.Produto;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Caixa implements Produto, Container {
    public Caixa(String nome) {
        this.preco = 0;
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    @Override
    public String getNome() {
        String nomes = "";
        for (Produto produto : produtos)
            nomes.concat('\n' + produto.getNome());
        return produtos.isEmpty() ? "Vazio" : nomes;
    }

    @Override
    public double getPreco() {
        double valor = 0;
        for (Produto produto : produtos)
            valor += produto.getPreco();
        return valor;
    }

    @Override
    public void imprima() {
        if (produtos.isEmpty()) {
            System.out.println("Caixa está vazia.");
            return;
        }
        System.out.println(toString());
    }

    @Override
    public boolean estaVazia() {
        return produtos.isEmpty();
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}\t[Valor = R$ {1}]\n{2}\n", nome, getPreco(), produtos);
    }

    private String nome;
    private double preco;

    private ArrayList<Produto> produtos;

    @Override
    public void adicione(Produto produto) {
            produtos.add(produto);
            preco += produto.getPreco();
    }

    @Override
    public void remova(Produto produto) {
        if (produtos.contains(produto))
            preco -= produto.getPreco();
    }
}
