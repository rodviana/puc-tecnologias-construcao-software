/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Models.Ale;
import Models.Porter;
import Models.Stout;
import Models.Trigo;

/**
 *
 * @author japa
 */
public class Ales {
    private Trigo trigo;
    private Stout stout;
    private Porter porter;
    private Ale ale;

    public Ales() {
        this.trigo = new Trigo();
        this.stout = new Stout();
        this.porter = new Porter();
        this.ale = new Ale();
    }
    
    public void fabricarTrigo()
    {
        trigo.produzir();
    }
    public void fabricarStout()
    {
        stout.produzir();
    }
    public void fabricarPorter()
    {
        porter.produzir();
    }
    public void fabricarAle()
    {
        ale.produzir();
    }    
}
