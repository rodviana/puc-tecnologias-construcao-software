/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;


import Interface.Produto;
/**
 *
 * @author japa
 */
public abstract class Salgado implements Produto {
    protected String tipo;

    public Salgado(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
    
    @Override
    public void listar() {
        System.out.println("   |---Produto= " + this.getTipo());
    }    
}