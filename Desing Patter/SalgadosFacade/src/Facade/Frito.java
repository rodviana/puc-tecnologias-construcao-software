/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;


import Models.Coxinha;
import Models.Quibe;
import Models.Salgado;

/**
 *
 * @author japa
 */
public class Frito {
    private Salgado quibinho;
    private Salgado miniCoxinha;

    public Frito() {
        this.quibinho = new Quibe();
        this.miniCoxinha = new Coxinha();
    }
    
    public void fabricarQuibe()
    {
        quibinho.fabricar();
    }
    public void fabricarCoxinha()
    {
        miniCoxinha.fabricar();
    }
}
