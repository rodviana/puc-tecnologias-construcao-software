/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;


import Models.Empada;
import Models.Esfirra;
import Models.Salgado;

/**
 *
 * @author japa
 */
public class Assado {
    private Salgado empadinha;
    private Salgado esfirrinha;

    public Assado() {
        this.empadinha = new Empada();
        this.esfirrinha = new Esfirra();
    }
    
    public void fabricarEmpada()
    {
        empadinha.fabricar();
    }
    public void fabricarEsfirra()
    {
        esfirrinha.fabricar();
    }
}
