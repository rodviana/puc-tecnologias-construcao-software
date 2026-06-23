package com.company.imovel;

public class Imovel {
//    : Crie a classe Imovel, que possui um endereço (String) e um preço (double)
    private String endereco;

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private double preco;

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }
}
