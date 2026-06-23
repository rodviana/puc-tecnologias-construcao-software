/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author japa
 */
public class Xepa implements Produto{
    private String nome;
    private double valor;

    private List<Produto> Compras; // Estrutura "Arvore"

    public Xepa(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.Compras = new ArrayList<Produto>();
    }
    
    public void addProduto(Produto prod) {
        Compras.add(prod);
    }

    public void removeProduto(Produto prod) {
        Compras.remove(prod);
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
            
    @Override
    public void print() {
        Compras.forEach(Produto::print);
    }
}
