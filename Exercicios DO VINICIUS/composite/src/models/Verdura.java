package models;

import interfaces.Produto;

import java.text.MessageFormat;

public class Verdura implements Produto {
    public Verdura(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return MessageFormat.format("\t|-------Produto = {0}\t[Valor = R$ {1}]\n", nome, getPreco());
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void imprima() {
        System.out.println(toString());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private String nome;
    private double preco;
}
